package com.stockbroker.dashboard.service;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.stockbroker.dashboard.model.StockData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PDFGeneratorService {

    private final StockDataService stockDataService;

    public ByteArrayInputStream generateStockReport() {
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            Document document = new Document();
            PdfWriter.getInstance(document, out);
            document.open();

            // Title
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 20);
            Paragraph title = new Paragraph("Stock Report", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            document.add(new Paragraph("\n"));

            // Fetch Stock Data
            List<StockData> stockList = stockDataService.getAllStockData();

            if (stockList.isEmpty()) {
                document.add(new Paragraph("No stock data available."));
            } else {
                // Create Table
                PdfPTable table = new PdfPTable(4); // 4 Columns: ID, Symbol, Price, Volume
                table.setWidthPercentage(100);
                table.setSpacingBefore(10f);

                // Add Table Headers
                Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
                table.addCell(new Phrase("Stock ID", headerFont));
                table.addCell(new Phrase("Stock Symbol", headerFont));
                table.addCell(new Phrase("Price (USD)", headerFont));
                table.addCell(new Phrase("Volume", headerFont));

                // Add Stock Data Rows
                for (StockData stock : stockList) {
                    table.addCell(String.valueOf(stock.getId()));
                    table.addCell(stock.getSymbol());  // ✅ Replaced getName() with getSymbol()
                    table.addCell(String.valueOf(stock.getPrice()));
                    table.addCell(String.valueOf(stock.getVolume()));
                }

                document.add(table);
            }

            document.close();
            return new ByteArrayInputStream(out.toByteArray());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

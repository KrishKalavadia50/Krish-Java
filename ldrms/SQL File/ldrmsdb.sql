-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 25, 2022 at 08:34 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ldrmsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbladmin`
--

CREATE TABLE `tbladmin` (
  `ID` int(10) NOT NULL,
  `AdminName` varchar(120) DEFAULT NULL,
  `UserName` varchar(50) DEFAULT NULL,
  `MobileNumber` bigint(10) DEFAULT NULL,
  `Email` varchar(200) DEFAULT NULL,
  `Password` varchar(200) DEFAULT NULL,
  `AdminRegdate` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbladmin`
--

INSERT INTO `tbladmin` (`ID`, `AdminName`, `UserName`, `MobileNumber`, `Email`, `Password`, `AdminRegdate`) VALUES
(1, 'Admin', 'admin', 8989898911, 'admin@gmail.com', 'f925916e2754e5e03f75dd58a5733251', '2019-09-17 06:49:29');

-- --------------------------------------------------------

--
-- Table structure for table `tblbooking`
--

CREATE TABLE `tblbooking` (
  `ID` int(10) NOT NULL,
  `BookingNumber` int(10) DEFAULT NULL,
  `UserID` int(10) DEFAULT NULL,
  `ProductID` int(10) DEFAULT NULL,
  `FromDate` date DEFAULT NULL,
  `ToDate` date DEFAULT NULL,
  `UsedFor` varchar(250) DEFAULT NULL,
  `Quantity` int(10) DEFAULT NULL,
  `DeliveryAddress` mediumtext DEFAULT NULL,
  `AddressProof` varchar(250) DEFAULT NULL,
  `DateofBooking` timestamp NULL DEFAULT current_timestamp(),
  `TotalCost` decimal(10,0) DEFAULT NULL,
  `Remark` varchar(250) DEFAULT NULL,
  `Status` varchar(250) DEFAULT NULL,
  `RemarkDate` timestamp NULL DEFAULT NULL ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblbooking`
--

INSERT INTO `tblbooking` (`ID`, `BookingNumber`, `UserID`, `ProductID`, `FromDate`, `ToDate`, `UsedFor`, `Quantity`, `DeliveryAddress`, `AddressProof`, `DateofBooking`, `TotalCost`, `Remark`, `Status`, `RemarkDate`) VALUES
(1, 169354933, 4, 1, '2022-07-14', '2022-08-07', 'Corporate', 50, 'ghfhfdhgasdfghs', 'ecebbecf28c2692aeb021597fbddb174.jpg', '2022-07-12 10:39:40', '600000', 'Approved', 'Approved', '2022-07-12 13:39:58'),
(2, 684980827, 4, 6, '2022-07-17', '2022-07-23', 'Individual', 2, 'dfrtghyututf', 'ecebbecf28c2692aeb021597fbddb174.jpg', '2022-07-12 10:40:48', '5460', 'Unapproved', 'Unapproved', '2022-07-14 09:24:23'),
(3, 531427662, 8, 2, '2022-07-26', '2022-07-30', 'Individual', 4, 'A1223 XYZ Street New Delhi', '305026d4af935ad4e8d20f641bde1b85.png', '2022-07-25 05:06:02', NULL, NULL, NULL, NULL),
(4, 143024627, 9, 3, '2022-07-30', '2022-08-05', 'Individual', 1, 'D232 ABC Street New Delhi', 'c4493008b023313d9e5213d9e609a348.png', '2022-07-25 05:24:08', '3000', 'Booking has been confirmed', 'Approved', '2022-07-25 05:25:38');

-- --------------------------------------------------------

--
-- Table structure for table `tblbrand`
--

CREATE TABLE `tblbrand` (
  `ID` int(10) NOT NULL,
  `BrandName` varchar(200) DEFAULT NULL,
  `BrandLogo` varchar(200) DEFAULT NULL,
  `CreationDate` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblbrand`
--

INSERT INTO `tblbrand` (`ID`, `BrandName`, `BrandLogo`, `CreationDate`) VALUES
(1, 'Dell', 'c26be60cfd1ba40772b5ac48b95ab19b.png', '2022-07-07 14:22:24'),
(2, 'Lenovo', 'b64810fde7027715e614449aff1d595f.png', '2022-07-07 14:27:11'),
(3, 'HP', '7e37e190b81669d7bd5c1bb6f277b427.png', '2022-07-11 12:50:06'),
(4, 'Acer', '37e2b52f19da778fba43ab3c1897f840.png', '2022-07-11 12:50:51'),
(5, 'Asus', 'f6aac84a83343a247532b533b0ef059f.png', '2022-07-11 12:51:48'),
(6, 'Apple', 'd3ffef2884ab739b1b29ad6af518b82a.png', '2022-07-11 12:52:34'),
(7, 'Huawei', '1e6ae4ada992769567b71815f124fac5.jpg', '2022-07-11 12:53:30'),
(8, 'Microsoft', 'dc78d13a95344a4147b0b2657c851cda.png', '2022-07-11 12:54:14'),
(9, 'Panasonic', 'fda678910bfe16cf8364d4f432abba00.png', '2022-07-11 12:54:51'),
(10, 'Realme', 'efc1a80c391be252d7d777a437f86870.jpg', '2022-07-11 12:55:40');

-- --------------------------------------------------------

--
-- Table structure for table `tblpage`
--

CREATE TABLE `tblpage` (
  `ID` int(10) NOT NULL,
  `PageType` varchar(200) DEFAULT NULL,
  `PageTitle` mediumtext DEFAULT NULL,
  `PageDescription` mediumtext DEFAULT NULL,
  `Email` varchar(200) DEFAULT NULL,
  `MobileNumber` bigint(10) DEFAULT NULL,
  `UpdationDate` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblpage`
--

INSERT INTO `tblpage` (`ID`, `PageType`, `PageTitle`, `PageDescription`, `Email`, `MobileNumber`, `UpdationDate`) VALUES
(1, 'aboutus', 'About Us', 'Laptop and Desktop Rental is a self-drive brand owned XYZ second-largest laptop and desktop rental company currently managing more than 1lkh laptop and desktop in our fleet in India.The first and foremost mission for XYZ is to fulfill customer needs around rental in the most flexible and economical manner. Coupled with a keen eye on customer satisfaction like time of delivery, flexible period of renting, full invoices for rentals, XYZ  is the preferred choice for several individual and corporate customers.', NULL, NULL, '2022-07-25 05:09:45'),
(2, 'contactus', 'Contact Us', '#890 CFG Apartment, Mayur Vihar, Delhi-India', 'info@gmail.com', 7894561239, '2022-07-07 16:43:05');

-- --------------------------------------------------------

--
-- Table structure for table `tblproduct`
--

CREATE TABLE `tblproduct` (
  `ID` int(5) NOT NULL,
  `Type` varchar(50) DEFAULT NULL,
  `BrandID` int(5) DEFAULT NULL,
  `ProductName` varchar(250) DEFAULT NULL,
  `Processor` varchar(250) DEFAULT NULL,
  `Screen` varchar(200) DEFAULT NULL,
  `RAM` varchar(100) DEFAULT NULL,
  `Storage` varchar(250) DEFAULT NULL,
  `Charges` varchar(250) DEFAULT NULL,
  `RentalPrice` decimal(10,0) DEFAULT NULL,
  `ProductModel` varchar(250) DEFAULT NULL,
  `ProductDescription` mediumtext DEFAULT NULL,
  `Image` varchar(250) DEFAULT NULL,
  `Image1` varchar(250) DEFAULT NULL,
  `Image2` varchar(250) DEFAULT NULL,
  `Image3` varchar(250) DEFAULT NULL,
  `Image4` varchar(250) DEFAULT NULL,
  `Image5` varchar(250) DEFAULT NULL,
  `CreationDate` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblproduct`
--

INSERT INTO `tblproduct` (`ID`, `Type`, `BrandID`, `ProductName`, `Processor`, `Screen`, `RAM`, `Storage`, `Charges`, `RentalPrice`, `ProductModel`, `ProductDescription`, `Image`, `Image1`, `Image2`, `Image3`, `Image4`, `Image5`, `CreationDate`) VALUES
(1, 'Desktop', 3, 'Core i5 16 GB RAM 500 GB HDD Desktop', 'Intel Core i5', '22\"', '16 GB', '500 GB', 'NA', '500', 'core456', 'Desktop with Intel i5 processor, 16 GB RAM, 500 GB HDD and 22\" monitor. Accessories include keyboard, mouse, webcam (depending on availability) and cables', '2b2eef7abd36ac18b50257b8dfc7aa1d.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', 'b9fb9d37bdf15a699bc071ce49baea531657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '7fdc1a630c238af0815181f9faa190f51657204436.jpg', 'cb23eb24bacb40415b17fc1a8f95a4201657204436.jpg', '2022-07-07 14:33:56'),
(2, 'Desktop', 2, 'Core i5 16 GB RAM 500 GB HDD Desktop', 'Intel Core i5', '22\"', '16 GB', '500 GB', 'NA', '500', 'core456', 'Desktop with Intel i5 processor, 16 GB RAM, 500 GB HDD and 22\" monitor. Accessories include keyboard, mouse, webcam (depending on availability) and cables', '7fdc1a630c238af0815181f9faa190f5.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', 'b9fb9d37bdf15a699bc071ce49baea531657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '7fdc1a630c238af0815181f9faa190f51657204436.jpg', 'cb23eb24bacb40415b17fc1a8f95a4201657204436.jpg', '2022-07-07 14:33:56'),
(3, 'Desktop', 1, 'Core i5 16 GB RAM 500 GB HDD Desktop', 'Intel Core i5', '22\"', '16 GB', '500 GB', 'NA', '500', 'core456', 'Desktop with Intel i5 processor, 16 GB RAM, 500 GB HDD and 22\" monitor. Accessories include keyboard, mouse, webcam (depending on availability) and cables', '6212e70785120b3ac20dbce5346c3662.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', 'b9fb9d37bdf15a699bc071ce49baea531657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '7fdc1a630c238af0815181f9faa190f51657204436.jpg', 'cb23eb24bacb40415b17fc1a8f95a4201657204436.jpg', '2022-07-07 14:33:56'),
(4, 'Laptop', 9, 'Core i5 16 GB RAM 500 GB HDD Desktop', 'Intel Core i5', '22\"', '16 GB', '500 GB', 'NA', '450', 'core456', 'Desktop with Intel i5 processor, 16 GB RAM, 500 GB HDD and 22\" monitor. Accessories include keyboard, mouse, webcam (depending on availability) and cables', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', 'b9fb9d37bdf15a699bc071ce49baea531657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '7fdc1a630c238af0815181f9faa190f51657204436.jpg', 'cb23eb24bacb40415b17fc1a8f95a4201657204436.jpg', '2022-07-07 14:33:56'),
(5, 'Laptop', 8, 'Core i5 16 GB RAM 500 GB HDD Desktop', 'Intel Core i5', '22\"', '16 GB', '500 GB', 'NA', '300', 'core456', 'Desktop with Intel i5 processor, 16 GB RAM, 500 GB HDD and 22\" monitor. Accessories include keyboard, mouse, webcam (depending on availability) and cables', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', 'b9fb9d37bdf15a699bc071ce49baea531657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '7fdc1a630c238af0815181f9faa190f51657204436.jpg', 'cb23eb24bacb40415b17fc1a8f95a4201657204436.jpg', '2022-07-07 14:33:56'),
(6, 'Laptop', 7, 'Core i5 16 GB RAM 500 GB HDD Desktop', 'Intel Core i5', '22\"', '16 GB', '500 GB', 'NA', '455', 'core456', 'Desktop with Intel i5 processor, 16 GB RAM, 500 GB HDD and 22\" monitor. Accessories include keyboard, mouse, webcam (depending on availability) and cables', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', 'b9fb9d37bdf15a699bc071ce49baea531657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '7fdc1a630c238af0815181f9faa190f51657204436.jpg', 'cb23eb24bacb40415b17fc1a8f95a4201657204436.jpg', '2022-07-07 14:33:56'),
(7, 'Laptop', 6, 'Core i5 16 GB RAM 500 GB HDD Desktop', 'Intel Core i5', '22\"', '16 GB', '500 GB', 'NA', '600', 'core456', 'Desktop with Intel i5 processor, 16 GB RAM, 500 GB HDD and 22\" monitor. Accessories include keyboard, mouse, webcam (depending on availability) and cables', '5c642ec854a6a92a56d7ebf0b9648eea.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', 'b9fb9d37bdf15a699bc071ce49baea531657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '7fdc1a630c238af0815181f9faa190f51657204436.jpg', 'cb23eb24bacb40415b17fc1a8f95a4201657204436.jpg', '2022-07-07 14:33:56'),
(8, 'Laptop', 5, 'Core i5 16 GB RAM 500 GB HDD Desktop', 'Intel Core i5', '22\"', '16 GB', '500 GB', 'NA', '500', 'core456', 'Desktop with Intel i5 processor, 16 GB RAM, 500 GB HDD and 22\" monitor. Accessories include keyboard, mouse, webcam (depending on availability) and cables', '19c10f4e66067da4b5eb1dac874e4672.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', 'b9fb9d37bdf15a699bc071ce49baea531657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '7fdc1a630c238af0815181f9faa190f51657204436.jpg', 'cb23eb24bacb40415b17fc1a8f95a4201657204436.jpg', '2022-07-07 14:33:56'),
(9, 'Laptop', 4, 'Core i5 16 GB RAM 500 GB HDD Desktop', 'Intel Core i5', '22\"', '16 GB', '500 GB', 'NA', '700', 'core456', 'Desktop with Intel i5 processor, 16 GB RAM, 500 GB HDD and 22\" monitor. Accessories include keyboard, mouse, webcam (depending on availability) and cables', 'cff8ad28cf40ebf4fbdd383fe546098d.jpg', '74375080377499ab76dad37484ee7f15.jpg', 'b9fb9d37bdf15a699bc071ce49baea531657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '7fdc1a630c238af0815181f9faa190f51657204436.jpg', 'cb23eb24bacb40415b17fc1a8f95a4201657204436.jpg', '2022-07-07 14:33:56'),
(10, 'Laptop', 3, 'Core i5 16 GB RAM 500 GB HDD Desktop', 'Intel Core i5', '22\"', '16 GB', '500 GB', 'NA', '400', 'core456', 'Desktop with Intel i5 processor, 16 GB RAM, 500 GB HDD and 22\" monitor. Accessories include keyboard, mouse, webcam (depending on availability) and cables', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', 'b9fb9d37bdf15a699bc071ce49baea531657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '7fdc1a630c238af0815181f9faa190f51657204436.jpg', 'cb23eb24bacb40415b17fc1a8f95a4201657204436.jpg', '2022-07-07 14:33:56'),
(11, 'Laptop', 2, 'Core i5 16 GB RAM 500 GB HDD Desktop', 'Intel Core i5', '22', '16 GB', '500 GB', 'NA', '800', 'core456', 'Desktop with Intel i5 processor, 16 GB RAM, 500 GB HDD and 22\" monitor. Accessories include keyboard, mouse, webcam (depending on availability) and cables', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', 'b9fb9d37bdf15a699bc071ce49baea531657204436.jpg', '2b2eef7abd36ac18b50257b8dfc7aa1d1657204436.jpg', '7fdc1a630c238af0815181f9faa190f51657204436.jpg', 'cb23eb24bacb40415b17fc1a8f95a4201657204436.jpg', '2022-07-07 14:33:56');

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

CREATE TABLE `tbluser` (
  `ID` int(10) NOT NULL,
  `FirstName` varchar(120) DEFAULT NULL,
  `LastName` varchar(120) DEFAULT NULL,
  `Email` varchar(120) DEFAULT NULL,
  `MobileNumber` bigint(20) DEFAULT NULL,
  `Password` varchar(120) DEFAULT NULL,
  `RegDate` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`ID`, `FirstName`, `LastName`, `Email`, `MobileNumber`, `Password`, `RegDate`) VALUES
(1, 'Rishi', 'Bhardwaj', 'rishi@gmail.com', 5646545645, '202cb962ac59075b964b07152d234b70', '2019-09-21 07:13:47'),
(2, 'Meenakashi', 'Singh', 'singh@gmail.com', 9878775464, '202cb962ac59075b964b07152d234b70', '2019-09-21 07:16:30'),
(3, 'Devesh', 'Gupta', 'devesh@gmail.com', 5656565656, '202cb962ac59075b964b07152d234b70', '2019-09-21 07:17:00'),
(4, 'Abir', 'Rahwans', 'abir@gmail.com', 2556444557, '202cb962ac59075b964b07152d234b70', '2019-09-21 07:17:35'),
(5, 'Perth', 'Kaushal', 'perth@gmail.com', 3232565690, '202cb962ac59075b964b07152d234b70', '2019-09-21 07:18:10'),
(6, 'Shagun', 'Mishra', 'shagun@gmail.com', 7897978798, '202cb962ac59075b964b07152d234b70', '2019-10-14 12:48:28'),
(7, 'Anuj', ' kumar', 'anc@test.com', 1234567809, '5c428d8875d2948607f3e3fe134d71b4', '2019-12-14 05:02:04'),
(8, 'Kumar', 'abc', 'abc@gmail.com', 9798797897, '202cb962ac59075b964b07152d234b70', '2022-07-11 06:42:00'),
(9, 'John ', 'Doe', 'jdoe@gmail.com', 1212343455, 'f925916e2754e5e03f75dd58a5733251', '2022-07-25 05:23:22');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbladmin`
--
ALTER TABLE `tbladmin`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tblbooking`
--
ALTER TABLE `tblbooking`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tblbrand`
--
ALTER TABLE `tblbrand`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `BrandName` (`BrandName`);

--
-- Indexes for table `tblpage`
--
ALTER TABLE `tblpage`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tblproduct`
--
ALTER TABLE `tblproduct`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tbluser`
--
ALTER TABLE `tbluser`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbladmin`
--
ALTER TABLE `tbladmin`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tblbooking`
--
ALTER TABLE `tblbooking`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tblbrand`
--
ALTER TABLE `tblbrand`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tblpage`
--
ALTER TABLE `tblpage`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tblproduct`
--
ALTER TABLE `tblproduct`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `tbluser`
--
ALTER TABLE `tbluser`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

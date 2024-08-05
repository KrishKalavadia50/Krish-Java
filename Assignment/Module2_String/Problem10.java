package module2_String.com;

/* W.A.J.P to find all interleaving of given strings.
The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ
*/
public class Problem10 {
    public static void main(String[] args) {
        String s1 = "WX";
        String s2 = "YZ";
        String result = "";

        generateInterleavings(s1, s2, result, 0, 0);

    }

    public static void generateInterleavings(String s1, String s2, String result, int i, int j) {

        if (i == s1.length() && j == s2.length()) {
            System.out.println(result);
            return;
        }

        if (i < s1.length()) {
            generateInterleavings(s1, s2, result + s1.charAt(i), i + 1, j);
        }

        if (j < s2.length()) {
            generateInterleavings(s1, s2, result + s2.charAt(j), i, j + 1);
        }
    }
}

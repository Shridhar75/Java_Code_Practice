package String;
//Using String Comparison Functions
public class StringCompare_1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        // Compare the strings using compareTo
        if (s1.compareTo(s2) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

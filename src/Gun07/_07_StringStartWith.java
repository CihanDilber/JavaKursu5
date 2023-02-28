package Gun07;

public class _07_StringStartWith {
    public static void main(String[] args) {
        // bununla basliyor mu?
        // sonuc true veya false

        String text="HCL Teknoloji";

        System.out.println("text.startsWith(\"HC\") = " + text.startsWith("HC"));  // true
        System.out.println("text.startsWith(\"HC\") = " + text.startsWith("te"));  // false
        System.out.println("text.startsWith(\"HC\") = " + text.startsWith("h"));   // false
    }
}

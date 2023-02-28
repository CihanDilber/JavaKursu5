package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığı yazdırınız
        // VAR ve YOK şeklinde

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz ");
        String cumle = scan.nextLine().toLowerCase(); // butun buyuk harfler kucuk oldu bu sayede


        if (cumle.contains("a"))
            System.out.println("VAR");

        if (!cumle.contains("a"))
            System.out.println("YOK");





    }
}

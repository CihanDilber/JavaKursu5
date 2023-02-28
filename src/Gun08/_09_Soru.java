package Gun08;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        // girilen bir cümledeki ilk kelimeyi yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println(" bir cumle girin ");
        String cumle = scan.nextLine();

        // bugun hava sicak;   substring yapacagiz  // bosluk bana siniri veriyor

        int boslukIndex =cumle.indexOf(" ");
        String ilkKelime=cumle.substring(0, boslukIndex);
        System.out.println("ilkKelime = " + ilkKelime);


    }
}

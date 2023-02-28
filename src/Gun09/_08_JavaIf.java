package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // kullanicinin 2 kez girecegi sifresinin ayni oldugunu AYNI veya DEGIL seklinde cevaplayiniz
        // confirm new password

        Scanner scan = new Scanner(System.in);
        System.out.println("sifre giriniz : ");
        String sifre1 = scan.nextLine();

        System.out.println("tekrar sifrenizi giriniz : ");
        String sifre2 = scan.nextLine();

        if (sifre1.equals(sifre2))
            System.out.println("AYNI");

        if (!sifre1.equals(sifre2))
            System.out.println("DEGIL");









    }
}

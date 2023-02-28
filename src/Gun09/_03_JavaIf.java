package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {

        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.println(" lutfen bir sayi daha giriniz : ");
        int sayi2 = scan.nextInt();

        if (sayi1>sayi2)

            System.out.println("sayi bir buyuktur" + sayi1);

        if (sayi2>sayi1)

            System.out.println("sayi iki buyuktur" + sayi2);

        if (sayi1==sayi2)   // sayi 1 esitse sayi2 ye demek

            System.out.println("sayi1 sayi2 esittir =");



    }
}

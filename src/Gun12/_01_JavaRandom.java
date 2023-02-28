package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // bu zamana kadar hep 0-5 arasi gibi sayilar urettik, hep sifirdan basladi
        // 4-9 arasi nasil uretirdim
        // yontem su : once aradaki fark kadar normal uret (9-4) yani 0-5 arasi  // farkini alip minimum ekliyoruz kisaca
        // uretilmis olan sayiya minimum sayiyi ekle, uretilmis sayi +4
        // (int)(Math.Random()*(max-min)+min

        // girilen max ve min araliginda random sayi urettiriniz

        Scanner scan =new Scanner(System.in);
        System.out.println("Min=");
        int min= scan.nextInt();

        System.out.println("Max");
        int max= scan.nextInt();

        int rndSayi= (int)(Math.random()*(max-min)) +min ;   // tam sayiya donmesi icin int yaziyoruz basina
        System.out.println("rndSayi = " + rndSayi);


    }
}

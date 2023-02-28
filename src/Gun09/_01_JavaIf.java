package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // baklava dilimi -->> if demek
        // girilen bir sayi 10 dan buyuk ise ekrana 10 dan buyuk yazdiriniz
        // Algoritma da soyle yaptik;
        //1 basla
        //2 sayi oku
        //3 sayi >10 ise "10 dan buyuk yaz"  -->> if ( sayi >10) sout...
        //4 Dur

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz= ");
        int sayi = scan.nextInt();

        if (sayi>10)   // burada ; yok dikkat
        { // if sarti saglandiginda yapilacaklarin parantezi bu ikisi   // bir tane islem yaoilacaksa parantez e gerek yok
            // birden fazla olacaksa {} bunlari koymaliyiz.
            System.out.println("10 dan buyuk");
            System.out.println("if in icinde birden fazla komut var ise if parantezleri sarttir");
    }


    }
}

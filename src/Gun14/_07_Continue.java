package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {

        // kullanicidan 5 sayi isteyiniz
        // bu sayilardan 6 ile 10 arasindakiler haric digerlerini toplasin

        Scanner scan=new Scanner(System.in);

        int toplam=0;

        for(int i=0; i<5; i++)
        {
            System.out.print("bir sayi giriniz : ");
            int sayi= scan.nextInt();

            if (sayi>=6 && sayi<=10)
                continue;   // calistigi anda kendinden sonra gelen komutlari pas gecirir.

            toplam=toplam+sayi;
            System.out.println("toplam = " + toplam);
        }
    }
}
// BREAK ve CONTINUE
//Döngüleri etkiler
//if şartı ile çalışır
//Break döngüyü kırar.
//Continue ise sadece o adımı
//pass geçirir.döngü devam eder
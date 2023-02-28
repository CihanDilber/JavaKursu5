package Gun43;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {


            // burada hatayi kontrol altina aldik artik program kesilmiyor
            System.out.println("program basladi");
            // hatanin olma ihtimali olan bolgeye serit cekiyoruz try catch ile
            try { // hata bolgesini try{} icine aldik
                Scanner scan = new Scanner(System.in);

                System.out.println("sayi1=");
                int sayi1 = scan.nextInt();

                System.out.println("Sayi2=");
                int sayi2 = scan.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bolum = " + bolum);
            } catch (Exception hata) {// hata mesajlarini hata isimli exception cinsinden degiskene attim
                System.out.println("hata.getMessage() = " + hata.getMessage()); // ingilizce aciklamasi get message
                System.out.println("Lutfen tekrar deneyiniz");
                i--;
            }
        }

        System.out.println("Program bitti");
    }
}

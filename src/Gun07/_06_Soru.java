package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad) iki isim degil yani

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen adinizi soyadinizi yaziniz : ");
        String adSoyad=scan.nextLine();

        // ismet temur olsaydi veya ali koc
        // ad : 0 dan baslar boslugun indexine kadar gider
        // soyad : bosluk + 1 den sonuna kadar gider

        int boslukIndex=adSoyad.indexOf(" ");   // bosluk indeksi bulduk burada
        String ad= adSoyad.substring(0, boslukIndex);   // 0 dan bosluga kadar aldik
        String soyad= adSoyad.substring(boslukIndex+1); // boslugu almasin diye +1 dedik

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);


    }
}

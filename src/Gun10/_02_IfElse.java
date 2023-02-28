package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {

        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        // ortalama icin topla ikiye bol yapiyoruz

        Scanner scan =new Scanner(System.in);
        System.out.print("vize notunu giriniz");
        double vizeNotu= scan.nextDouble();

        System.out.print("final notunu girin");
        double finalNotu= scan.nextDouble();


        double ortalama= (vizeNotu+finalNotu)/2;


        if (ortalama >= 60) {
            System.out.println("gectiniz, tebrikler");
        }

        else {
            System.out.println("Kaldiniz");
        }

        // suslu parantez kurali bir satir calisacak ise zorunlu degil.
        // birden fazla ise zorunlu. her zaman koyulabilir. bir mahsuru yok.





    }
}

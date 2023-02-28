package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Notu giriniz =");
        int ogrNot = scan.nextInt();

        // 1. yontem (onceki)
        if (ogrNot>=50)
            System.out.println("gectiniz");

        if (ogrNot<50)
            System.out.println("kaldiniz");

        // 2. yontem olmasi gereken
        if (ogrNot>=50) {                // suslu parantezleri her halukarda koyarsak iyi olur. burada birden fazla var zaten kullanacaguz mecbur
            System.out.println("Gectiniz");  //evet
            System.out.println("tebrikler");
        }

        else {  // degilse yapilacaklar
            System.out.println("kaldiniz"); //hayir
        }

    }
}

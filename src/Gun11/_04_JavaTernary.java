package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.

        // burasi iki ihtimalli olan

        Scanner scan =new Scanner(System.in);
        System.out.println("sayi=");
        int sayi =scan.nextInt();

        // 1.Yontem
        System.out.println(  (sayi>50 ? 1 : 0)  );   // sayi kucuk 50 ise 1 yaz degilse 0 yaz diyoruz
                                                     // 1 ve 0 i tirnak icine alsanda olur almasanda.

        // 2. yontem

        int sonuc=(sayi>50) ? 1 : 0;
        System.out.println("sonuc = " + sonuc);



    }
}

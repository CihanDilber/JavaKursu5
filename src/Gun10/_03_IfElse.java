package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        int kalan = sayi %2;  // 0 veya 1 veya -1   // burada modulus kullandik kalani bulmak icin

        if (kalan==0)                     // kalan sifira esitse
            System.out.println("cift");   // 0 durumunda yapilacaklar

        else                        // !=0 yani yukaridaki degilse -1 veya 1  // kalan 0 a esit degilse
            System.out.println("tek");






    }
}

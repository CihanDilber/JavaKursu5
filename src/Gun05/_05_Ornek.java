package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // kullanicidan alacaginiz 2 tam sayinin toplamini ekrana yazdiriniz.

        Scanner oku =new Scanner(System.in);  // disardan veri girisi olacaksa Scanner ile gireriz.

        System.out.print("Sayi 1=");
        int Sayi1 = oku.nextInt();

        System.out.print("Sayi 2=");
        int Sayi2 = oku.nextInt();

        int toplam=Sayi1+Sayi2;


        System.out.println("Toplam = " + toplam);
        System.out.println("Toplam = " + (Sayi1+Sayi2)); // parantez olursa toplama yapar





    }
}

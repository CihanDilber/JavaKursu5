package Gun08;

import java.util.Scanner;

public class _07_Soru
{
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit  olup olmadığını yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi 1 girin");
        int sayi1= scan.nextInt();

        System.out.print("sayi 2 girin");
        int sayi2= scan.nextInt();

        System.out.println("Esit mi ? " + (sayi1==sayi2));

        // 2. yontem
        boolean esitMi= (sayi1==sayi2);
        System.out.println("esitMi = " + esitMi);




    }



}

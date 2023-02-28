package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.

        Scanner okuStr =new Scanner(System.in);  // String okumalari icin
        Scanner okuInt =new Scanner(System.in);  // int okumalari icin  //iki farkli variable varsa iki scanner giriyoruz

        System.out.print("Cadde= ");
        String cadde = okuStr.nextLine(); // string de okuStr kullandik

        System.out.print("Sokak= ");
        String sokak = okuStr.nextLine();

        System.out.print("Posta Kodu= "); // int de okuInt kullandik
        int postaKodu= okuInt.nextInt();

        System.out.print("Ulke= ");
        String ulke = okuStr.nextLine();

        System.out.println("Adres="+cadde+" "+sokak+" "+postaKodu+" "+ulke);



    }
}

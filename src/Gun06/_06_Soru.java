package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı  ornegin "Ismet Temur"  I.T.  şeklinde yazdırınız. ( ilk harf ile bosluktan sonra ki ilk harfi nasil aliriz) bunu dusun

        Scanner oku =new Scanner(System.in);

        System.out.print("Adiniz ve soyadiniz: ");  // adSoyad veri olarak alindi
        String adSoyad = oku.nextLine();

        // ISMET TEMUR -> I.T.  -> I -> charAt(0) I.
        // indexOf(" ") -> boslugun indexini veriyor bunun 1 fazlasi charAt() -> T yi verir

        char ilkHarf=adSoyad.charAt(0);
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf= adSoyad.charAt(boslukIndex+1); // T

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");

        // char soyadIlkHarf= adSoyad.charAt(adSoyad.indexOf(" ")+1);    // bu da 2.cozum
    }







}

package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanicidan alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        // girilen islem istegine gore sonucu yazdir

        Scanner scan =new Scanner(System.in);
        System.out.println("1.sayi ");
        int sayi1= scan.nextInt();

        System.out.println("2.sayi ");
        int sayi2= scan.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Cikarma için C");
        System.out.println("Carpma için P");
        System.out.println("Bolme için B");

        Scanner okuStr=new Scanner(System.in);
        String secim =okuStr.next();

        // merdivenli if yani ladder if

        if (secim.equalsIgnoreCase("T")){
            System.out.println("toplam = " + (sayi1+sayi2));
        } else if (secim.equalsIgnoreCase("c")){
            System.out.println("farki = " + (sayi1-sayi2));

        } else if (secim.equalsIgnoreCase("P")) {
            System.out.println("carpim = " + (sayi1*sayi2));
        } else if (secim.equalsIgnoreCase("B")) {
            System.out.println("bolum = " + (sayi1/sayi2));
        }
        else
            System.out.println("yanlis secim");
    }
}

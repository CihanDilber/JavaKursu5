package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Daha önce çözdüğünüz hesap makinesi sorusunu,
        // switch ile çözünüz. Bu soru yani

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanicidan alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        // girilen islem istegine gore sonucu yazdir

        Scanner scan =new Scanner(System.in);
        System.out.println("1.sayi");
        int sayi1= scan.nextInt();

        System.out.println("2.sayi ");
        int sayi2= scan.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Cikarma için C");
        System.out.println("Carpma için P");
        System.out.println("Bolme için B");

        Scanner okuStr=new Scanner(System.in);
        String secim =okuStr.next();


        switch (secim.toUpperCase())
        {
            case "T": System.out.println("toplam = " + (sayi1+sayi2)); break;
            case "C": System.out.println("farki = " + (sayi1-sayi2)); break;
            case "P": System.out.println("carpma = " + (sayi1*sayi2)); break;
            case "B": System.out.println("bolme = " + ((double)sayi1/sayi2)); break;
            default:
                System.out.println("hatali deger"); break;



        }



    }
}

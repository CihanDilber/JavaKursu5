package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        // hocanin cozumu instructer da
        // 2. boslugu bulma yontemi icin. from indexi kullaniyoruz.
        //int bosluk2Index= sayilar.indexOf(" ", bos1Ind+1)

        Scanner scan=new Scanner(System.in);
        System.out.println("aralarinda bir bosluk birakarak yan yana 3 tam sayi giriniz");
        String sayilar=scan.nextLine();

        int boslukIndex=sayilar.indexOf(" ");
        int sonBoslukIndex=sayilar.lastIndexOf(" ");

        String strSayi1=sayilar.substring(0,boslukIndex);                 // 45
        String strSayi2=sayilar.substring(boslukIndex+1,sonBoslukIndex);  // 67
        String strSayi3=sayilar.substring(sonBoslukIndex+1);              // 123

        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi2);
        int sayi3=Integer.parseInt(strSayi3);

        if ((sayi1+sayi2+sayi3)%2==0) {
            System.out.println("cift");
        }
        else {
            System.out.println("tek");
        }
    }
}

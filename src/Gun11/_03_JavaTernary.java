package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // kullanicinin girecegi sayinin tek mi cift mi oldugunu yazdiriniz

        Scanner scan =new Scanner(System.in);
        System.out.println("sayi=");
        int sayi =scan.nextInt();

        if (sayi % 2 == 0)
            System.out.println("cift");
        else
            System.out.println("tek");

        // boyle gorursek de sasirmayalim. kisa yontem

        String sonuc= (sayi % 2 == 0) ? "cift" : "tek";   // ? --> if demek   : --> else demek
                                                          // tek satirda yapmis olduk bilelim
        System.out.println("sonuc = " + sonuc);

        System.out.println((( sayi % 2 == 0) ? "cift" : "tek"));


    }
}

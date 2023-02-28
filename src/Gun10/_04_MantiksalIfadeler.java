package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // mantiksal ifadeler
        // if in icine birden fazla sart koyabiliyoruz.
        // && ve isaretimiz bu
        // || veya isaretimiz bu

        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.


        Scanner scan =new Scanner(System.in);
        System.out.print("Sayi= ");
        int sayi = scan.nextInt();

        // hem tek hem pozitif --> sayi%2==1 && sayi>0

        if ( sayi%2==1 && sayi>0) {
            System.out.println("uygun sayi girildi");
        }
        else {
            System.out.println("uygun sayi girilmedi");
        }
        }
    }



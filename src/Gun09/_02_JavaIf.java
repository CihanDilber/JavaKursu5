package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {

        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
            // if den sonra tek islem olacaksa tekrar {} bu parantezlere gerek yok
        if (sayi > 0)  // bu parantezler her turlu olmasi lazim

            System.out.println("pozitif");

        if (sayi<0)
            System.out.println("negatif");

        if (sayi==0)   // esitse anlaminda burada
            System.out.println("sifir");


        }



    }


package Gun11;

import java.util.Scanner;

public class _01_ifElse {
    public static void main(String[] args) {
        // Girilen bir sayını pozitif, negatif veya sıfır olduğunu yazdırınız.


        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz : ");
        int sayi = scan.nextInt();

        if (sayi>0) {
            System.out.println("pozitif");
        } else if (sayi==0) {             // else dersek ya negatif olur ya sifir. onun icin else if diyoruz
            System.out.println("sifir");

        }
        else   {                            // burada da kalan negatifi biraktik. yazmadik tekrar.
            System.out.println("negatif");
        }



    }
}

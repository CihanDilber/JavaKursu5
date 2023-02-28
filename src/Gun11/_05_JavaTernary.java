package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.
        // bu sefer 3 secenekli


        Scanner scan =new Scanner(System.in);
        System.out.println("sayi=");
        int sayi =scan.nextInt();


        System.out.println( sayi== 0 ? "sifir" : (sayi>0 ? "poz" : "neg") );



    }
}

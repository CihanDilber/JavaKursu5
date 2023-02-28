package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {

        // girilen bir sayinin tek mi cift mi oldugunu yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        // int kalan =sayi%2
        if (sayi%2 !=0)  // 1 veya -1    // negatifleri kapsasin diye != sifirdan farkli ise dedik  // 0 a esit degilse

            System.out.println("tek");

        if (sayi%2==0)
            System.out.println("cift");





    }
}

package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının birler basamağının değerini yazı ile yazdırınız.
        // Mesela 234 --> birler basamagi --> 4 var bunu yazi ile yazdiracagiz
        // 234%10 bize son basamagi verir

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        int birlerBasamagi= sayi%10;  // bu bize 4 u verir burada. birler basamagini yani // modul her zaman kalani verir

        switch (birlerBasamagi){
            case 0 : System.out.println("sifir"); break;
            case 1 : System.out.println("bir"); break;
            case 2 : System.out.println("iki"); break;
            case 3 : System.out.println("uc"); break;
            case 4 : System.out.println("dort"); break;
            case 5 : System.out.println("bes"); break;
            case 6 : System.out.println("alti"); break;
            case 7 : System.out.println("yedi"); break;
            case 8 : System.out.println("sekiz"); break;
            case 9 : System.out.println("dokuz"); break;    // baska rakam gelme sansi olmadigi icin default yapmadik


            // sondaki rakami her zaman %10 ile aliyoruz
            // 567 de ki 6 yi almak icin ise ilk once sayiyi 10 a bol sonra %10 yap
            // kural : bir sayidan herhangi bir rakami almak istiyorsan
            // istedigin rakam sonda kalacak sekilde bol, sonrada modul 10 al.





        }






    }
}

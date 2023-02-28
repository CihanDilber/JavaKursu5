package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {

        // girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println(" bir sayi giriniz : ");
        int sayi= scan.nextInt();

        // 2 ye bolumunden kalan 1 ise tek dir
        // modul veriyor kalani %

        int kalan = sayi % 2;  // bu bire esitse tektir
        System.out.println("Tek mi ="+ (kalan==1));

        // 2. yontem
        System.out.println("tek mi "+ (sayi%2==1));

        // 3. yontem
        System.out.println("tek mi " + (sayi%2 !=0));  // negatif girilme ihtimali
                        // sebebi ile bu en dogru cunku bir ustte negatif girilirse -1 gelir



    }
}

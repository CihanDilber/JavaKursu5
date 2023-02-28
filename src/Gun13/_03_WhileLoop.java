package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // girilen 20 sayinin toplaminin sonucunu yazdiriniz

        Scanner scan =new Scanner(System.in);

        int sayac = 1;
        int toplam= 0;

        while (sayac<=20) {     // tekrarlanacak seyleri icine aliyoruz

            System.out.println(sayac+ ".sayi girin");
            int sayi = scan.nextInt();
            toplam=toplam+sayi;

            sayac++;    // sayac=sayac+1 in kisa yazilmasi bu


        }

        System.out.println("toplam = " + toplam);   // en son toplami parantez disina yaziyoruz ki donmesin her seferinde
    }
}

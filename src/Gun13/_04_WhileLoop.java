package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // girilen 20 sayidan sadece pozitif olanlarinin toplamini bulunuz

        Scanner scan =new Scanner(System.in);

        int sayac=1;
        int toplam=0;


        while(sayac<=20) {

            System.out.println(sayac+ ".sayi girin");
            int sayi = scan.nextInt();

            if (sayi>0)
                toplam=toplam+sayi;


            sayac++;


        }


        System.out.println("toplam = " + toplam);

    }
}

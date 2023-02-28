package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek sayi olan elemenlarını tek boyutlu bir
        // diziye atayınız.

        Scanner scan = new Scanner(System.in);
        int[][] tablo = new int[3][2];

        int tekMiktar = 0;
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print("sayi giriniz :");
                tablo[i][j] = scan.nextInt();

                if (tablo[i][j] % 2 != 0)
                    tekMiktar++;
            }
        }
        int[] teklerDizisi = new int[tekMiktar];  // teklerin miktari kadar bir dizi tanimlandi

        tekMiktar = 0;

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {

                if (tablo[i][j] % 2 != 0) {
                    teklerDizisi[tekMiktar] = tablo[i][j];
                    tekMiktar++;
                }


            }
        }
        System.out.println(Arrays.toString(teklerDizisi));
    }
}
package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class tryingBoard_1 {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek sayi olan elemenlarını tek boyutlu bir
        // diziye atayınız.

        Scanner scan=new Scanner(System.in);
        int[][] dizi=new int[3][2];

        int tekMiktar=0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print("sayi girin : ");
                dizi[i][j]= scan.nextInt();

                if(dizi[i][j]%2!=0){
                    tekMiktar++;
                }
            }
            System.out.println("tekMiktar = " + tekMiktar);
        }

        int [] teklerDizisi=new int[tekMiktar];

        tekMiktar=0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {

                if(dizi[i][j]%2!=0){
                    teklerDizisi[tekMiktar]=dizi[i][j];
                    tekMiktar++;
                }
            }
        }
        System.out.println(Arrays.toString(teklerDizisi));

    }
}

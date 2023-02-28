package Gun18;

import java.util.Scanner;

public class tryingBoard_2 {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.

        Scanner scan=new Scanner(System.in);
        int [][] dizi=new int[2][3];


        // okuma
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print("sayi girin : ");
                dizi[i][j]= scan.nextInt();

            }

        }
        // yazma
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]+"\t");

            }
            System.out.println();

        }
        // enb bulma
        int enb=dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if(dizi[i][j]>enb){
                    enb=dizi[i][j];
                }
            }
        }
        System.out.println("enb = " + enb);

    }
}

package Gun18;

import java.util.Arrays;

public class tryingBoard_1 {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // butun doldurma islemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int[][] dizi=new int[2][3];

        int sayac=0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j]=(int)(Math.random()*100);
                System.out.print(dizi[i][j]+" ");

                if(dizi[i][j]%2!=0){
                    sayac++;
                }
            }


        }
        System.out.println();
        System.out.print("sayac = " + sayac);
    }
}

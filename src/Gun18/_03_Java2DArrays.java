package Gun18;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // butun doldurma islemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int[][] tablo = new int[2][3];


        for (int satir = 0; satir < 2; satir++) {

            for (int sutun = 0; sutun < 3; sutun++) {
                tablo[satir][sutun]=(int)(Math.random()*100);

            }
           // tek for da yukarida icinde de yapilabilir aslinda. anlasilsin diye ve soruda boyle dedigi icin yapti hoca boyle
        }
        int tekMiktar=0;
        for (int satir = 0; satir < 2; satir++) {

            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo[satir][sutun]+" \t");

               if(tablo[satir][sutun]%2==1)
                tekMiktar++;


            }
            System.out.println();
        }
        System.out.println("tekMiktar = " + tekMiktar);
    }
}
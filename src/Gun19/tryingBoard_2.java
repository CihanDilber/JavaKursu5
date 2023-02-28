package Gun19;

import java.util.Arrays;

public class tryingBoard_2 {
    public static void main(String[] args) {
        // mainde 20 elemanlı bir diziyi tanimlayiniz, daha sonra bir fonksiyona gondererek
        // random 100 e kadar olan sayilarla doldurunuz ve ayni fonksiyonda yazdiriniz.

        int [] dizi=new int[20];

        randomSayiDoldurma(dizi);
    }

    public static void randomSayiDoldurma(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*100);
            System.out.print(dizi[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(dizi));  // diziyi yazdirma sekli. for un disina olmali
    }
}

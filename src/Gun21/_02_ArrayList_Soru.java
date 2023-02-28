package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı(sayi) bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye(ArrayList) atayarak
        // yazdırınız.

        Scanner scan=new Scanner(System.in);
        int[] dizi=new int[6];     // burada normal array ile yaptik. Arraylist e de atabilirdik

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("sayi=");
            dizi[i]=scan.nextInt();
        }

        System.out.println("dizi = " + Arrays.toString(dizi));

        ArrayList<Integer> tekler=new ArrayList<>();     // kac tane tek olacagini bilmedigimiz icin ArrayList kullandik burada
        // normalde bunu yukarida da yapabilirdik tek for da
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i] %2 !=0)
                tekler.add(dizi[i]);
        }

        System.out.println("tekler = " + tekler);

        //2.Yöntem  // tek seferde olan bu
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı=");
            dizi[i]=scan.nextInt();

            if (dizi[i]  %2 !=0)
                tekler.add(  dizi[i]  );
        }

    }
}

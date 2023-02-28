package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner scan=new Scanner(System.in);

        int[] array=new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("sayi girin : ");
            array[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(array));

        enKucukSayi(array);
        enBuyukSayi(array);
        ortalama(array);

    }
    public static void enKucukSayi(int[] array){
       Arrays.sort(array);
        System.out.println("en kucuk sayi = "+array[0]);
    }

    public static void enBuyukSayi(int[] array){
        Arrays.sort(array);
        System.out.println("en buyuk sayi= "+array[array.length-1]);
    }

    public static void ortalama(int[] array){
        int toplam=0;
        for (int i = 0; i < array.length; i++) {
            toplam+=array[i];
        }
        int ortalama=toplam/ array.length;
        System.out.println("ortalama = " + ortalama);
    }
}



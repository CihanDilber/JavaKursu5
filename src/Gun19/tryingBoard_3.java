package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class tryingBoard_3 {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner scan=new Scanner(System.in);
        int [] array=new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("sayi girin : ");
            array[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(array));

        enKucukEleman(array);
        enBuyukEleman(array);
        ortalamaBul(array);
    }

    public static void ortalamaBul(int[] array) {
        int ortalama=0;
        int toplam=0;
        for (int i = 0; i < array.length; i++) {
            toplam+=array[i];
        }
        ortalama=toplam/ array.length;
        System.out.println("ortalama = " + ortalama);
    }

    public static void enBuyukEleman(int[] array) {
        Arrays.sort(array);
        System.out.println("en buyuk sayi : "+array[array.length-1]);
    }

    public static void enKucukEleman(int[] array) {
        Arrays.sort(array);
        System.out.println("en kucuk sayi : "+array[0]);
    }
}

package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class tryingBoard_4 {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10) olarak doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazdırnız.
        
        int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*11);
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        Scanner scan=new Scanner(System.in);
        System.out.print("0 ile 10 arasi bir sayi girin : ");
        int sayi= scan.nextInt();

        for (int i = 0; i < dizi.length; i++) {
            if(sayi==dizi[i]){
                System.out.print("var oda numarasi "+i+". indekste");
            }
        }
    }
}

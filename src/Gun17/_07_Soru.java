package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10) olarak doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazdırnız.

        int[] dizi=new int[10];
        for (int i = 0; i < dizi.length; i++) {  // 10 elemanli bir diziyi random 10 dahil olarak doldurduktan sonra
           dizi[i]=(int)(Math.random()*11);
        }

        System.out.println(Arrays.toString(dizi));   // burada diziyi yazdirdik

        Scanner scan=new Scanner(System.in);
        System.out.println("aranacak sayi(0-10)= ");
        int arananRakam= scan.nextInt();  // kullanicinin girecegi rakami aldik

        for (int i = 0; i < dizi.length; i++) {   // bir rakami arattiriniz

            if(dizi[i]==arananRakam){
                System.out.println("var oda numarasi="+ i + ".indeksde");
            }

        }
    }
}

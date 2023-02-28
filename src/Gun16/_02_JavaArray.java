package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {

        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.

        int[] notlar=new int[50];      // bunu int notlar[] olarakda yazabiliriz  // 50 tane int kutusu olustu burada

        Scanner scan=new Scanner(System.in);

        int toplam=0;
        for (int i = 0; i < notlar.length; i++)   // tekrarlanan sey notu gir kaydet olacak
        {
            System.out.print("notu giriniz : ");
            notlar[i]= scan.nextInt();

            toplam=toplam+notlar[i];
        }

        int ort=toplam/ notlar.length;

        int gecenler=0;
        for (int i = 0; i < notlar.length; i++)
        {
         if (notlar[i]>ort)
         {
             System.out.println("ortalamadan buyuk notlar : " + notlar[i]);
             gecenler++;
         }
        }
        System.out.println("ort = " + ort);
        System.out.println("gecenler = " + gecenler);
    }
}

package Gun16;

import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {
        // ARRAY
        int ogrNot;  // 1 tane not saklar

        // 50 kisi olsa ne yapacagiz

        int ogr1Not;
        int ogr2Not;
        int ogr3Not;
        //....
        //....
        //....
        int ogr50Not;

        // bana bir tanimlamada birden fazla deger tutabilen bir degiskene ihtiyacim var.
        // cozum

        int[] notlar=new int[50];  // 50 tane int saklayabilen notlar isimli degisken

        notlar[0] =75;
        notlar[1] =88;
        //...
        //...
        notlar[49]=95;  // en son eleman= (toplam eleman sayisi - 1) yani (length -1) dir.cunku index 0 dan baslar .boylede 0 - 49 index dir. 50. ogrenci notu
          // notlar[50]=56; dersen challenger patlar


        System.out.println("notlar[0] = " + notlar[0]);

        System.out.println("notlar.length = " + notlar.length);  // 50 yani toplam eleman sayisini verir. toplam kutu sayisi yani

        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <notlar.length ; i++)   // bu for dongusu okutma
        {
            System.out.print("notu giriniz : ");
            notlar[i]= scan.nextInt();
        }

        for (int i = 0; i < notlar.length; i++)    // burasi yazdirma
        {
            System.out.println(notlar[i]);  // i --> 0,1,3,4,5,.....49
        }



    }
}

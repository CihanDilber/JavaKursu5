package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {


        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);
        ArrayList<Ogrenci> snf = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Ogrenci ogr = new Ogrenci();  // bunu for un icine yaziyoruz ki her dongude yeni bir ogrenci olsun  // bos bir ogrenci

            System.out.print("Ogrenci adi=");  ogr.adi =scanStr.nextLine();
            System.out.print("Ogrenci Soyadi=");  ogr.soyadi =scanStr.nextLine();
            System.out.print("Ogrenci sinifi=");  ogr.sinif = scanInt.nextInt();
            System.out.print("Ogrenci adresi=");  ogr.adres =scanStr.nextLine();

            snf.add(ogr);

            System.out.println();  // bos satir olsun diye

        }

        for ( Ogrenci i : snf  )   // ArrayList i yazdirmak icin for each yaptik
        {
            System.out.println("ogr.adi ="+ i.adi);
            System.out.println("ogr.soyadi ="+ i.soyadi);
            System.out.println("ogr.sinif ="+ i.sinif);
            System.out.println("ogr.adres ="+ i.adres);
        }

    }
}


class Ogrenci{
    // properties , field , ozellikleri denilebilir bunlara
    String adi;
    String soyadi;
    int sinif;
    String adres;


}

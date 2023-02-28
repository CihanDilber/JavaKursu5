package Gun25._03_Soru;



import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);
        ArrayList<Ogrenci> snf = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Ogrenci ogr = new Ogrenci();
            System.out.print("Ogrenci adi=");  ogr.adi =scanStr.nextLine();
            System.out.print("Ogrenci Soyadi=");  ogr.soyadi =scanStr.nextLine();
            System.out.print("Ogrenci sinifi=");  ogr.sinif = scanInt.nextInt();
            System.out.print("Ogrenci adresi=");  ogr.adres =scanStr.nextLine();

            snf.add(ogr);

        }

        for (Ogrenci ogr : snf  )
        {
            System.out.println("ogr.adi ="+ ogr.adi);
            System.out.println("ogr.soyadi ="+ ogr.soyadi);
            System.out.println("ogr.sinif ="+ ogr.sinif);
            System.out.println("ogr.adres ="+ ogr.adres);
        }
    }
}

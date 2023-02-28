package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        // ArrayList in ArrayListi ni nasil yaparim

        ArrayList< ArrayList<Integer>  > notlarListesi=new ArrayList<>();  // listlerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 50 70 80
        // Fizik : 30 40
        // Kimya : 60 70 80 90

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");



        for (int i = 0; i < notlarListesi.size(); i++) {   // her bir derslerin tum notlari

            System.out.print(dersler.get(i)+" : ");

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {   // burasi da tek tek notlar
                System.out.println(notlarListesi.get(i).get(j)+"\t");

            }
            System.out.println();
        }

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        System.out.println("**********************************");
        Scanner scan=new Scanner(System.in);
        System.out.print("Ders No (0-Mat, 1-Fiz, 2-Kim) = ");
        int dersNo=scan.nextInt();

        dersNotlariniYazdir(notlarListesi, dersNo);


        // soru 3 :
        //  yukarida verilen derse ait not ortalamasini ve gecen sayisini bir metodda yazdiriniz

        dersOrtVeGecenMikBul(notlarListesi, dersNo);
    }

    public static void dersOrtVeGecenMikBul(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {
        int toplam=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam+=notlarListesi.get(dersNo).get(i);
        }

        int ort=toplam/notlarListesi.get(dersNo).size();
        int gecenMik=0;

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            if(notlarListesi.get(dersNo).get(i)>=ort)
                gecenMik++;
        }
        System.out.println("ort = " + ort);
        System.out.println("gecenMik = " + gecenMik);
    }

    public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.print(notlarListesi.get(dersNo).get(i)+"\t");
        }
    }


}

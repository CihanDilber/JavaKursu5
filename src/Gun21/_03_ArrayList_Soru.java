package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        // kac kere donecegi belli olmadigi icin for olmaz. do while olur. cunku kontrol sonda.

        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);

        ArrayList<Integer> notlar=new ArrayList<>();  // kac tane not olacagi belli olmadigi icin ArrayList yaptik

        int toplam=0;
        String devamMi;
        do{
            // notu girecek
            System.out.print("Not=");
            int not=scanInt.nextInt();
            // notlari arrayliste at
            notlar.add(not);
            //devam etmek istiyor musunuz E/H
            System.out.print("devam etmek istiyor musunuz E/H");
            devamMi=scanStr.next();

        }while (devamMi.equalsIgnoreCase("E"));

        // ortalamayi bul
        int ort=toplam/ notlar.size();

        // gecen sayisini bul
        int gecenSayisi=0;
        for (int i = 0; i < notlar.size(); i++) {
            if(notlar.get(i)>ort)
                gecenSayisi++;
        }
        System.out.println("gecenSayisi = " + gecenSayisi);
    }
}

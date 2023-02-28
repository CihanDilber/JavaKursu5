package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5;  // tek bir rakam tutabilen bir degisken. bu yetmedi
        int[] dizi=new int[20];  // 20 adet sayi saklayabilen bir degisken geldi. uzunlugu sabit ama bununda
        int [][] tablo=new int[20][2];  // 20*2 lik sayi saklayabilen degisken, sabit uzunluklu

        ArrayList<Integer> liste=new ArrayList<>();  // istenildigi kadar sayi eklenebilen, uzunlugu degisebiliyor

        /*************************/

        // bir sinif var, bu sinifta 20 kisi var ve bunlarin 3 dersi olsun. Ogrencilerin bu 3 derse ait notlarini
        // nasil bir degiskende saklayabilirim

        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(700);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        // ArrayList in ArrayListi ni nasil yaparim

        ArrayList< ArrayList<Integer> > notlarListesi=new ArrayList<>();  // listlerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        notlarListesi.get(0);  // matNotlari listini verir bu. 0 indeksde ki list bu yani
        int matBirNot=notlarListesi.get(0).get(0);  // mat notlari listinin ilkini veriyor bu. 0. indeks yani

        System.out.println("notlarListesi.get(0) = " + notlarListesi.get(0));  // mat notlari listi
        System.out.println("notlarListesi.get(1) = " + notlarListesi.get(1));  // fiz notlari listi
        System.out.println("notlarListesi.get(2) = " + notlarListesi.get(2));  // kim notlari listi

        // yukaridakinin yerine bir for dongusu nasil kullaniriz
        for (int i = 0; i < notlarListesi.size(); i++) {   // 0,1,2
            System.out.print("notlarListesi.get("+i+" = " + notlarListesi.get(i));
        }

        /********* satir sutun yazdirma ****************/
        for (int i = 0; i < notlarListesi.size(); i++) {      // i= satirlari  j=sutunlari

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {  // notlar[i].length e tekabul eder bu
                System.out.print(notlarListesi.get(i).get(j)+"\t");  // notlar[i][j]

            }
            System.out.println();

        }


    }
}

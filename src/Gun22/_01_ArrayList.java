package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        // siralama islemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //tersine cevir siralamayi
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        // max ve min eleman bulma
        System.out.println("max() =" + Collections.max(sayilar));
        System.out.println("min() =" + Collections.min(sayilar));

        // Butun elemanlari set etme
        Collections.fill(sayilar,0);   // eski sayilarin yerine hepsini verdigimiz degeri atar toplu
        System.out.println("sayilar = " + sayilar);

        // replace
        Collections.replaceAll(sayilar,0,5); // 0 lara 5 atadi
        System.out.println("sayilar = " + sayilar);

        // tanimlarken deger atama
        int[] dizi={2,3,4,5};   // normal bildigimiz dizi bu
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,4,5,6));       // tamamen bu satirda toplu tanimlaniyor yeni olarak
        System.out.println("liste = " + liste);
        ArrayList<String> strliste=new ArrayList<>(Arrays.asList("ahmet","mehmet","busra","roman"));
        System.out.println("strliste = " + strliste);

        // buda 2. yontem tanimlarken deger atama icin
        ArrayList<Integer>liste2=new ArrayList<>();          // once liste2 olusturduk sonra liste2 ye hangi rakamlari olacagini soyledik
        Collections.addAll(liste2, 2,3,4,5,6,67);

        // diziyi direk Arrayliste nasil atarim
        Integer[] dizi2={2,3,4,5};
        ArrayList<Integer>list3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("list3 = " + list3);
    }
}

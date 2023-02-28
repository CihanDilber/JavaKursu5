package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        // ekrana yazdirma
        System.out.println("renkler = " + renkler);

        // ekrana tek tek nasil yazdiririm  // for each yaptik burada  // hepsini getir dedik sira onemli degil yani
        for (String eleman:renkler) {  // sira garanti degil  // hic garanti yok kafasina gore
            System.out.println("eleman = " + eleman);

        }

        // foreach le ilgili örnek olsun diye eklendi
//        int[] dizi={34,5,6,7,8,89,899,77};
//        for(int sayi: dizi)
//        {
//            System.out.println("sayi = " + sayi);
//        }


        // set in kendi sirasi nasil ise onun aynisini verir. for each gibi degil yani
        Iterator gosterge= renkler.iterator();
        while(gosterge.hasNext()){   // siradaki eleman var ise
            System.out.println("gosterdigi eleman = " + gosterge.next());


            }
        }
    }


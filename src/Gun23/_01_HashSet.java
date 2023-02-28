package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int sayi=5; // hafızada 1 sayı saklıyor
        int[] dizi=new int[6]; // hafızada 6 sayı saklar : sabit boyutlu
        int[][] tablo=new int[3][20]; //hafızada 60 sayı saklıyor, 3x20 şeklinde : sabit boyutlu

        // dizi lazım, ama boyutu ekledikçe artsın, sildikçe azalsın
        ArrayList<Integer> liste=new ArrayList<>(); // boyu değişken
        ArrayList< ArrayList<Integer> > listelerinListesi = new ArrayList<>(); // 2 boyutlu, 2 boyutu da değişken


        /***************************************/
        // SET DIZILERI (tekrar icermeyen diziler)  // tc no, tel no plaka no gibi kredi karti no gibi benzersiz numaralar icin
        // javacim su ana kadar verdigin degisken tipleri icin tesekkur ederim,
        // fakat bana oyle bir dizi verki hem ArrayList gibi olsun hemde Tekrar degerleri
        // icine almasin, oyle set ver bana, yani dizi tip ver bana

        // Java mektubumuza cevap verdi :
        // sevgili dostum hic canini sikma, bu is icin tasarlanmis SET ler adini verdigimiz
        // dizilerimiz var dedi.

        // HashSet -> sen ekledikçe hızlı çalışmak için KENDINE GORE bir sıralamada elamanları tutar.
        // LinkedHashSet -> sen ekledikçe , EKLENME SIRASINA göre , elemanlarını saklar.
        // TreeSet -> sen ekledikçe onları herzaman SIRALI tutar dedi.

        // bunların ortak özelliği Hiç TEKRAR değer bulundurmaz.


        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        boolean eklendiMi=hs1.add(5);  // true   // bu sekilde kontrol etmis emin olmus oluyoruz
        boolean tekrarEklendiMi=hs1.add(5); // false // burada eklemedi tekrar oldugu icin
        hs1.add(2);

        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("tekrarEklendiMi = " + tekrarEklendiMi);
        System.out.println("hs1 = " + hs1);





    }
}

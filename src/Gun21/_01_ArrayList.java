package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array : boyut sayısı belli, sonradan değiştirilemez
        int[] dizi = new int[5]; // Array 5 elemanlı boyutu sonradan değiştirelimiyor

        // Boyutu dinamik olsu, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList : boyutunu başta vermene bile gerek yok, boyutu başlangıçta 0
        // eleman ekledikçe arta, sildikçe kısalır.

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doublelist= new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet"); // uzunluk 1
        isimler.add("Metin"); // uzunluk 2
        isimler.add("Hacer"); // uzunluk 3
        isimler.add("Aynur"); // uzunluk 4   // add en sona ekle demek

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());  // uzunlugu size ile veriyor burada.

        isimler.add(1,"Muhammed");  // verilen indekse ekliyor, digerleri 1 kayiyor sona dogru // bu sekilde araya eklemis oluyoruz
        System.out.println("isimler = " + isimler);

        isimler.set(1,"Zafer");  // verilen indeksdeki elemani degistirir.
        System.out.println("isimler = " + isimler);

        boolean varMi=isimler.contains("Metin"); // var mi
        System.out.println("varMi = " + varMi);

        isimler.remove("Metin"); // degere gore siler
        System.out.println("isimler = " + isimler);

        isimler.remove(1); // rakam verildiginde indeks kabul ediyor ve ona gore siliyor
        System.out.println("isimler = " + isimler);

        int indeksOfAynur= isimler.indexOf("Aynur");
        System.out.println("indeksOfAynur = " + indeksOfAynur);

        String ilkEleman=isimler.get(0); // verilen indeksdeki degeri verir bize
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear(); // her seyi temizliyor
        System.out.println("isimler = " + isimler);



    }
}

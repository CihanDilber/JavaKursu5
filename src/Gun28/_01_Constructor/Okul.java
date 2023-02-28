package Gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {

        // 1.yol
        Ogrenci ogr1 = new Ogrenci();  // nesne olusma ani, dunyaya geldi burada
        ogr1.id=1;
        ogr1.ad="cihan";
        ogr1.soyad="dilber";
        ogr1.sinifi=5;
        System.out.println("ogr1.ad = " + ogr1.ad);

        // 2. yol  // methodda tanimlarsan direk yazabiliyorsun buraya kisaca
        Ogrenci ogr2=new Ogrenci(2,"cihan","dilber",5);
        System.out.println("ogr2.ad = " + ogr2.ad);


        // 3. yol
        Ogrenci ogr3=new Ogrenci(2,"ayse","bayrak");


    }
}

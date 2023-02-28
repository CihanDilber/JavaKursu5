package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {

        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="Cihan Dilber";

        //1. yontem
        ogr.okulu=new Okul(); // burada yazarken new okul olusturuyoruz
        ogr.okulu.adi="Mehmet Akif Ersoy";
        ogr.okulu.mudurAdi="Merve Aslan";
        ogr.okulu.ucreti=50000;

        // 2. yontem
        Okul okl=new Okul();  // burada basta tanimliyoruz objeyi
        okl.adi="Mehmet Akif Ersoy";
        okl.mudurAdi="Merve Aslan";
        okl.ucreti=50000;
        ogr.okulu=okl;  // burada en son ete kemige burunmus

        System.out.println("ogr.okulNo = " + ogr.okulNo);
        System.out.println("ogr.tamAd = " + ogr.tamAd);
        System.out.println("okul adi = " + ogr.okulu.adi);
        System.out.println("mudur adi = " + ogr.okulu.mudurAdi);
        System.out.println("ucreti = " + ogr.okulu.ucreti);

        ogr.BilgiYazdir();  // method yazdik
    }
}

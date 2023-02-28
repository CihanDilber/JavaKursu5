package Gun35._03_Polymorphism;

public class OkulMain {
    public static void main(String[] args) {

        Ogrenci ogr=new Ogrenci("ayse","yilmaz","ogrenci","5A");
        Calisan cal=new Calisan("ali","yilmaz","yazilim","bilgi islem");

        //System.out.println("cal = " + cal);
       // System.out.println("ogr = " + ogr);
        // toString ini kullaniyor bu yuzden tek metod degil

        Kisi.kimlikYaz(ogr);
        Kisi.kimlikYaz(cal);
    }


}

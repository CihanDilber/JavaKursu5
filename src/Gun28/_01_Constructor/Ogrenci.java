package Gun28._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    public Ogrenci() {   // burasi gorunmeden de olsa kullaniliyor aslinda
        // bu method. ilk olusturulma aninda calisan methodlara
        // yapici metodlar(constructor) denir.
        System.out.println("nesne olusturuldu");
    } // nesne olusturulurken yapmak istediklerin icin burayi kullan

    // bunu kullanmaya baslayinca ustteki ni de yazmamiz gerekiyor artik
    public Ogrenci(int id, String ad, String soyad, int sinifi){
        this.id=id; // class in id si.
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinifi;
    }

    public Ogrenci(int id, String ad, String soyad){
       this(id,ad,soyad,0); // this, ogrenci metodunun kendisi

        // alttakinin yerine kisa olarak ustteki gibi yazabiliriz.

        // this.id=id; // class in id si.
       // this.ad=ad;
       // this.soyad=soyad;
       // this.sinifi=0;
    }
}

//    mühendisin arabayı çizdiği kağıttaki modeller: class, tipin adı, türün adı
//        buna bakarak yapılmış araba ise nesne, araba üretilirken yapılan işlemlerin
//        yapıldığı metod ise Constructor yani yapıcı metodlar
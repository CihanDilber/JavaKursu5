package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();

        //kisi1.ad="ismet";
        //kisi1.soyad="temur";
        // kisi1.yas=-25;  // boyle yazmamasi icin tedbir aliyoruz

        kisi1.setAd("ismet");
        kisi1.setSoyad("temur");
        kisi1.yasAta(-25);

        System.out.println(kisi1.yasVer());

        System.out.println("kisi1 = " + kisi1);

        // degiskene direk erisimi kapatip
        // bir metod ile korumali veri gonderme ve alma
        // islemine Encapsulation denir.
    }
}

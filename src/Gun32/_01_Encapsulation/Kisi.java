package Gun32._01_Encapsulation;
// genel kural tum degiskenler private yapilir gerekirse acilir
public class Kisi {
    private String ad;   // 25 karakter ile sinirlanabilir mesela
    private String soyad;
    private int yas;  // korumaya aldik private ile

    void yasAta(int yas){  // burada ilk once turkce yazdik //set aslinda
        if(yas>0 && yas<150)
            this.yas=yas;
        else
            System.out.println("hatali yas");
    }

    int yasVer(){  // burasi da get
        return this.yas;
    }

    void setSoyad(String soyad){  // buradan itibaren orjinal tabirler
        if(soyad.length()<25)
            this.soyad=soyad;
        else
            System.out.println("hatali soyad");
    }

    String getSoyad(){
        return this.soyad;
    }

    void setAd(String ad){
        if(ad.length()<25)
            this.ad=ad;
        else
            System.out.println("hatali ad");
    }

    String getAd(){
        return this.ad;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}

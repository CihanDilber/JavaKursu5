package Gun20;
// overloading
public class _05_JavaMethodOverloading {
    public static void main(String[] args) {
        int s1=4;
        int s2=12;
        int s3=34;
     // ayni islemi yapiyorsa ayni adi verebilirsin. iki fonksiyonda ayni isim kullanilabilir. ayirt edici bir parametre varsa
        int sonuc1=toplamBul(s1,s2);
        int sonuc2=toplamBul(s1,s2,s3);

        String ad="ismet";
        String soyad="Temur";
        String sonuc3=toplamBul(ad,soyad);
    }

    public static int toplamBul(int s1,int s2){
        return s1+s2;
    }

    public static int toplamBul(int s1,int s2,int s3){
        return s1+s2+s3;
    }

    public static String toplamBul(String ad, String soyad){
        return ad+" "+soyad;
    }

}
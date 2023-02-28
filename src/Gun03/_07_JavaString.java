package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        String ad="Ismet"; // String : kelime veya kelimeleri saklamak icin kullanilir
                           // sinirlarini "" ile belirlenir.

        String soyad="Temur";

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad ve soyad = " +ad+" "+soyad);
        // + lar burada stringler arasinda oldugu icin birlestirir. + isareti sayi gorunce toplar

        String tamAd = "ismet" + " " + "temur";  // bos tirnak arada bosluk vermek icin veya icine \t de olabilir
        System.out.println("tamAd = " + tamAd);
    }
}

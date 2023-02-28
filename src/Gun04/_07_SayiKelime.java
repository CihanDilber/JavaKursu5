package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        // sayilari birbirine cevirdik simdiye kadar. bir de yazilarin rakamlara rakamlarinda yazilara cevrilmesi var.

        String ad="ismet";
        String kelimeSayi="65";    // bunu cevirecegiz sayiya

        int sayiDeger= Integer.parseInt(kelimeSayi);  // sayiya donusur

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        // toplam su anda int yani sayi, bunu stringe nasil donustururum
        String strToplam= Integer.toString(toplam); // Stringe donusturur.
        System.out.println("strToplam = " + strToplam);

        // tc no veya tel numaralari veya iban no veya emekli maaslari mesela cok yer kaplamasin diye string olarak tutulur.
    }
}

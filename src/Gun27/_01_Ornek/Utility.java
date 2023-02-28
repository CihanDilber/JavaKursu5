package Gun27._01_Ornek;

public class Utility {

    public String getString(int sayi){
        return String.valueOf(sayi);
    }


    public static String getString2(int sayi){
        return String.valueOf(sayi);
    }

    // STATIC olan metodlar SINIF a yani CLASS yani
    // TİP e ait. Static olunca nokta deyip direk calisir.

    // STATIC olmayanlar kime ait nesneye ait bu sebeple
    // mutlaka oluşturulmaları gerekiyor. new ile olusturmadan kullanilmaz.

    // Nesneyi ilgilendiren metdoları normal yazıyoruz.
    // Nesneyi ilgilendirmeyen, Tipi ilgilendiren
    // metodları STATIC ile yazıyoruz.
}

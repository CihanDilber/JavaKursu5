package Gun06;

public class _02_StringLength {
    public static void main(String[] args) {
        // String yani kelime islemleri cok kullanilan islemler
        // 0 216 2563258, stringler bolunmesi, istenilen kismin alinmasi
        // uzunlugu, **** **** **** 4566 , bir kisminin gizlenmesi, ISMET TEMUR -> I:T. mesela

        // girilen stringin uzunlugunu nasil aliriz yani karakter sayisi
        String cumle="Bu gun havalar sogudu";

        int uzunluk=cumle.length();   // cumlenin uzunlugunu buluyoruz bu sekilde. length in uzerine gelince o bize int oldugunu soyluyor.

        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk 2 = " + cumle.length());  // bu sekilde de yazilabilir
    }
}

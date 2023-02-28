package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double  bu yonde sorun yok

        int sayi1=9;
        long sayi2=6700;
        double sayi3 =3.2;

        sayi3 = sayi1 ;   // oran=9 , kayip yok.
        System.out.println("sayi 3 =" + sayi3);

        sayi2=sayi1;  // kayip yok toplam 9
        System.out.println("sayi2 = " + sayi2);

        sayi3 = sayi2;   // kayip yok, oran 9
        System.out.println("sayi3 = " + sayi3);
    }
}

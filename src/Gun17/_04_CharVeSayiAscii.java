package Gun17;

public class _04_CharVeSayiAscii {
    public static void main(String[] args) {
         // harf ve rakam eslestirme sistemine ascii tablosu denir.
        int sayi = 65;

        System.out.println("sayi = " + sayi);

        char harf = (char) sayi;                // A oluyor burada
        System.out.println("harf = " + harf);   // buyuk A ascii de 65. sirada kayitli.


        sayi = 97;
        harf = (char) sayi;

        System.out.println("harf = " + harf);


        for (int i = 0; i <= 255; i++) {
            harf = (char) i;
            System.out.println(i + ".harf = " + harf);
        }


    }
}
//A -> bilgisayar saklarken A
//
//        Harf ve rakam eşleştirme tablosuna ascii tablosu
//        0 - >
//        1 - >
//
//        (char)65  -> A
//
//
//        65 -> A
//        66 -> B
//
//
//
//        97 -> a
//        98 -> b
//
//        ....
//        ...
//        255 ->
package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;

        int toplam=ogrNot1;  // byte i int e atinca sikinti olmadi  (GENISLETME - Widening Casting)
        // cunku byte icin hafizada ayrilan zaten int e sigar. sigdigi icin kabul ederim.
        // cunku veri kaybi ihtimali hic yok

        ogrNot1 = (byte) toplam;   // int i byte a atinca dur bakalim dedi (DARALTMA - Narrow Casting)
        // buyuk hafiza ayrilmis bir alani kucuk hafiza ayrilmis alana atma islemi var
        // veri kaybi ihtimali var
        System.out.println("Toplam="+ toplam);
    }
}

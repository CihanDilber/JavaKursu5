package Gun03;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Ornek Soru : yarıcapı(r) verilen bir dairenin cevresini ve alanını bulunuz
        // alan= pi*yaricap*yaricap    cevre = 2*pi*yaricap     " pi=3.14 "

        double yaricap=4;  // burada int desen de fark etmez.

        double alan = 3.14 * yaricap * yaricap; // burada mesela ayni satirda yapmisiz daha pratik bence
        double cevre = 2 * 3.14 * yaricap;

        System.out.println("cevre = " + cevre);  // buradaki arti yanina yaz anlaminda
        System.out.println("alan = " + alan);
    }
}

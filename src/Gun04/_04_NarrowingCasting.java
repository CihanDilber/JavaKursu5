package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double sayi1=3.2;
        int sayi2=5;

        sayi2= (int) sayi1;     // buyuk bir alani kucuk bir alana atiyorsun.
        //tehlikeli islem yapiyorsun bunu bilerek mi yapiyorsun. degerlere bak. olusan veri kaybini
        // anladi isen ve kabulunse bana bunu bilerek yaptigini goster.

        System.out.println("sayi 2= " + sayi2);

        /********************************************************************/

        byte kisaKenar=5, uzunKenar=7;


        byte cevre= (byte) (kisaKenar+uzunKenar+kisaKenar+uzunKenar);
        // sen esitligin 2. tarafi icin rakamlar toplandi. benim toplam burada INT durumunda
        // byte cevre = 5+7+5+7;  // int i -> byta a atmaya calisiyorsun
        // eger veri kaybi olmayacagindan eminsen veya veri kaybi onemli degilse bana bunu yazarak goster.
        int cevre2= kisaKenar+uzunKenar+kisaKenar+uzunKenar;  // boyle yapsaydin veri kaybi olmazdi // alternatif bu
        System.out.println("cevre = " + cevre);
        System.out.println("cevre2 = " + cevre2);

    }
}

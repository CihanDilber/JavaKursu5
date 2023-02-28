package MyFunction;

public class MyFunction {
// bekletme konusu
    public static void Bekle(int sn)
    {
        try {
            Thread.sleep(1000*sn);  // milisaniye cinsi oldugu icin carpiyoruz
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

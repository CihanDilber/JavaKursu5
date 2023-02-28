package Gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args) {

        long startTime=0;
        String str="";

        try {
            // hata olma olasiliginin oldugu kodlar
            startTime = System.currentTimeMillis();
            System.out.println("hatadan onceki kisim");
            char ilkHarf = str.charAt(0);
            System.out.println("hatanin sonraki kismi");
        }
        catch (Exception ex)
        {
            // hata oldugunda yapilacaklar
            System.out.println("catch blogu calisti");
        }
        finally   // hata olsada olmasada calisacak kisim. bu bolum yukaridaki surecle
                  // ilgili oldugunu gostermek icin finally icine yazilir
        {

            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloguyla ilgili son yapilacaklar");
        }

        System.out.println("diger calisan kodlar");

        System.out.println("program sonu");
    }
}

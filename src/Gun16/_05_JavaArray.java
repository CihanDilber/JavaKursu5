package Gun16;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. // trt, kanald, atv, fox, haberturk
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.
        // {"trt", "atv"} seklinde yazilir string de.

        String [] tvKanallari= {"trt", "kanald", "atv", "fox", "haberturk"};   // 0,1,2,3,4  // indeks den dolayi 0 - 4 yetiyor burada

        int rastgele= (int)(Math.random()*(tvKanallari.length));  // 5 e kadar 5 dahil degil  // 0.9*5=4.5 yapar. 4 e kadar almis oluyoruz.

        System.out.println("rastgele secilen Tv : " + tvKanallari[rastgele]);   // length her zaman indeks +1 dir.


        // TODO : gunun sorusu : bir döngü ile 5 tane RASTGELE buldurunuz
        // fakat bir buldugunu tekrar bulmasın


    }
}

package Gun14;

public class _02_forLoop {
    public static void main(String[] args) {

        // 1 den 5 e kadar olan sayilari ekrana yazdiriniz.

        // dongunun kac kere donecegi belli olmayan durumlarda while kullanacagiz

        int i=1;
        while (i<=5)
        {
            System.out.println("while i = " + i);
            i++;
        }


        System.out.println();    // alt satira gecirdik burada

        // for dongusu, basi belli sonu belli artisi belli ise bunu kullan.
        for (i=1; i<=5; i++){
            System.out.println("for i = " + i);
        }
    }
}
          /*      1- Başı belli, sonu belli,
                  yani kaç adım döneceği belli ve artış miktarı
                  belli ise bu FOR döngüsüdür.

                  2- Kaç kere döneceği belli değil ise
                  (kullanıcı 0 değeri girene kadar)
                  WHILE döngüsüdür.

                  3-While döngüsünde döngü kontrolü işlemden sonra
                  ise DO-WHILE dongusudur.*/
package Gun07;

public class _05_StringSubstring {
    public static void main(String[] args) {
        // stringin belli bir bolumunu alma islemini yapar.

        String s1="Merhaba arkadaslar";

        System.out.println("s1.substring(3, 9) = " + s1.substring(3, 9));  // 3 nolu indexden 3 dahil 9 nolu indexe kadar, 9 dahil degil

        System.out.println("s1.substring(8,15) = " + s1.substring(8,15));  // index olarak 8 dahil 15 dahil degil

        System.out.println("s1.substring(8) = " + s1.substring(8));  // verilenden baslayip sonuna kadar alir
    }
}

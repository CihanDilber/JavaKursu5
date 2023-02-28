package Gun17;

import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split : bir stringi parcalara ayirmak demek    // bu arraylerde kullaniliyor sadece

        // kullanicidan alacaginiz cumleyi kelimelerine gore alt alta yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("cumle : ");
        String cumle= scan.nextLine();

        String[] kelimeler=cumle.split(" ");   // burada bosluga gore bol dedik  // harfe gore de bolunebilir o harfi atiyor yani

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }
    }
}

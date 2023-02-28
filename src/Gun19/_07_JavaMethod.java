package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(60);

        // Kullanicidan sayi alarak onu tek mi cift mi yazdiralim
        tekMiCiftMiOku();   // scanner okudugu icin girmedik parantez icine bir sey

    }


    public static void tekMiCiftMi(int sayi) {
        if (sayi % 2 != 0)
            System.out.println("tek");
        else
            System.out.println("cift");
    }

    public static void tekMiCiftMiOku() {      // metodun icinde metod cagirdik burada
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz=");
        int sayi = scan.nextInt();

        tekMiCiftMi(sayi);
    }
}

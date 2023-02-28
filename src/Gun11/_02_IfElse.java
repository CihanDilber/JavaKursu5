package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.println("kac saat otoparkta kaldin : ");
        double saat = scan.nextDouble();   // int olarak da alinabilir tam saat olarak

        if (saat<=3){
            System.out.println("10 TL");

        } else if (saat<=5) {                 // 3 den kucuk degilse diyorsun
            System.out.println("15 TL");

        }
        else                                  // 5 den kucuk degilse diyorsun burada
            System.out.println("20 TL");

    }

}

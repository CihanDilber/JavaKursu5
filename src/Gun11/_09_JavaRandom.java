package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner scan =new Scanner(System.in);
        System.out.println("Uretilecek sayi siniri = ");
        int sinir=scan.nextInt();

        int tutulanSayi= (int)(Math.random()*sinir);

        System.out.print("Tahmininiz=");
        int tahmin=scan.nextInt();

        if (tahmin == tutulanSayi)
            System.out.println("Tebrikler");
        else
            System.out.println("bilemedin ki bilemedin ki");
    }




    }


package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {

        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit
        // ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Notu giriniz : ");
        int not = scan.nextInt();

        if (not >= 50)
            System.out.println("gectiniz");

        if (not<50)
            System.out.println("uzgunuz kaldiniz");







    }
}

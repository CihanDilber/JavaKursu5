package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        System.out.println("2. sayiyi giriniz");
        System.out.println("3. sayiyi giriniz");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        //  1.yontem

        int enb = Math.max(a,b);
        enb = Math.max(enb,c);
        System.out.println("enb = " + enb);

        // 2. yontem

        int enb2 = Math.max(a, Math.max(b,c));     // 3 deger yan yana karsilastirmaz parantezli olmasi gerekir.
        System.out.println("enb2 = " + enb2);





    }
}

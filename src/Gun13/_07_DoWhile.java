package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // kullanici 0 degeri girene kadar
        // girdigi sayilarin toplamini bulunuz

        Scanner scan =new Scanner(System.in);
        int sayi;
        int toplam=0;

        do { // dongu arasi sart basta olmadigindan
            // en az bir kez calisir, kontrol sonda

            System.out.println("sayi giriniz");
            sayi = scan.nextInt();

            toplam = toplam + sayi;
        }while (sayi!=0);

        System.out.println("toplam = " + toplam);
    }
}

package Gun13;

import java.util.Scanner;
 // burayi tam yazamadim tamamla    // do while anlamasanda cok sorun degil while onemli olan testerlik icin
public class _06_DoWhile {
    public static void main(String[] args) {
        // kullanici 0 degeri girene kadar
        // girdigi sayilarin toplamini bulunuz

        Scanner scan =new Scanner(System.in);
        int sayi;
        int toplam=0;
         // ilk once donguye girmeden bir kez okutuyoruz burada
        System.out.println("sayi giriniz");
        sayi= scan.nextInt();
        //toplam=toplam+sayi;

        while(sayi!=0){

            System.out.println("sayi giriniz");
            sayi= scan.nextInt();

          //  toplam=toplam+sayi;
        }

       // System.out.println("toplam = " + toplam);

    }
}

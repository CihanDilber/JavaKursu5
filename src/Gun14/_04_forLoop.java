package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {


        // kullanıcının gireceği bir rakama (dahil) kadar
        // olan sayıların toplamını bulunuz.  // 3 ise 3 e kadar olan sayilarin toplami lazim.


        Scanner scan=new Scanner(System.in);
        System.out.print("sayi giriniz : ");
        int sayi=scan.nextInt();

        int toplam=0;
        for (int i=1; i<=sayi; i++)
        {
            toplam=toplam+i;               // toplam+=i          diye yazilir normalde
        }


        System.out.println("toplam = " + toplam);





    }
}

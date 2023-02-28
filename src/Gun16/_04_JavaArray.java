package Gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz

        int [] notlar=new int[7];

        Scanner scan =new Scanner(System.in);

        int toplam=0;
        for (int i = 0; i < notlar.length; i++)    // 7 sayiyi alma yeri burasi
        {
            System.out.print("notu girin : ");
            notlar[i]= scan.nextInt();

            toplam=toplam+notlar[i];

        }
        int ortalama=toplam/ notlar.length;
        int ortalamaBuyukVeTekSayi=0;

        for (int i = 0; i < notlar.length; i++)
        {
            if(notlar[i]>ortalama && notlar[i]%2!=0)
            {
                ortalamaBuyukVeTekSayi++;
            }




        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalamaBuyukVeTekSayi = " + ortalamaBuyukVeTekSayi);
    }
}

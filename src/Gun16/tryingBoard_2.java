package Gun16;

import java.util.Scanner;

public class tryingBoard_2 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz

        Scanner scan=new Scanner(System.in);
        int [] dizi=new int[7];

        for (int i = 0; i < dizi.length; i++) {        // bende bir for fazla. hoca hem almayi hem toplami tek tek bulmus
            System.out.print((i+1)+". sayiyi girin : ");
            dizi[i]=scan.nextInt();

        }

        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];
        }
        System.out.println("toplam = " + toplam);
        int ortalama=toplam/ dizi.length;
        System.out.println("ortalama = " + ortalama);


        int ortBuyukVeTekSayi=0;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]>ortalama && dizi[i]%2!=0){
                ortBuyukVeTekSayi++;
            }
        }
        System.out.println("ortBuyukVeTekSayi = " + ortBuyukVeTekSayi);
    }
}

package Gun16;

import java.util.Scanner;

public class tryingBoard_1 {
    public static void main(String[] args) {
// 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.

        Scanner scan=new Scanner(System.in);
        int [] notlar= new int[3];



        int toplam=0;
        for (int i = 0; i < notlar.length; i++) {
            System.out.print((i+1)+". notu girin : ");
            notlar[i]=scan.nextInt();
            toplam+=notlar[i];
        }
        int ortalama=toplam/ notlar.length;



        int gecenler=0;
        for (int i = 0; i < notlar.length; i++) {
            if(notlar[i]>ortalama){
                System.out.print("ortalamadan buyuk notlar = " + notlar[i]);
                gecenler++;

            }
        }

        System.out.println();
        System.out.println("ortalama = " + ortalama);
        System.out.println("gecenler = " + gecenler);


    }
}

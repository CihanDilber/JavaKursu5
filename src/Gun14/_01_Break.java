package Gun14;

import java.util.Scanner;
    // hocadan yaz son halini
public class _01_Break {
    public static void main(String[] args) {

       // girilen bir sayinin 2 ayni sayinin carpimina esit olup olmadigini bulunuz.
        //  yani girilen sayı herhangi bir sayısının karesine eşit mi
        // 4 girdim mesela --> bu tam karedir  2*2
        // 5 girdim --> degildir
        // 9 girdim --> tam karedir 3*3

        Scanner scan=new Scanner(System.in);
        System.out.print("sayi giriniz : ");
        int sayi=scan.nextInt();

        // 5 girildi , 5 e kadar sayilari 1,2,3,4,
        // 9 girildi , 9 a kadar sayilari 1,2,3,4,5,6,7,8,

        int sayac=0;  // 9 girdim mesela

        while(sayac<sayi)
        {

            if (sayac*sayac==sayi)
            {         // 0*0==9, 1*1==9, 2*2==9, 3*3==9
                System.out.print("tam karedir");
                break; // calistiginda donguden cikar
            }
            sayac++;
        }




    }

}

       /*  // girilen bir sayının, 2 aynı sayının carpımına
        // eşit olup olmadığını bulunuz.

        // 4 girdim -> 2*2 bu tam karedir.
        // 5 girdim -> değildir.
        // 9 girdim -> 3*3

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();

        // 5 girildi  , 5 kadar sayıları 1,2,3,4
        // 9 girildi  , 9 kadar sayıları 1,2,3,4,5,6,7,8

        int sayac=0;   // 9 girdim
        boolean tamKare=false;
        while(sayac < sayi)
        {
            System.out.println("sayac = " + sayac);

            if (sayac*sayac==sayi) // 0*0==9, 1*1==9, 2*2==9, 3*3==9
            {
                tamKare=true;
                System.out.print("tam karedir");
                break; // çalıştığında döngüden çıkar
            }

            sayac++;
        }

        if (tamKare == false)
          System.out.println("tam kare değildir");

    }
                */


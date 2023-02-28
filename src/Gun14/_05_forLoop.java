package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {

        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // 2. bolum: carpimin degeri 10000 i gectiginde islem sonlansin


        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi girin : ");
        int sinir=scan.nextInt();

        int carpim=1;         // buyuk sayi gelme ihtimali varsa long derdik.

        for (int i=1; i<=sinir; i++){
            carpim*=i;    // carpim=carpim*i yani

            if(carpim>=1000){             // 2. bolum icin burayi ekledik
                System.out.println("break calisti");
                break;
            }

        }

        System.out.println("carpim = " + carpim);





    }


}



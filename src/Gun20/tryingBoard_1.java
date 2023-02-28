package Gun20;

import java.util.Scanner;

public class tryingBoard_1 {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner scan=new Scanner(System.in);

        System.out.print("1. sayiyi girin : ");
        int sayi1= scan.nextInt();

        System.out.print("2. sayiyi girin : ");
        int sayi2= scan.nextInt();

        int enb = enbBulYazdir(sayi1,sayi2);

        System.out.println("enb = " + enb);

    }

    public static int enbBulYazdir(int sayi1, int sayi2) {

        if(sayi1>sayi2){
           return sayi1;
        }else {
            return sayi2;
        }
    }
}

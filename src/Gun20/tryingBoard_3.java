package Gun20;

import java.util.Scanner;

import static Gun20._04_JavaMethod.toplamBul;

public class tryingBoard_3 {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

        Scanner scan=new Scanner(System.in);

        System.out.print("bir sayi girin : ");
        int sayi1= scan.nextInt();

        System.out.print("bir sayi girin : ");
        int sayi2= scan.nextInt();

        int toplam=toplamBulMethodu(sayi1,sayi2);
        System.out.println("toplam = " + toplam);



    }

    public static int toplamBulMethodu(int sayi1, int sayi2) {

        return (sayi1+sayi2);
    }
}

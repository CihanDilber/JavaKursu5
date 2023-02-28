package Gun20;

import java.util.Scanner;

public class tryingBoard_2 {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        //bir fonksiyonda buldurup, bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi girin : ");
        int sayi= scan.nextInt();

        int carpim=faktoryelHesapla(sayi);
        System.out.println("carpim = " + carpim);

        if(carpim%2==0){
            System.out.print("cift");
        }else {
            System.out.print("tek");
        }
    }

    public static int faktoryelHesapla(int sayi) {
        int carpim=1;
        for (int i = 1; i < sayi; i++) {
            carpim*=i;
        }
        return carpim;
    }
}

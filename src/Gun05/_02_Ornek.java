package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // girilen bir adi ekrana yazdiriniz.
        Scanner input =new Scanner(System.in);

        System.out.print("adinizi giriniz=");
        String ad= input.nextLine(); // next dersen ekrandan bir kelime okur.
        System.out.println("ad = " + ad);

        /*
          input.next();     -> bir kelime okur
          input.nextLine(); -> satırın tümünü okur

          input.nextInt();  -> int değeri okumak için
          input.nextShort();  -> short değeri okuma için
          input.nextByte();   -> byte değeri okumak için
          input.nextLong();   -> long değeri okuma için

          input.nextFloat();  -> float değeri okuma için
          input.nextDouble(); -> doublem değeri okuma için
        */



    }
}

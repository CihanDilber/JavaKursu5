package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.


        Scanner scan =new Scanner(System.in);
        String okunan;

        do{
            System.out.println("ifade giriniz");
            okunan= scan.next();

            if(!okunan.equalsIgnoreCase("x"))
            System.out.println("program calisiyor");

        }while (!okunan.equalsIgnoreCase("x"));

        System.out.println("program bitti");






    }
}

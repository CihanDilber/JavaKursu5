package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {

        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse
        // hayır yazdırınız.

        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen bir kelime veya cumle giriniz");
        String str = scan.nextLine();

        // int strLength =str.length();
        // boolean varMi = cumle.toLowerCase().contains("study");

        if (str.length()>10 && str.toLowerCase().contains("study"))    // buyuk harf il girileni yakalasin diye lowercase yaptik
            System.out.println("Evet");                                // iki sart var burada
        else
            System.out.println("Hayir");

    }
}

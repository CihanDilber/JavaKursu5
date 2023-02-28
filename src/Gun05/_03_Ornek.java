package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanicidan Adini ve soyadini alarak ekrana yazdiriniz.

        Scanner oku =new Scanner(System.in);  // bunu copy paste yapabiliriz , okuma islemini yapacak olan degisken tanimlandi
        System.out.print("Adiniz ve soyadiniz ="); // ekrana neyin girilecegini yazdik bilgilendirme olarak
        String adSoyad= oku.nextLine(); // okuma islemi bu noktada yapiliyor

        System.out.println("adSoyad = " + adSoyad); // verinin gercekten okunabildigini tekrar ekrana yazarak kontrol ettim.


    }
}

package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen bir stringin son harfini yazdiriniz // kullanicidan aliyoruz yani
        Scanner oku = new Scanner(System.in);   // once scanner

        System.out.print("Bir cumle giriniz="); // sonra ekranda gorunmesini istedgini yazdi
        String cumle = oku.nextLine();    // string i okuttuk

        // bugun kelimesi olsa son harfin oda numarasi uzunlugun nesi? bir eksigi olur. onun icin lengt i bulduk ilk once
        int uzunluk=cumle.length();
        char sonHarf= cumle.charAt(uzunluk-1);  //charAt(0) dersek ilk harfi alir her zaman  // her zaman son harf uzunluk - 1 dir

        System.out.println("sonHarf = " + sonHarf);

        //2. yontem

        System.out.println("son Harf="+ cumle.charAt(cumle.length()-1));

    }
}

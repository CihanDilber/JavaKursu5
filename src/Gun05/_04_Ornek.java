package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.

        Scanner oku =new Scanner(System.in);

        System.out.print("Adiniz=");  // ln demedikki yan yana yazsin diye
        String ad = oku.nextLine();  // bir kelime yazacaksa next. isim iki tane olsa nextline kullanmak gerekirdi.

        System.out.print("Soyadiniz=");
        String soyad=oku.nextLine();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("Adiniz ve soyadiniz="+ad+" "+soyad);
    }
}

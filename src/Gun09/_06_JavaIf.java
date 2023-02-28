package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {

        // girilen bir cumlede a harfinin gecip gecmedigini
        // bulunuz , geciyor ise EVET , gecmiyor ise HAYIR yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz ");
        String cumle = scan.nextLine();

        if (cumle.contains("a"))
            System.out.println("EVET");

        if (!cumle.contains("a"))  // ! isareti degilse demek
            System.out.println("HAYIR");

        // 2. yol
        if (cumle.indexOf("a") != -1) // var ise index indexi verir zaten  // -1 den farkli ise demek
            System.out.println("EVET");

        if (cumle.indexOf("a") == -1)  // -1 e esitse diyoruz burada //
            System.out.println("HAYIR");

        //3.Yol
        boolean varMi=cumle.contains("a");
        if (varMi == true)  // if (varMi)
            System.out.println("EVET");

        if (varMi == false)
            System.out.println("HAYIR");




    }
}

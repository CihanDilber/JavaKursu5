package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("Toplama islemi = ");
        System.out.println("a+b sonucu "+ (a+b));  // 14

        System.out.println("Cikartma islemi =");
        System.out.println("a-b sonucu "+ (a-b));  // 4

        System.out.println("Carpma islemi =");
        System.out.println("a * b sonucu "+ (a*b));  // 45

        System.out.println("Bolme islemi =");
        System.out.println("a/b sonucu "+ (a/b));  // 1

        // normal sonuc 1.8 , fakat tam sayinin tam sayiya bolumunde kusurat atilir.
        // bu sebeple sonuc 1 olur yuvarlama yapmaz. cunku int/int
        // tam sonuc istersen bir tanesini double a cevirmen yeterli

        System.out.println("(double)a/b sonucu = " + ((double)a/b));  // burada sonuc 1.8 cikar

        System.out.println("Modul islemi");
        System.out.println("a % b sonucu = " + (a % b));  // 9/5 => 4  // bolumden kalan
        System.out.println("b % a sonucu = " + (b % a));  // 5/9 => 5
        //  kisa onemli not
        // modul (%) de
        // sol buyuk ise kalani al
        // sol kucuk ise soldakini al
    }
}

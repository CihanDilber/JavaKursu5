package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {


        System.out.println("program basladi");

        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("sayi1=");
            int sayi1 = scan.nextInt();

            System.out.println("Sayi2=");
            int sayi2 = scan.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

           // String kelime="";     // genel hataya dusmesi icin yapildi
           // kelime.charAt(3);

        }
        catch (InputMismatchException ex){  // belirli bir hata , ayni switch case gibi calisir
            System.out.println("Lutfen sayi giriniz");
        }
        catch (ArithmeticException ex){  // belirli bir hata
            System.out.println("sifira bolme hatasi");
        }
        catch (Exception ex){  // YUKARIDAKILERIN DISINDAki hatalar icin
                               // genel hata en altta olmasi lazim basa alinmaz
            System.out.println("hata olustu "+ex.getMessage());
        }


        System.out.println("Program bitti");
        }
    }





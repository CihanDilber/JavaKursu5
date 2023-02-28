package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz. for ile yapalim
        // Bu gun hava cok guzel -> 5


        Scanner scan=new Scanner(System.in);
        System.out.print("cumle giriniz : ");
        String cumle= scan.nextLine();              // Stringler karakter dizisidir

        int boslukSayisi=0;
        for (int i = 0; i < cumle.length(); i++) {
            if(cumle.charAt(i)==' '){
               boslukSayisi++;
            }
        }
        System.out.println("kelime sayisi = " + (boslukSayisi+1));
    }
}

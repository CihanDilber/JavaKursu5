package Gun17;

import java.util.Scanner;

public class tryingBoard_3 {
    public static void main(String[] args) {
        // kullanicidan alacaginiz cumleyi kelimelerine gore alt alta yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("cumle girin : ");
        String cumle= scan.nextLine();

        String[] kelimeler=cumle.split(" ");

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler[i] = " + kelimeler[i]);

        }
    }
}

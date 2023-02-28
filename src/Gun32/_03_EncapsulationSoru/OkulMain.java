package Gun32._03_EncapsulationSoru;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);

        Okul yeniOkul = new Okul("Kabatas okulu",3); // maxOgr 3

        do{



        }while (yeniOkul.getOgrenciler().size()< yeniOkul.getKontenjan());

    }
}

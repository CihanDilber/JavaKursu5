package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız  kg/ (boy*boy)

        Scanner oku =new Scanner(System.in);

        System.out.print("Kilonuz=");
        double kilo = oku.nextDouble();

        System.out.print("Boyunuz=");
        double boy = oku.nextDouble();

        double vucutKitleEndeksi =kilo/ (boy*boy);
        System.out.println("boyunuz="+boy+", kilonuz="+kilo);

        System.out.println("vucutKitleEndeksi = " + vucutKitleEndeksi);

        }

    }


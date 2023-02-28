package Gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen ders adi ve notunu araya : koyarak yaziniz");
        String dersVeNot = scan.nextLine();

        // int ogrNot2= Integer.parseInt( dersVeNot.replaceAll("[^0-9]", "") );  // 0-9 arasindakilerin disindakileri sil demek

        int ind=dersVeNot.indexOf(":");
        int ogrNot= Integer.parseInt(dersVeNot.substring(ind+1));

        if (ogrNot>=90 && ogrNot<=100){
            System.out.println("A");
        } else if (ogrNot>=80) {
            System.out.println("B");
        } else if (ogrNot>=70) {
            System.out.println("C");
        } else if (ogrNot>=60) {
            System.out.println("D");
        }
          else if (ogrNot>=40) {

            System.out.println("E");
        }
          else if (ogrNot>=0 && ogrNot<40)
            System.out.println("F");
          else
            System.out.println("hatali giris");
    }
}

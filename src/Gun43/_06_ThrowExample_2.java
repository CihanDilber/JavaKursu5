package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni sifre olusturma");

        System.out.println("Yeni sifreniz=");
        String newPassword= scan.nextLine();

        try
        {
            if(newPassword.length()<8)  // bu mesaj ile suni hata olusturuyoruz
                throw new Exception("sifre en az 8 karakterden olusmali");
            if(newPassword.length()>15)  // bu mesaj ile suni hata olusturuyoruz
                throw new Exception("Sifre en fazla 15 karakterden olusmali");

        }
        catch (Exception ex)
        {
            // hatalar bir yere toplanip hepsi icin yapilmasi gereken islemler
            // bir arada burada yapilabilir. mesela log tutma gibi
            System.out.println("lutfen dikkat...");
            System.out.println(ex.getMessage());
            //log tutma

        }
    }
}

package Gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=oku.nextLine();

        for(int i=0;i<cumle.length();i++)   // int i burada sirada ki harf anlaminda
        {
            if (cumle.charAt(i)==' ')
                continue;

            System.out.println(cumle.charAt(i));  // 0 indeksli harf, 1 indexli harf, 2 ...uzunluk-1 e kadar
        }
    }
}
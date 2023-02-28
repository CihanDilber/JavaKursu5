package Gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1;  // sayacin degerini 1 tane artiriyor : 1
        sayac++;  // sayacin degerini 1 tane artirir : 2 olur  // ust satirin yerine bunu kullanabiliriz
        ++sayac;  // bu da ayni seyi yapar bir tane artirir 3 olur bu sefer.

        sayac=sayac-1; // sayacin degerini 1 tane azaltir : 2 olur
        sayac--;       // sayacin degerini 1 tane azaltir : 1 olur
        --sayac;       // sayacin degerini 1 tane azaltir : 0 olur

        System.out.println("sayac = " + sayac);

        /*************************************/

        int toplam= 5 + sayac;  // 5 olur
        System.out.println("toplam = " + toplam); // 5
        System.out.println("sayac = " + sayac);   // 0

        toplam = 5 + sayac++;   // toplam = 5+sayac sonra islem. sayac=sayac + 1  // toplam=5 ve sayac= 1 oldu
        System.out.println("toplam = " + toplam);  // 5
        System.out.println("sayac = " + sayac);    // 1

        toplam = 5 +  ++sayac; // sayac=sayac+1 sonra toplam=5+sayac  yani 7 olur
        System.out.println("toplam = " + toplam);  // 7
        System.out.println("sayac = " + sayac);    // 2

        // ozet : ++lar sagda ise once islem sonra artis
        //        ++ lar solda ise once artis sonra islem


    }
}

package Gun05;

import java.util.Scanner;  // bu komut olunca yeni sayi okunuyor. cikmazsa uzerine gel import de

public class _01_JavaScanner {
    public static void main(String[] args) {
        // tipi   adi    ilk degeri        islem tamam bu adimi calistir
            int   sayi =     0;

        Scanner okuyucu = new Scanner(System.in);  // hep int olacaksa bir defa tanimlama yapman yeterli. String okuyacaksan ayrica scanner tanimla.
        //tipi   adi      yeni okuyucu (klavyeden - konsoldan)

        System.out.print("Sayi giriniz=");   // oncesinde bunu yazalim ki asagida daha acik olsun. ln yazmadik ki ayni satirda olsun.
        sayi = okuyucu.nextInt(); // kursor bekliyor sayi girisi icin  // sayi girecegimiz icin nextInt dedik
        // rakam girilip entera basildiginda degeri alip sayiya atiyor.

        System.out.println("sayi = " + sayi);
    }
}

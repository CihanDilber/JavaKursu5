package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program calismaya basladi");

        try {  // dene, hatanin basladigi yerin ustune konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);

        } // hata oldugu zaman programi kirma
        catch (Exception ex)
                // ex isimli degiskende olusan hatalarin bilgisi ataniyor
        {   // hata oldugunda yapilmasi istenenler buraya yaziliyor
            System.out.println("hata olustu lutfen tekrar deneyiniz");
            System.out.println("tum hata mesaji ="+ex);
            System.out.println("Hatanin aciklamasi="+ex.getMessage());
            // kendine hata mesajini mail atabilirsin
            // log tutma: program nasil calisiyor, hata loglarini harddiske yazabilirsin
        }
        System.out.println("Program bitti");

        try {

            // java ve toolari calismaya devam et
            // konulari ogrenmeye ve calismaya devam
            // anlamadigin yer mi oldu? kirilmadan devam et:

        }catch (Exception ex){
            // hatanin sebebini anla
            // derse daha fazla odaklan
            // gereken videolari izle
            // grup calismasi yap
            // ogren ve kirilmadan devam et
            // unutma sen bir soz verdin devam...

        }
        // sonunda seni guzel bir meslek bekliyor.
    }

}

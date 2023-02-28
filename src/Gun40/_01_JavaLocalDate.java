package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate sadece gun ay yil bilgisini tutar

        LocalDate tarih=LocalDate.now();  // Bunlari windowsdan aliyor o anda

        // burada yukarida ki toplu yazilani parca parca almis olduk
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        // kendisinde ki hazir formatlara bakalim

        System.out.println("ISO_DATE0 "+tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT ="+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));  // localde ki formati verdi burada
        System.out.println("MEDIUM ="+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG  ="+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL ="+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n*****************");

        // Localde aldigim tarihi istedigim ulkenin formatina gore diline gore nasil gosteririm?
        // ornegin localdeki saati Almanya ya nasil gosteririz

        System.out.println("FULL Almanya gosterimi  ="+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        // lokalizasyon tanimlamasi
        // en-US : birincisi dili, ikincisi ulkeyi temsil ediyor. Amerikan ingilizcesi
        // en-UK : UK ingilizcesi
        // fr-CA :Kanada Fransizcasi
        // en-CA :Kanada Ingilizcesi
        // tr-TR :

        Locale[] kullanilabilirLokaller=Locale.getAvailableLocales();


        for (Locale l:kullanilabilirLokaller){
            if(l.getDisplayCountry().toLowerCase().contains("chi")){
                System.out.print("Dil = "+ l.getDisplayLanguage());
                System.out.print(", Ulke = "+ l.getDisplayCountry());
                System.out.print(", "+ l.getLanguage());
                System.out.println(" - "+ l.getCountry());
            }
        }

        Locale lokalCince=new Locale("zh","CN");
        System.out.println("Full cince gosterimi =\n"+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));


        System.out.println("\n****************Istedigim formatta gosterim*****************");
        // İstediğim formatta gösterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy = " + tarih.format(ozelFormat1));

        DateTimeFormatter oz2=DateTimeFormatter.ofPattern("d.MM.yy");
        System.out.println("tarih d.M.yy = " + tarih.format(oz2));

        DateTimeFormatter oz3=DateTimeFormatter.ofPattern("EEEE dd.M.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy = " + tarih.format(oz3));

        DateTimeFormatter oz4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy = " + tarih.format(oz4));

        System.out.println("ozel format ve loc EEEE dd.MM.yyyy = " + tarih.format(oz3.withLocale(Locale.UK)));

        DateTimeFormatter oz5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy = " + tarih.format(oz5));


        System.out.println("\n***************");
        //Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5

        LocalDate tarih1= LocalDate.of(2000,5,20);
        LocalDate tarih2= LocalDate.of(1999, Month.MARCH, 12);
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));



    }
}

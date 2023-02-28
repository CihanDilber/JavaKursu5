package Gun31._03_Enum;
    // tam bir class degil burasi kendi ozellikleri var
import sun.security.ec.ECPrivateKeyImpl;

public enum Aylar {

    OCAK(1, 31, "Ocak"),
    SUBAT(2, 28, "Subat"),
    MART(3, 31, "Mart"),
    NISAN(4, 30, "Nisan"),
    MAYIS(5, 31, "Mayis"),
    HAZIRAN(6, 30, "Haziran"),
    TEMMUZ(7, 31, "Temmuz"),
    AGUSTOS(8, 31, "Agustos"),
    EYLUL(9, 30, "Eylul"),
    EKIM(10, 31, "Ekim"),
    KASIM(11, 30, "Kasim"),
    ARALIK(12, 31, "Aralik");

    final int ayNo;         // final icin kendisi uyari verdi.
                             // degismeyecek ya zaten
                             // nurayi yukarisi icin kendisi icin kullaniyor
    final int gunMiktar;
    final String ayAd;

     // burasi otomatik yazdirmiyor. manuel yazdiriyoruz
    Aylar(int ayNo, int gunMiktar, String ayAd) {
        this.ayNo=ayNo;
        this.gunMiktar=gunMiktar;
        this.ayAd=ayAd;
    }
}

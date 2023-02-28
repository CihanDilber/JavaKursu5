package Gun31._01_Enum;

public class Ornek1Cozum {
           // tanimsiz kismini ocak ayi 1 alsin diye ekledik. 0 i aldi o numara olarak
    enum Aylar {   // best practice olarak buyuk harf yazilir. kucukde olur
        Tanimsiz, OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN,
        TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
    }

    public static void main(String[] args) {

        Aylar ay=Aylar.MAYIS;  // burada tanimladik

        switch (ay){
            case SUBAT: System.out.println(28); break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK: System.out.println(31); break;
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL: System.out.println(30); break;

        }
        System.out.println("ay = " + ay); // toString
        System.out.println("ay.name() = " + ay.name()); // simge olarak kullanilan kelimeyiverir
        System.out.println("ay.ordinal() = " + ay.ordinal()); // simgenin indeksini verir

        for(Aylar a : Aylar.values())
            System.out.println(a.name()+" - "+a.ordinal());

    }
}
// Yazılım dillerinde enum, enumaration ve enum sabitleri
// olarak adladırılmaktadır. Tanımlanan değişkenlerin
// sabit değer alması için kullanılır. Tanımlanan
// bu sabit değerler bir grup oluşturur. Erişilmesi,
// yönetilmesi ve anlaşılması kolay hale gelir.

//bir sürü girilmesi gereken datayı  tek seferde
// parti halinde giriyoruz,daha sonra kullanması
// da kolay yazması da kolay oluyor
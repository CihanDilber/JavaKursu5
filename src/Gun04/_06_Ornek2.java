package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ (boy*boy)

        double kg=78;
        int boy=179;

        double kitleIndex= kg / (boy*boy);  // ondalikli sayi olacagi icin double
        System.out.println("Boyunuz="+boy+ " "+"Kilonuz="+kg);
        System.out.println("kitleIndex = " + kitleIndex);

        /*************************************************************/
        double boy2=1.79;             // bu ikinci cozum
        double kitleIndex2= kg / (boy2*boy2);
        System.out.println("kitleIndex2 = " + kitleIndex2);
    }
}

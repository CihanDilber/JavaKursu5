package Gun38._01_Abstract;

public class otoMain {
    public static void main(String[] args) {
        // Rfrns    // nesne tipi
        Ford fr=new Ford("mustang",1995,4);  // Ford normal bir class ve nesne olusturulabilir yani new yapilabilir

        // Interface lerden nesne olusturulamaz sadece referans tip olabilirler
        // IBinekOto ib=new IBinekOto();

        // Abstract classlardan... tamamla burayi


        //Somut Class       Soyut(abstract) Class      Interface
        //tamamı dolu        kısmi dolu                metodlar bos
        //def const var      const olabilir            const olamaz
        //new yapılabilir    new olamaz                new olamaz
        //access modify var  access modify var         public-def
        //tamamen somut      kısmi somut               tamamen soyut


    }
}

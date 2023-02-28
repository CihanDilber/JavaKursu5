package Gun33._02_Inheritance;

public class HayvanatBahcesi {
//    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.(ses cikardi)

    public static void main(String[] args) {

        Kopek kopek1=new Kopek("siyah",20,"kangal");
        kopek1.konustu();

        Kedi kedi1=new Kedi("beyaz",5,"tekir");
        kedi1.konustu();

        Ordek ordek1=new Ordek("yesil",2,"govel",60);
        ordek1.konustu();

        Yilan yilan1=new Yilan("gri",1,"engerek",80);
        yilan1.konustu();

    }
}

package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1=new Student(1,"Cihan Dilber");
        Student ogr2=new Student(2,"Mehmet Dilber");
        Student ogr3=new Student(3,"Enes Dilber");

        // Static sayac olmadan once ki hali
        // problem : hem id yi takip etmek zorundayim
        // hem de hata olasiligi yuksek

        // burasi da static sayac in oldugu bolum, sira ile artiriyor.
        Student ogr10=new Student("Cihan Dilber");
        Student ogr11=new Student("Mehmet Dilber");
        Student ogr12=new Student("Enes Dilber");

        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);
    }
}

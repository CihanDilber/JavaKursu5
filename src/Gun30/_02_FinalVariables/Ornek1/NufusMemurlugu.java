package Gun30._02_FinalVariables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {
        Vatandas v1=new Vatandas("cihan");
        Vatandas v2=new Vatandas("enes");
        Vatandas v3=new Vatandas("aysegul");


        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //v1.tcNo=456;    // final oldugu icin sonradan degistirilemez
        // final degiskenlerine sadece bir kez veri atanabilir
        // o da ya tanimlanirken yada Constructor da

        final double pi=3.14; // tanimlarken
        // pi=5;  // sonradan degistirilemez
        //Math.PI, javanin nasil yaptigina baktim oda bizim gibi yapmis

    }


}

// final : değer atandıktan sonra değiştirilmeyi engelliyor
//         bu sebeple, hem sabit değerler için, hem de sonradan
//         değişmesini istemediğimiz değerler için kullanılır
// static sayac ise: her yeni nesne oluşturulduğunda
// yeni artan değer almasını sağlıyor
// private sadece buradan erisimi engeller. class dan degisir ama

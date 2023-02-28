package Gun36._04_Interface;

// bir class birden fazla Interface implement edebilir
public class A4 implements IGosterir, IYazdirir{
    // hem gosteriyor hem yazdiriyor
    @Override
    public void goster() {
        System.out.println("gosterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdirdi");
    }
}

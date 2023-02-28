package Gun33._02_Inheritance;

public class Kedi extends Hayvan{
    public Kedi(String renk, int kilo, String cins) {
        super(renk, kilo, cins);
    }

    @Override
    public void konustu() {
        //super.konustu();
        System.out.println("miyav miyav");
    }
}

package Gun33._02_Inheritance;

public class Yilan extends Hayvan{

    private int uzunluk;

    public Yilan(String renk, int kilo, String cins, int uzunluk) {
        super(renk, kilo, cins);
        setUzunluk(uzunluk);
    }

    @Override
    public void konustu() {
        System.out.println("tis tis");
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }


}

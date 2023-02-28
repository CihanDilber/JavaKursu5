package Gun34._03_Ornek;

public class IlkOgrencisi extends Ogrenci {

    private String kulup;

    private static int IlkIdSayac;

    public IlkOgrencisi(String isim, OgrTip tipi, String kulup) {
        super(isim, tipi, IlkIdSayac++);
        setKulup(kulup);
    }

    public String getKulup() {
        return kulup;
    }

    public void setKulup(String kulup) {
        this.kulup = kulup;
    }

    @Override
    public String toString() {
        return "IlkOgrencisi{" +
                "kulup='" + kulup + '\'' +
                "} " + super.toString();
    }
}

package Gun33._03_Inheritance;

public class GenelMudur extends Calisan{

    private int tazminat;
    public GenelMudur(String isim, double maas, double maasKatsayisi,int tazminat) {
        super(isim, maas, maasKatsayisi);
        setTazminat(tazminat);

    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+getTazminat();
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "isim=" + getIsim() +
                "maas=" + getMaas() +
                "maasKatsayisi=" + getMaasKatsayisi() +
                "tazminat=" + tazminat +
                "Ödenecek Maaş=" + maasHesapla() +
                '}';
    }

    public int getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;
    }
}

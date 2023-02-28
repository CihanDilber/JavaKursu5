package Gun33._02_Inheritance;

public class Hayvan {  // super class, base class, parent class

    private String renk;
    private int kilo;
    private String cins;

    public void konustu(){
        System.out.println("konustu");
    }

    public Hayvan(String renk, int kilo, String cins) {
        setRenk(renk);
        setKilo(kilo);
        setCins(cins);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }
}

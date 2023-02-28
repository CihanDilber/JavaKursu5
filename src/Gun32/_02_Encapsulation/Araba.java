package Gun32._02_Encapsulation;

public class Araba {
    private String renk;
    private int model;
    private double motorHacmi;
    private int kapiSayisi;

    public Araba() {  // bos constructor bu
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }

    public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {
       // burada kontrole gonderdik bu sekilde
        setRenk(renk);
       setModel(model);
       setMotorHacmi(motorHacmi);
       setKapiSayisi(kapiSayisi);

       // bu asagidakileri kapatiyoruz ki kontrollu olsun diye yukariyi
        //yazdik // ilk generate ile constructor yaptigimizda
        // bu sekilde idi

        // this.renk = renk;
       // this.model = model;
       // this.motorHacmi = motorHacmi;
       // this.kapiSayisi = kapiSayisi;


    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if(model<2023)
        this.model = model;
        else {
            System.out.println("hatali model");
        }
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        if(kapiSayisi<7)
        return kapiSayisi;
        else {
            System.out.println("hatali kapi sayisi");
        }
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }
}

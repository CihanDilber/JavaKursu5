package Gun38._02_AbstractSoru;
// ortak yonlerini ve ortak ozelliklerini al isteyen kullansin icini doldurup=Abstract Class
public abstract class Sekil {
    private String name;

    // public yazmasanda olur
    public abstract double alan();   // bunlar soyut metot
    public abstract double cevre();

    public void ciz(){  // bu somut oluyor
        System.out.println(name+" isimli sekil cizildi");
    }

    @Override
    public String toString() {
        return "Sekil" +
                "\nname='" + name + '\'' +
                "\nalan='" + alan() + '\'' +
                "\ncevre'" + cevre() + '\'' +
                "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

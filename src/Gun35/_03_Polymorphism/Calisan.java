package Gun35._03_Polymorphism;

public class Calisan extends Kisi{

    private String Departmani;

    public Calisan(String ad, String soyad, String gorevi, String departmani) {
        super(ad, soyad, gorevi);
        setDepartmani(departmani);
    }

    public String getDepartmani() {
        return Departmani;
    }

    public void setDepartmani(String departmani) {
        Departmani = departmani;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "Departmani='" + Departmani + '\'' +
                "} " + super.toString();
    }
}

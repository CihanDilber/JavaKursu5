package Gun30._02_FinalVariables.Ornek1;

public class Vatandas {

    String isim;
    final int tcNo; // degistirilemez
    // yani sadece 1 kez verme sansi var

    static int tcNoSayac=1;


    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac++;  // bunu sonradan yaziyoruz

        // final degiskenlerine sadece 1 kez veri atanabilir
        // o da ya tanimlanirken yada Constructor da
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}

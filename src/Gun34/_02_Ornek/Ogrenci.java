package Gun34._02_Ornek;
// enumu burada public yazmadan kullanirsak da her yerde kullanabiliriz
public class Ogrenci {
    private final int id;
    private String isim;
    private OgrTip tipi;      // ONCE ENUMU TANIMLADIK sonra burayi yazdik

    private static int idSayac=1;

    public Ogrenci(String isim, OgrTip tipi) {
        setIsim(isim);
        setTipi(tipi);
        this.id=idSayac++;  // sayactan alip verdigimiz icin
    }

    public int getId() {
        return id;
    }
    // set id yi sildik. Constructor a aldik final yaptigimiz icin

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }

    public static int getIdSayac() {
        return idSayac;
    }

    public static void setIdSayac(int idSayac) {
        Ogrenci.idSayac = idSayac;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }
}

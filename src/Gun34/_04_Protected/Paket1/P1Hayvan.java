package Gun34._04_Protected.Paket1;

public class P1Hayvan {

    public String ad;  // her paketten her yerden ulasilir
    int yas;   // sadeece bulundugu pakettekiler
    protected String cinsi;  // default gibi ancak diger paketlkerden de bir durumda erisilebilir
    private String renk;  // sadece kendi classindan erisilir
}

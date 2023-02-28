package Gun29._03_Protected.bir;

public class Doktor {

    // kendi paketinden private disi hepsine eristik
    // baska paketten sadece public olana eristik
    // protected ile yazilmadigi zaman default olan ayni islevde simdilik

    protected String adi;  // default ile ayni protected

    String bolumu;  // default
    private String SicilNo;  // private
    public String hastaneAdi;  // public

    Doktor(){  // default constructor

    }

    public Doktor(String adi){  // public constructor
        this.adi=adi;
    }
}

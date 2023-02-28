package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="kopek";  // sadece ada ulasabildik
        //p1h.yas  default oldugu icin diger paketten erisemedim
        //p1h.cinsi  protected oldugu icin diger paketten erisemedim
    }
}

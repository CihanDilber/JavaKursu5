package Gun38._03_AbstractSoru;

public class YemekDunyasi {
    public static void main(String[] args) {

        Baklava b=new Baklava();
        b.setName("Baklava");
        b.madeIn();
        b.taste();

        GreekSalad g=new GreekSalad();
        g.setName("GreekSalad");
        g.madeIn();
        g.taste();

        CheeseCake c=new CheeseCake();
        c.setName("CheeseCake");
        c.madeIn();
        c.taste();

        SezarSalad s=new SezarSalad();
        s.setName("SezarSalad");
        s.madeIn();
        s.taste();
    }
}

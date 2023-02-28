package Gun38._02_AbstractSoru;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen(5,4);
        d.setName("yeni dikdortgen");
        d.ciz();
        System.out.println(d);


        Daire dr=new Daire(4);
        dr.setName("yeni daire");
        dr.ciz();
        System.out.println(dr);
    }
}

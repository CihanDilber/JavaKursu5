package Gun36._06_Interface;
// tek bir interface uzerinden yapmak icin burada
// extends ile alip yaptik
public class Kare extends Dikdortgen{
    // override yapmadik yeni method yaptik
    public double alan(int kenar){
        return super.alan(kenar,kenar);
    }

    public double cevre(int kenar){
        return super.cevre(kenar,kenar);
    }
}

package Gun38._02_AbstractSoru;

public class Daire extends Sekil{

    private double yariCap;

    public Daire(double yariCap) {
        setYariCap(yariCap);
    }

    @Override
    public double alan() {
        return Math.PI*yariCap*yariCap;
    }

    @Override
    public double cevre() {
        return Math.PI*yariCap*2;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }
}
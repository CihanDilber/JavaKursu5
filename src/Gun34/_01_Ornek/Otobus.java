package Gun34._01_Ornek;

public class Otobus extends Arac{

    private int yolcuKapasitesi;

    public Otobus(String renk, double motorHacmi, String marka, int yolcuKapasitesi) {
        super(renk, motorHacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }


    @Override
    public String toString() { // bunu generate ile yapip sonuna motorHacmi ekledik
        // veya manuel yapacagiz  // alt satir ilk hali
       // return super.toString()+getYolcuKapasitesi();  // ilk basta boyle ekledik

        return getRenk()+"\n"+getMotorHacmi()+"\n"+getMarka()+"\n"+getYolcuKapasitesi();
    }
}

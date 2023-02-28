package Gun39._05_OOP_Soru;

public class Borsch implements IFood{
    @Override
    public void taste() {
        System.out.println("Sicak sebze corbasi");
    }

    @Override
    public double ucret() {
        return 40;
    }

    void boil(){
        System.out.println("Kisik ataeste kaynatiliyor");
    }

    void eatTomorrow(){
        System.out.println("Bir gun sonra servis edilir");
    }
}

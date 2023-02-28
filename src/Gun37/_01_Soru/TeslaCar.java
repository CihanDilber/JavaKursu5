package Gun37._01_Soru;

public class TeslaCar extends Vehicle implements IElectric{
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Batarya 9 yil omru var";
    }

    @Override
    public String drive() {
        return "Auto pilot ozelligi var";
    }
}


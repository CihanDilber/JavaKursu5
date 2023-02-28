package Gun37._01_Soru;
// hem elektrik hem gas implement ettik burada
public class ToyotaPrius extends Vehicle implements IElectric, IGas{


    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "omur boyu kullan";
    }

    @Override
    public String changeOil() {
        return "bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return "ilk uc km elektrik ile gider";
    }
}

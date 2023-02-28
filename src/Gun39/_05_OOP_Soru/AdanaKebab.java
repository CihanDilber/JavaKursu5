package Gun39._05_OOP_Soru;

public class AdanaKebab implements IFood{
    @Override
    public void taste() {
        System.out.println("Etin en guzel hallerinden biri");
    }

    @Override
    public double ucret() {
        return 75;
    }

    void marinade() {
        System.out.println("Et dunden baharatlar ile terbiye edildi");
    }

    void grill() {
        System.out.println("komur atesinde yavas pisirildi");
    }
}

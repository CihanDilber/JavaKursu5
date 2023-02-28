package Gun38._01_Abstract;

public class Ford extends BinekOto implements IBinekOto{

    public Ford(String marka, int uretimYili, int vitesAdedi) {
        super(marka, uretimYili, vitesAdedi);
    }

    @Override
    public int HizlanmaSuresi() {
        return 0;
    }
}

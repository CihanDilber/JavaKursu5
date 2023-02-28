package Gun29.Soru;

public class Hesap {
    private int toplamYatan=0;
    private int toplamCekilen=0;
    private int bakiye=0;

    void paraYatir(int yatanPara) {  // sadeece burasi kullanacaksa
                                     // public yazma basa

        toplamYatan+=yatanPara;
        bakiye+=yatanPara;
    }


    void paraCek(int cekilenPara) {

        toplamCekilen+=cekilenPara;
        bakiye-=cekilenPara;
    }


    @Override
    public String toString() {
        return "Hesap{" +
                "toplamYatan=" + toplamYatan +
                ", toplamCekilen=" + toplamCekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}

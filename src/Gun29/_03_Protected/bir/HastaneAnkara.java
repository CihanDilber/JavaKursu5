package Gun29._03_Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doktor dok1=new Doktor();
        dok1.adi="ismet";
        dok1.bolumu="dahiliye";
        dok1.hastaneAdi="Ankara Hastanesi";
        //dok1.SicilNo private

        Doktor dok2=new Doktor("Mehmet");
    }
}

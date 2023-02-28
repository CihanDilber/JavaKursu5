package Gun35._01_Final.classFinal;



public class ArabaMain {
    public static void main(String[] args) {
        Tasitlar t1=new Tasitlar();
        t1.model="opel";

        Tasitlar t2=new Tasitlar();
        t2.model="opel";

        // Final class olursa main de kullanim kisminda bir sinirlama yok

        // class final olursa eger mainde birden fazla cagrilabiliyor
        // fakat baska class a extend edilemez

    }
}

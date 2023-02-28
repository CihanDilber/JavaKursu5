package Gun45;

public class Soru164 {
    public static void main(String[] args) {  // cevap A
        int data[]={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;

        for (int e:data){
            if(e !=key){
                continue;  // ayni parantez icinde olursa continue sonrasinda ki calismaz
              //  count++;  // continue dan hemen sonra oldugu icin calismaz bu
            }
            count++;  // burada olsa calisirdi ve 2 Found yazardi iki tane 2014 oldugu icin
        }
        System.out.println(count+"found");  // Compile Error
    }
}

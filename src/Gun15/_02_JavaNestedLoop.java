package Gun15;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {

        // 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ....

        // 5 (dahil) lere kadar halini yapınız

        for(int i=1; i<=5; i++){                               // burasi 1ler ikiler ....
            for (int j=1; j<=10; j++){                        // ilk once buradan basla. 1 den ona kadar
                System.out.println(i+"x"+j+"="+(1*j));
        }


        }
        System.out.println();

    }
}

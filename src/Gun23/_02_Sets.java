package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS

        //HashSet : Hizli, bunun icin kendine gore algoritmik sirada tutar

        //LinkedHashSet : EKLEME SIRASI na gore sirali tutar

        //TreeSet : her zaman icinde SIRALI sekilde tutar kendinden sortlu yani


        //Hizli, bunun icin kendine gore algoritmik sirada tutar
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs);


        // EKLEME SIRASI na gore sirali tutar
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("lhs = " + lhs);


        //her zaman icinde SIRALI sekilde tutar kendinden sortlu yani
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts = " + ts);
    }
}

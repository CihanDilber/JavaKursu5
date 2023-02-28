package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Map = Anahtar + Set -> Anahtarlı Set

        // anahtarın tipi Integer, değerinin tipi String olsun
        // index i kendimiz verebiliyoruz burada. adi key onunda.

        HashMap<Integer, String> hm = new HashMap<>();     // ilki key(K) sonra ki de value(V) oluyor. // iki eleman olur
        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Cihat Yilmaz");
        hm.put(2001, "Talip Yildiz");
        hm.put(5001, "Eyupcan Bilgin");
        hm.put(1002, "Hatice Bayrak");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(5001) = " + hm.get(5001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));

        System.out.println("hm.keySet() = " + hm.keySet());  // verdigimiz key lerin hepsini veriyor burada
        System.out.println("hm.values() = " + hm.values());  // tum value lari veriyor bu sekilde.

        hm.remove(5001);  // bu key de ki value yu kaldiriyor
        System.out.println("hm = " + hm);

        hm.clear();   // hepsini bosaltir
        System.out.println("hm = " + hm);
    }
}

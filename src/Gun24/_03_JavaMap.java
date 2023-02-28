package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasini 2 kisi icin yapiniz

        HashMap<String,String> uKartViziti = new HashMap<>();  // iki string verdik burada key de value de String burada
        uKartViziti.put("isim", "Ugur Yilmaz");
        uKartViziti.put("email", "ugur@gmail.com");
        uKartViziti.put("adres", "Cekmekoy/Istanbul");
        uKartViziti.put("telefon", "0505 222 22 33");

        System.out.println("uKartViziti.get(isim) = " + uKartViziti.get("isim"));
        System.out.println("uKartViziti.get(tel) = " + uKartViziti.get("telefon"));


        HashMap<String,String> aKartViziti = new HashMap<>();
        aKartViziti.put("isim", "Ayse Bayrak");
        aKartViziti.put("email", "ayse@gmail.com");
        aKartViziti.put("adres", "Sisli/Istanbul");
        aKartViziti.put("telefon", "0532 999 22 33");

        HashMap<String, HashMap<String,String> > kartvizitler=new HashMap<>(); // yeni bir hash map tanimladik
                                                                               // icine iki tane kartvizit atadik

        kartvizitler.put("ugur", uKartViziti);
        kartvizitler.put("ayse", aKartViziti);

        System.out.println("ugurun kartviziti = "+ kartvizitler.get("ugur"));
        System.out.println("aysenin kartviziti = "+ kartvizitler.get("ayse"));

        System.out.println("aysenin adresi = "+ kartvizitler.get("ayse").get("adres"));  // burada aysenin adresini almis olduk

        // sadece emailleri yazdirabilir miyiz peki?  // for each ile
             //MapEntry                                     // burasi hem key hem value
        for (Map.Entry<String, HashMap<String,String>> kv : kartvizitler.entrySet() )
        {
            System.out.println("emailler = "+ kv.getValue().get("email"));
        }


    }
}

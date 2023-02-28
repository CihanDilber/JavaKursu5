package Gun25._05_Soru;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class BordroProgrami {
    public static void main(String[] args) {

        ArrayList<Calisan> calisanListesi=new ArrayList<>();

        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);



        for (int i = 0; i < 3; i++) {

            Calisan personel=new Calisan();  // bir personel olusuyor burada

            System.out.print((i+1)+". kisi icin Bordro No girin : ");
            personel.bordroNo=scanInt.nextInt();

            System.out.print((i+1)+". kisi icin tam ad girin : ");
            personel.tamAdi=scanStr.nextLine();

            System.out.print((i+1)+". kisinin maasini girin : ");
            personel.maasi=scanInt.nextInt();

            calisanListesi.add(personel);


        }

        calisanIsimleriniYazdir(calisanListesi);
        maasOrtalamasiniYazdir(calisanListesi);
        enFazlaVeEnAzMaasAlanlariYazdir(calisanListesi);

    }

    public static void enFazlaVeEnAzMaasAlanlariYazdir(ArrayList<Calisan> calisanListesi) {
        int enDusukMaas=calisanListesi.get(0).maasi;
        String enDusukMaasAlan=calisanListesi.get(0).tamAdi;

        int enYuksekMaas=calisanListesi.get(0).maasi;
        String enYuksekMaasAlan=calisanListesi.get(0).tamAdi;

        for (int i = 0; i < calisanListesi.size(); i++) {
            if(enYuksekMaas<calisanListesi.get(i).maasi){
                enYuksekMaas=calisanListesi.get(i).maasi;
                enYuksekMaasAlan=calisanListesi.get(i).tamAdi;
            }
            if(enDusukMaas>calisanListesi.get(i).maasi){
                enDusukMaas=calisanListesi.get(i).maasi;
                enDusukMaasAlan=calisanListesi.get(i).tamAdi;
            }

        }
        System.out.println("enYuksekMaas = " + enYuksekMaas);
        System.out.println("enYuksekMaasAlan = " + enYuksekMaasAlan);

        System.out.println("enDusukMaas = " + enDusukMaas);
        System.out.println("enDusukMaasAlan = " + enDusukMaasAlan);
    }

    public static void maasOrtalamasiniYazdir(ArrayList<Calisan> calisanListesi) {
        int toplamMaas=0;
        for (Calisan maaslar : calisanListesi){
            toplamMaas+=maaslar.maasi;
        }
        int ortalama= toplamMaas/calisanListesi.size();
        System.out.println("maas ortalamasi = " + ortalama);
    }

    public static void calisanIsimleriniYazdir(ArrayList<Calisan> calisanListesi) {
        for (Calisan isimleri : calisanListesi){
            System.out.println("isimleri = " + isimleri.tamAdi);
        }
    }

}


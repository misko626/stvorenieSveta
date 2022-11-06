package com.company;

import com.company.space.Space;
import com.company.tools.EarthLivingBeingsExtractor;
import com.company.tools.MessageReader;
import com.company.vesmirneTelesa.*;
import com.company.zive_tvory.bezstavovce.Hmyz.Mucha;
import com.company.zive_tvory.clovecina.Clovek;
import com.company.zive_tvory.clovecina.Muz;
import com.company.zive_tvory.clovecina.Zena;
import com.company.zive_tvory.stavovce.Ryby.Kapor;
import com.company.zive_tvory.stavovce.Ryby.Nemo;
import com.company.zive_tvory.stavovce.Vtaky.Orol;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //object type Space
        Space myFirstUniverse = new Space("Michal", false, 0);

        myFirstUniverse.startSpace();

//        Hmlovina andromena = new Hmlovina();
//        Hmlovina anastazia = new Hmlovina();
//        Hmlovina spaceDust123 = new Hmlovina();

        Zem MatickaZem = new Zem("Zem",59722*Math.pow(10,24),12756);

        //pole planet s kapacitou 1000 planét
//        Planeta[] pole_planet = new Planeta[1000];
//        int i=0;
//        // vytvorenie 1000 planet
//        while(i<1000)
//        {
//            pole_planet[i]=new Planeta();
//            i++;
//        }

        MatickaZem.setPlanetaryWeight(MatickaZem.getVaha() - 2000000);
        //vytvorenie slnka
        Hviezda Slnko = new Hviezda("Slnko", (1.989), 696340, 5500);

        //vytvorenie planet spnacnej sustavy

//        Planeta Mercur = new Planeta();
//        Planeta Venusa = new Planeta();
//        Planeta Mars = new Planeta();
//        Planeta Jupiter = new Planeta();
//        Planeta Saturn = new Planeta();
//        Planeta Uran = new Planeta();
//        Planeta Neptun = new Planeta();
//        Planeta Pluto = new Planeta();

        //----------------------------------DOMACA ULOHA 1 ZA BODY ------------------------------

        Slnecna_sustava slnecna_sustava = new Slnecna_sustava();
        slnecna_sustava.addTeleso(MatickaZem);

        //vytvorenie Galaxie a pridanie Slnecnej sustavy do pola vesmirnych sustav

        Galaxia Mliecna_cesta = new Galaxia();
        Mliecna_cesta.addSustava(slnecna_sustava);

        Galaxia Popovic = new Galaxia();
        Popovic.sendMessageToGalaxy("Ahoj ja som Galaxia Popovic a posielam spravu do galaxie Mliecna_cesta", Mliecna_cesta);

        //Vytvorenie sustavy ciernych dier
        Sustava_ciernych_dier Sustava_cierneDiery = new Sustava_ciernych_dier();
        Sustava_cierneDiery.vcucniSustavu(Mliecna_cesta, slnecna_sustava);


        //odchytenie spravy z galaxie Popovic do galaxie Mliecna_cesta (men in the middle) :D :D
        System.out.println(Mliecna_cesta.getSpravaZGalaxie());

        //----------------------------------DOMACA ULOHA KONIEC ------------------------------


        //pokracuj vytvorenim kapra

        //vytvaranie zvierat
        Kapor vianocnyKapor = new Kapor("vianocnyKapor",50);
        Date dNow = new Date();
        vianocnyKapor.born(dNow);
        Nemo nemo = new Nemo("nemo",30);
        Orol orolOrlikovsky = new Orol("orolOrlikovsky",30);
        Mucha vinnaMuska = new Mucha("vinnaMuska");
        Kapor druhyKapor = new Kapor("druhy kapor",33);

        //pridanie zvierat na nasu maticku zem
        MatickaZem.addTvora(vianocnyKapor);
        MatickaZem.addTvora(orolOrlikovsky);
        MatickaZem.addTvora(nemo);
        MatickaZem.addTvora(vinnaMuska);
        nemo.born(dNow);
        nemo.hybsa(10,10,10);
        vianocnyKapor.hybsa(10,10,10);

        //zobrazenie sustav kapra

        for (int i = 0; i < vianocnyKapor.getSustavy().length; i++) {
            System.out.println(vianocnyKapor.getSustavy()[i].getTyp_sustavy());
        }

        vianocnyKapor.die(dNow);
//        System.out.println(MatickaZem.getPoleTvorov());

//        for (int i = 0; i < 2; i++) {
//            //MatickaZem.addTvora(new Ryba());
//            //MatickaZem.addTvora(new Vtak());
//            //MatickaZem.addTvora(new Meduza());
//            //MatickaZem.addTvora(new KorytnackaMorska());
//            MatickaZem.addTvora(vianocnyKapor);
//        }
//        for (int i = 0; i < 2;i++) {
//            poleTvorov[i].hybsa(10, 10, 0);
//        }

//        MatickaZem.poleTvorovToString();


        MatickaZem.deleteTvora(vianocnyKapor);
        vianocnyKapor = null;


        //tvorenie ludi, prvy clovek

        Muz prvyMuz = new Muz("prvyMuz", null, null, 34, "Adam", "Prvy");
        Zena prvaZena = new Zena("prvaZena", null, null,34, "Eva", "Prva");

        System.out.println(prvyMuz);
        System.out.println(prvaZena);

        //rodenie prvych deti

        Clovek prveDieta = prvaZena.splodit("prveDieta", prvyMuz);
        prveDieta.born(dNow);
        prveDieta.setMeno("Kain");

        Clovek druheDieta = prvaZena.splodit("druheDieta", prvyMuz);
        druheDieta.born(dNow);
        druheDieta.setMeno("Abel");

        System.out.println(prveDieta);
        System.out.println(druheDieta);






        MatickaZem.addTvora(prvaZena);
        MatickaZem.addTvora(prvyMuz);
        MatickaZem.addTvora(prveDieta);
        MatickaZem.addTvora(druheDieta);

        System.out.println("--------------------POLE TVOROV----------------------");
        MatickaZem.printPoleTvorov();


        System.out.println("--------------------TOOLS----------------------");
        EarthLivingBeingsExtractor elbe = new EarthLivingBeingsExtractor();
        elbe.getBeingsOnEarth(MatickaZem.getPoleTvorov());

        MessageReader adamonReader = new MessageReader();
        adamonReader.obtainFilename(args);
        adamonReader.openAndRead();
        adamonReader.processMessage();


    }
}
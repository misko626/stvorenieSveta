package com.company.zive_tvory.clovecina;

import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.*;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.Nervova.NervovaSustavaCicavec;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.RozmnozovaciaClovek.RozmnozovaciaSustavaZena;

import java.util.Random;

public class Zena extends Clovek{
    public Zena(Clovek otec, Clovek mama, int pocet_stavcov) {
        super(otec, mama, pocet_stavcov);
    }

    //Stvoritelsky konstruktor
    public Zena(Clovek otec, Clovek mama, int pocet_stavcov, String meno, String priezvisko) {
        super(otec, mama, pocet_stavcov);

        super.meno = meno;
        super.priezvisko = priezvisko;
        create_sustavy();
    }

    public void porodit(){

    }

    public Clovek splodit(Muz sTymtoMuzom){
        Random rand = new Random();
        Boolean man = rand.nextBoolean();

        Clovek clovieciSplodeny;
        if(man){
            clovieciSplodeny = new Muz(sTymtoMuzom, this, 34);
            super.deti.add(clovieciSplodeny);
            sTymtoMuzom.deti.add(clovieciSplodeny);
        }else{
            clovieciSplodeny = new Zena(sTymtoMuzom, this, 34);
            super.deti.add(clovieciSplodeny);
            sTymtoMuzom.deti.add(clovieciSplodeny);
        }
        clovieciSplodeny.priezvisko = super.priezvisko+"-"+sTymtoMuzom.priezvisko;
        babyInsideCare(clovieciSplodeny);
        return clovieciSplodeny;
    }

    public void babyInsideCare(Clovek plod){
        RozmnozovaciaSustavaZena myRS = (RozmnozovaciaSustavaZena) sustavy[6];
        myRS.takeAndCareBaby(plod);
    }

    @Override
    public void create_sustavy() {
        sustavy = new Sustava[8];

        sustavy[0] = new OpornaSustava(Typ_sustavy.OPORNA);
        sustavy[1] = new ObehovaSustava(Typ_sustavy.OBEHOVA);
        sustavy[2] = new VylucovaciaSustava(Typ_sustavy.VYLUCOVACIA);
        sustavy[3] = new PohybovaSustava(Typ_sustavy.POHYBOVA);
        sustavy[4] = new DychaciaSustava(Typ_sustavy.DYCHACIA);
        sustavy[5] = new TraviacaSustava(Typ_sustavy.TRAVIACA);
        sustavy[6] = new RozmnozovaciaSustavaZena(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new NervovaSustavaCicavec( Typ_sustavy.NERVOVA);


        System.out.println("Som zena a mam zlozitu nervovu a speci rozmnozovaciu sustavu");
    }
}

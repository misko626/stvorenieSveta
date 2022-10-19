package com.company.zive_tvory.clovecina;

import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.*;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.Nervova.NervovaSustavaCicavec;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.RozmnozovaciaClovek.RozmnozovaciaSustavaMuz;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.RozmnozovaciaClovek.RozmnozovaciaSustavaZena;

public class Muz extends Clovek{
    public Muz(String name, Clovek otec, Clovek mama, int pocet_stavcov) {
        super(name, otec, mama, pocet_stavcov);
    }

    //Stvoritelsky konstruktor
    public Muz(String name, Clovek otec, Clovek mama, int pocet_stavcov, String meno, String priezvisko) {
        super(name, otec, mama, pocet_stavcov);

        super.meno = meno;
        super.priezvisko = priezvisko;
        create_sustavy();
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
        sustavy[6] = new RozmnozovaciaSustavaMuz(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new NervovaSustavaCicavec( Typ_sustavy.NERVOVA);


        System.out.println("Som muz a mam zlozitu nervovu a speci rozmnozovaciu sustavu");
    }
}

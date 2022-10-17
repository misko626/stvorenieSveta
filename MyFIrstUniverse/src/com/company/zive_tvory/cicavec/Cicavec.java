package com.company.zive_tvory.cicavec;

import com.company.zive_tvory.stavovce.Stavovec;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.*;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.Nervova.NervovaSustavaCicavec;

public abstract class Cicavec extends Stavovec implements cicable{

    private double temperature;

    public Cicavec(int pocet_stavcov) {
        super(pocet_stavcov);
        this.temperature = 36;
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
        sustavy[6] = new RozmnozovaciaSustava(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new NervovaSustavaCicavec( Typ_sustavy.NERVOVA);

    }
}

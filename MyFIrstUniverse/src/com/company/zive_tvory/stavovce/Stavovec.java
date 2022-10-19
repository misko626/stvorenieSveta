package com.company.zive_tvory.stavovce;

import com.company.zive_tvory.Tvor;
import com.company.zive_tvory.stavovce.stavovce_diely.Chrbtica;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.*;

public abstract class Stavovec extends Tvor {

    protected Chrbtica chrbtica;
    protected Sustava[] sustavy;

    public Stavovec(String meno, int pocet_stavcov){
        super(meno);
        this.chrbtica = new Chrbtica(pocet_stavcov);
        create_sustavy();
    }

    public void create_sustavy(){
        sustavy = new Sustava[8];

        sustavy[0] = new OpornaSustava(Typ_sustavy.OPORNA);
        sustavy[1] = new ObehovaSustava(Typ_sustavy.OBEHOVA);
        sustavy[2] = new VylucovaciaSustava(Typ_sustavy.VYLUCOVACIA);
        sustavy[3] = new PohybovaSustava(Typ_sustavy.POHYBOVA);
        sustavy[4] = new DychaciaSustava(Typ_sustavy.DYCHACIA);
        sustavy[5] = new TraviacaSustava(Typ_sustavy.TRAVIACA);
        sustavy[6] = new RozmnozovaciaSustava(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new NervovaSustavaStavovecDefault(Typ_sustavy.NERVOVA);

    }


    public Chrbtica getChrbtica() {
        return chrbtica;
    }

    public void setChrbtica(Chrbtica chrbtica) {
        this.chrbtica = chrbtica;
    }

    public Sustava[] getSustavy() {
        return sustavy;
    }

    public void setSustavy(Sustava[] sustavy) {
        this.sustavy = sustavy;
    }
}

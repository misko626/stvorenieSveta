package com.company.zive_tvory.stavovce.stavovce_diely.sustavy.Nervova;

import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.NervovaSustavaStavovecDefault;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.Typ_sustavy;

public class NervovaSustavaCicavec extends NervovaSustavaStavovecDefault {

    private CNS centralnaNervSustava;
    private PNS periifernaNervSustava;

    public NervovaSustavaCicavec(Typ_sustavy typ_sustavy) {
        super(typ_sustavy);

       this.centralnaNervSustava = new CNS();
       this.periifernaNervSustava = new PNS();
    }
}

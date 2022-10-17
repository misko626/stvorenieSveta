package com.company.zive_tvory.stavovce.stavovce_diely.sustavy.RozmnozovaciaClovek;

import com.company.zive_tvory.clovecina.Clovek;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.RozmnozovaciaSustava;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.Typ_sustavy;

public class RozmnozovaciaSustavaZena extends RozmnozovaciaSustava {

    private int babyDevelopmentProcess=0;

    public RozmnozovaciaSustavaZena(Typ_sustavy typ_sustavy) {
        super(typ_sustavy);
    }


    public int takeAndCareBaby(Clovek plod){
        while(babyDevelopmentProcess!=100){
            babyDevelopmentProcess++;
        }
        plod.create_sustavy();
        return babyDevelopmentProcess;
    }
}

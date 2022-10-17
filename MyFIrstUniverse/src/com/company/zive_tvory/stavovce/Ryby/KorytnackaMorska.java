package com.company.zive_tvory.stavovce.Ryby;

import com.company.zive_tvory.Tvor;

public abstract class KorytnackaMorska extends Tvor {

    private int vek;
    private int pocetPancierov;

    public KorytnackaMorska(int vek, int pocetPancierov) {
        this.vek = vek;
        this.pocetPancierov = pocetPancierov;
    }

    public KorytnackaMorska(){

    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getPocetPancierov() {
        return pocetPancierov;
    }

    public void setPocetPancierov(int pocetPancierov) {
        this.pocetPancierov = pocetPancierov;
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("Mam silny pancier");
    }
}

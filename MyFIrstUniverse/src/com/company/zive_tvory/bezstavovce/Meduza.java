package com.company.zive_tvory.bezstavovce;

import com.company.zive_tvory.Tvor;

public abstract class Meduza extends Tvor {

    private String Farba;
    private boolean prisvitnost;
    private int vek;

    public Meduza(String konkretnyTvorName, String farba, boolean prisvitnost, int vek) {
        super(konkretnyTvorName);
        Farba = farba;
        this.prisvitnost = prisvitnost;
        this.vek = vek;
    }

    public String getFarba() {
        return Farba;
    }

    public void setFarba(String farba) {
        Farba = farba;
    }

    public boolean isPrisvitnost() {
        return prisvitnost;
    }

    public void setPrisvitnost(boolean prisvitnost) {
        this.prisvitnost = prisvitnost;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("Ja Prhlim");
    }
}

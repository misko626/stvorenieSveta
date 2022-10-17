package com.company.vesmirneTelesa;

public class Kometa extends Vesmirne_teleso{

    private String meno;
    private double vaha;
    private double rychlost;

    public Kometa(String meno, double vaha, double rychlost) {
        this.meno = meno;
        this.vaha = vaha;
        this.rychlost = rychlost;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    public double getRychlost() {
        return rychlost;
    }

    public void setRychlost(double rychlost) {
        this.rychlost = rychlost;
    }
}

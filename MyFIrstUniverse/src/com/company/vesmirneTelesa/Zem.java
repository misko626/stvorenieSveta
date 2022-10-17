package com.company.vesmirneTelesa;

import com.company.zive_tvory.Tvor;

public class Zem extends Planeta{

    private Tvor[] poleTvorov;
    private int pocetTvorov;

    public Zem(String meno, double vaha, double priemer) {
        super(meno, vaha, priemer);
        poleTvorov = new Tvor[9];
        pocetTvorov = 0;
    }

    public Zem(String meno, double vaha, double priemer, double gravity) {
        super(meno, vaha, priemer, gravity);
    }

    public Zem() {
    }


    public void addTvora(Tvor tvorTvorov){
        this.poleTvorov[pocetTvorov] = tvorTvorov;
        pocetTvorov++;
    }

    public void deleteTvora(Tvor tvorTvorov){
        int i = 0;
        for (Tvor tvor :
                this.poleTvorov) {

            if (tvor!= null && tvor.equals(tvorTvorov)) {
                System.out.println("nasiel som tvora na mieste "+i);
                tvor = null;
                poleTvorov[i]= null;
            }
            i++;
            }
    }
    
    public void poleTvorovToString(){
        for (int i = 0; i < poleTvorov.length; i++) {
            System.out.println(poleTvorov[i]);
        }
    }

    public Tvor[] getPoleTvorov() {
        return poleTvorov;
    }

    public void setPoleTvorov(Tvor[] poleTvorov) {
        this.poleTvorov = poleTvorov;
    }

    public int getPocetTvorov() {
        return pocetTvorov;
    }

    public void setPocetTvorov(int pocetTvorov) {
        this.pocetTvorov = pocetTvorov;
    }
}

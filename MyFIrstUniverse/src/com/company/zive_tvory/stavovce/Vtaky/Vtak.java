package com.company.zive_tvory.stavovce.Vtaky;

import com.company.zive_tvory.stavovce.Stavovec;

public abstract class Vtak extends Stavovec {

    private String farba;
    private String teplotne_pasmo;
    private double vaha;
    private boolean vyliahnuty;

//    public Vtak(String farba, String teplotne_pasmo, double vaha) {
//        this.farba = farba;
//        this.teplotne_pasmo = teplotne_pasmo;
//        this.vaha = vaha;
//        this.vyliahnuty = false;
//    }

//    public Vtak(){
//
//    }

    public Vtak( String meno, int pocet_stavcov){
        super(meno, pocet_stavcov);
    }

    public void vyliahniSa(){
        this.vyliahnuty = true;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public String getTeplotne_pasmo() {
        return teplotne_pasmo;
    }

    public void setTeplotne_pasmo(String teplotne_pasmo) {
        this.teplotne_pasmo = teplotne_pasmo;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    public boolean isVyliahnuty() {
        return vyliahnuty;
    }

    public void setVyliahnuty(boolean vyliahnuty) {
        this.vyliahnuty = vyliahnuty;
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("Ja letim");
    }
}

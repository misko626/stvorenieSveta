package com.company.zive_tvory.stavovce.Ryby;

import com.company.zive_tvory.stavovce.Stavovec;

public abstract class Ryba extends Stavovec {

    private String farba;
    private double vaha;
    private String druh_vody;
    private boolean vyliahnuty;

    public Ryba(int pocet_stavcov) {
        super(pocet_stavcov);
    }

//    public Ryba(String farba, double vaha, String druh_vody ) {
//        this.farba = farba;
//        this.vaha = vaha;
//        this.druh_vody = druh_vody;
//        this.vyliahnuty = false;
//    }
//
//    public Ryba(){
//
//    }


    public Ryba(int pocet_stavcov, String farba, double vaha, String druh_vody, boolean vyliahnuty) {
        super(pocet_stavcov);
        this.farba = farba;
        this.vaha = vaha;
        this.druh_vody = druh_vody;
        this.vyliahnuty = vyliahnuty;
    }

    public void vuliahniSa(){
        this.vyliahnuty= true;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    public String getDruh_vody() {
        return druh_vody;
    }

    public void setDruh_vody(String druh_vody) {
        this.druh_vody = druh_vody;
    }

    public boolean isVyliahnuty() {
        return vyliahnuty;
    }

    public void setVyliahnuty(boolean vyliahnuty) {
        this.vyliahnuty = vyliahnuty;
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z){
        System.out.println("Plavam lebo som ryba");
    }

    @Override
    public String toString() {
        return "Ryba{" +
                "farba='" + farba + '\'' +
                ", vaha=" + vaha +
                ", druh_vody='" + druh_vody + '\'' +
                ", vyliahnuty=" + vyliahnuty +
                '}';
    }
}

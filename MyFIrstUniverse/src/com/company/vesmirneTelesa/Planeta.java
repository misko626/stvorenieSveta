package com.company.vesmirneTelesa;

public class Planeta extends Vesmirne_teleso {

    private String meno;
    private double vaha;
    private double priemer;
    private double gravity;
    private boolean weightSet= false;


    public Planeta(String meno, double vaha, double priemer) {
        setMeno(meno);
        setVaha(vaha);
        setPriemer(priemer);
        setGravity(9.81);
    }

    public Planeta(String meno, double vaha, double priemer, double gravity) {
        setMeno(meno);
        setVaha(vaha);
        setPriemer(priemer);
        setGravity(gravity);
    }

    public Planeta() {
        setMeno("");
        setVaha(0);
        setPriemer(0);
        setGravity(0);
    }

    public void setPlanetaryWeight(double vaha){

        if(!this.weightSet) setVaha(vaha);
        this.weightSet = true;
    }

    private void increaseGravity(double add) {
        this.gravity += add;
    }

    private void decreaseGravity(double dec) {
        this.gravity -= dec;
    }



    public String getMeno() {
        return meno;
    }

    private void setMeno(String meno) {
        this.meno = meno;
    }

    public double getVaha() {
        return vaha;
    }

    private void setVaha(double vaha) {
        double vahaRozdiel = vaha - this.vaha;

        if(vahaRozdiel> 1000 ){
            increaseGravity(0.1);
        }

        if(vahaRozdiel < -1000){
            decreaseGravity(0.1);
        }
        this.vaha = vaha;
    }

    public double getPriemer() {
        return priemer;
    }

    private void setPriemer(double priemer) {
        this.priemer = priemer;
    }

    public double getGravity() {
        return gravity;
    }

    private void setGravity(double gravity) {
        this.gravity = gravity;
    }
}

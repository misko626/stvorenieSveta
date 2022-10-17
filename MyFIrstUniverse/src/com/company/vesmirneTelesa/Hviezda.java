package com.company.vesmirneTelesa;

public class Hviezda extends Vesmirne_teleso {

    private String meno;
    private double vaha;
    private double priemer;
    private double teplota;
    private boolean svietim;


    public Hviezda(String meno, double vaha, double priemer, double teplota) {
        setMeno(meno);
        setVaha(vaha);
        setPriemer(priemer);
        setTeplota(teplota);
    }

    public Hviezda() {
        setMeno("");
        setVaha(0);
        setPriemer(0);
        setTeplota(0);
    }

    public Hviezda(String meno) {
        setMeno(meno);
        setVaha(0);
        setPriemer(0);
        setTeplota(0);
        setSvietim(false);
    }

    public void sviet(double teplota){
        setSvietim(true);
        setTeplota(teplota);
    }

    public void zhasni(){
        setSvietim(false);
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
        this.vaha = vaha;
    }

    public double getPriemer() {
        return priemer;
    }

    private void setPriemer(double priemer) {
        this.priemer = priemer;
    }

    public double getTeplota() {
        return teplota;
    }

    private void setTeplota(double teplota) {
        this.teplota = teplota;
    }

    public boolean isSvietim() {
        return svietim;
    }

    private void setSvietim(boolean svietim) {
        this.svietim = svietim;
    }

    @Override
    public String toString() {
        return "Hviezda{" +
                "meno='" + meno + '\'' +
                ", vaha=" + vaha +
                ", priemer=" + priemer +
                ", teplota=" + teplota +
                ", svietim=" + svietim +
                '}';
    }
}

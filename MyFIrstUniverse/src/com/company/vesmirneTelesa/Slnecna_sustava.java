package com.company.vesmirneTelesa;

public class Slnecna_sustava {

    Hviezda slnko;
    private int object_counter;

    private Vesmirne_teleso[] obezne_telesa = new Vesmirne_teleso[500000000];


    public Slnecna_sustava() {
        this.slnko = new Hviezda();
        setObject_counter(0);
        obezne_telesa[object_counter] = new Planeta("Mars",432432,432432);
        object_counter++;
        obezne_telesa[object_counter] = new Planeta("Venusa",432432,432432);
        object_counter++;
        obezne_telesa[object_counter] = new Hviezda("Polarka");
        object_counter++;
        obezne_telesa[object_counter] = new Kometa("kometeus", 3452, 1456);
        object_counter++;

    }

    public void addTeleso(Vesmirne_teleso nove_teleso){
        this.obezne_telesa[object_counter] = nove_teleso;
        object_counter++;
    }

    public int getObject_counter() {
        return object_counter;
    }

    public void setObject_counter(int object_counter) {
        this.object_counter = object_counter;
    }

}

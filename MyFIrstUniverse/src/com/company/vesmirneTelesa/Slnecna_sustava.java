package com.company.vesmirneTelesa;

import java.util.HashSet;
import java.util.Set;

public class Slnecna_sustava {

    Hviezda slnko;
    private int object_counter;


    private Set<Vesmirne_teleso> obezne_selesa = new HashSet<>();


    public Slnecna_sustava() {
        this.slnko = new Hviezda();
        this.obezne_selesa.add(new Planeta("Mars",432432,432432));
        this.obezne_selesa.add(new Planeta("Venusa",432432,432432));
        this.obezne_selesa.add(new Hviezda("Polarka"));
        this.obezne_selesa.add(new Kometa("kometeus",3452, 1456));

    }

    public void addTeleso(Vesmirne_teleso nove_teleso){
        this.obezne_selesa.add(nove_teleso);
    }

    public int getObject_counter() {
        return object_counter;
    }

    public void setObject_counter(int object_counter) {
        this.object_counter = object_counter;
    }

}

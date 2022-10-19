package com.company.vesmirneTelesa;

import java.util.HashSet;
import java.util.Set;

public class Galaxia {

    private Set<Slnecna_sustava> planetarnaSustava = new HashSet<>();
    private int galaxies_count;

    public Galaxia(Set<Slnecna_sustava> planetarnaSustava) {
        this.planetarnaSustava = planetarnaSustava;
    }

    public Galaxia(){
        galaxies_count = 0;
    }

    public void addSustava(Slnecna_sustava tato_sustava){
        this.planetarnaSustava.add(tato_sustava);
    }




    public int getGalaxies_count() {
        return galaxies_count;
    }

    private void setGalaxies_count(int galaxies_count) {
        this.galaxies_count = galaxies_count;
    }
}

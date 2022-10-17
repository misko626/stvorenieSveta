package com.company.vesmirneTelesa;

public class Galaxia {

    private Slnecna_sustava[] planetarnaSustava = new Slnecna_sustava[5000];
    private int galaxies_count;

    public Galaxia(Slnecna_sustava[] planetarnaSustava) {
        this.planetarnaSustava = planetarnaSustava;
    }

    public Galaxia(){
        galaxies_count = 0;
    }

    public void addSustava(Slnecna_sustava tato_sustava){
        this.planetarnaSustava[galaxies_count] = tato_sustava;
        galaxies_count++;
    }




    public int getGalaxies_count() {
        return galaxies_count;
    }

    private void setGalaxies_count(int galaxies_count) {
        this.galaxies_count = galaxies_count;
    }
}

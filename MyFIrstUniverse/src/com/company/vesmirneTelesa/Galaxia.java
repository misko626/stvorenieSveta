package com.company.vesmirneTelesa;

import java.util.HashSet;
import java.util.Set;

public class Galaxia {

    private Set<Planetarna_sustava> planetarnaSustava = new HashSet<>();
    private int galaxies_count;
    private String spravaZGalaxie;

    public Galaxia(Set<Planetarna_sustava> planetarnaSustava) {
        this.planetarnaSustava = planetarnaSustava;
    }

    public Galaxia(){
        galaxies_count = 0;
        this.spravaZGalaxie = "";
    }

    public void addSustava(Planetarna_sustava tato_sustava){
        this.planetarnaSustava.add(tato_sustava);
    }

    public void removeSustava(Planetarna_sustava tato_sustava){this.planetarnaSustava.remove(tato_sustava);}

    public void sendMessageToGalaxy(String message, Galaxia destinationGalaxy){
        destinationGalaxy.setSpravaZGalaxie(message);
    }

    public int getGalaxies_count() {
        return galaxies_count;
    }

    private void setGalaxies_count(int galaxies_count) {
        this.galaxies_count = galaxies_count;
    }

    public String getSpravaZGalaxie() {
        return spravaZGalaxie;
    }

    public void setSpravaZGalaxie(String spravaZGalaxie) {
        this.spravaZGalaxie = spravaZGalaxie;
    }
}

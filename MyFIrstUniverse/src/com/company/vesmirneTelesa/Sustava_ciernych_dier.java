package com.company.vesmirneTelesa;

import java.util.HashSet;
import java.util.Set;

public class Sustava_ciernych_dier {

    private int pocet_ciernych_dier;
    private int pocet_vcucnutych_sustav;
    private Set<Planetarna_sustava> vcucnutePlanetarneSustavy = new HashSet<>();

    public Sustava_ciernych_dier() {
        this.pocet_ciernych_dier = 0;
        this.pocet_vcucnutych_sustav = 0;
    }

    public void vcucniSustavu(Galaxia tatoGalaxia,  Planetarna_sustava vcucnutaSustava){

        tatoGalaxia.removeSustava(vcucnutaSustava);
        this.vcucnutePlanetarneSustavy.add(vcucnutaSustava);
        this.pocet_vcucnutych_sustav++;
    }

    public int getPocet_ciernych_dier() {
        return pocet_ciernych_dier;
    }

    public void setPocet_ciernych_dier(int pocet_ciernych_dier) {
        this.pocet_ciernych_dier = pocet_ciernych_dier;
    }

    public int getPocet_vcucnutych_sustav() {
        return pocet_vcucnutych_sustav;
    }

    public void setPocet_vcucnutych_sustav(int pocet_vcucnutych_sustav) {
        this.pocet_vcucnutych_sustav = pocet_vcucnutych_sustav;
    }

    public Set<Planetarna_sustava> getVcucnutePlanetarneSustavy() {
        return vcucnutePlanetarneSustavy;
    }

    public void setVcucnutePlanetarneSustavy(Set<Planetarna_sustava> vcucnutePlanetarneSustavy) {
        this.vcucnutePlanetarneSustavy = vcucnutePlanetarneSustavy;
    }
}

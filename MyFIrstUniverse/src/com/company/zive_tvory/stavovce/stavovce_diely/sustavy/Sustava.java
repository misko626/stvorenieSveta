package com.company.zive_tvory.stavovce.stavovce_diely.sustavy;

public abstract class Sustava {

    Typ_sustavy typ_sustavy;

    public Sustava(Typ_sustavy typ_sustavy) {
        this.typ_sustavy = typ_sustavy;
    }

    public Typ_sustavy getTyp_sustavy() {
        return typ_sustavy;
    }

    public void setTyp_sustavy(Typ_sustavy typ_sustavy) {
        this.typ_sustavy = typ_sustavy;
    }
}

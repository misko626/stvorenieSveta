package com.company.zive_tvory;

import java.util.Date;

public abstract class Tvor implements bornable, dieable {

    protected Date date_of_birth;
    protected Date date_of_die;

    protected String konkretnyTvorName;

    public Tvor(String konkretnyTvorName) {
        this.konkretnyTvorName = konkretnyTvorName;
    }

    public abstract void hybsa(int direction_x, int direction_y, int direction_z);

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Date getDate_of_die() {
        return date_of_die;
    }

    public void setDate_of_die(Date date_of_die) {
        this.date_of_die = date_of_die;
    }

    public String getKonkretnyTvorName() {
        return konkretnyTvorName;
    }

    public void setKonkretnyTvorName(String konkretnyTvorName) {
        this.konkretnyTvorName = konkretnyTvorName;
    }
}

package com.company.zive_tvory.bezstavovce.Hmyz;

import com.company.zive_tvory.bezstavovce.Bezstavovec;

public abstract class Hmyz extends Bezstavovec {

    private double velkost;
    private double druh;
    private double farba;

    public Hmyz(double velkost, double druh, double farba) {
        this.velkost = velkost;
        this.druh = druh;
        this.farba = farba;
    }

    public Hmyz() {

    }
}

package com.company.zive_tvory.bezstavovce.Hmyz;

import com.company.zive_tvory.bezstavovce.Bezstavovec;

public abstract class Hmyz extends Bezstavovec {

    private double velkost;
    private double druh;
    private double farba;

    public Hmyz(String meno, double velkost, double druh, double farba) {
        super(meno);
        this.velkost = velkost;
        this.druh = druh;
        this.farba = farba;
    }

    public Hmyz(String meno) {
        super(meno);

    }
}

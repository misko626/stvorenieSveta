package com.company.zive_tvory.bezstavovce.Hmyz;

import java.util.Date;

public class Mucha extends Hmyz{


    public Mucha(String meno, double velkost, double druh, double farba) {
        super(meno,velkost, druh, farba);
    }

    public Mucha(String meno) {
        super(meno);
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {

    }

    @Override
    public void born(Date date_of_birth) {

    }

    @Override
    public void die(Date date_of_die) {

    }
}

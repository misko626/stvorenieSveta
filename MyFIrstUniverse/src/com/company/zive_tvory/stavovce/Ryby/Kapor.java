package com.company.zive_tvory.stavovce.Ryby;

import java.util.Date;

public class Kapor extends Ryba{

    public Kapor(int pocet_stavcov) {
        super(pocet_stavcov);
    }


    @Override
    public void born(Date date_of_birth) {

    }

    @Override
    public void die(Date date_of_die) {
        System.out.println("Zabil som kapra");
    }
}

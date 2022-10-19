package com.company.vesmirneTelesa;

import com.company.zive_tvory.Tvor;

import java.util.LinkedList;

public class Zem extends Planeta{

    private Tvor[] poleTvoro;

    private LinkedList<Tvor> poleTvorov = new LinkedList<Tvor>();

    private int pocetTvorov;

    public Zem(String meno, double vaha, double priemer) {
        super(meno, vaha, priemer);
        pocetTvorov = 0;
    }

    public Zem(String meno, double vaha, double priemer, double gravity) {
        super(meno, vaha, priemer, gravity);
    }

    public Zem() {
    }


    public void addTvora(Tvor tvorTvorov){
        this.poleTvorov.add(tvorTvorov);
    }

    public void deleteTvora(Tvor tvorTvorov){
        int i = 0;
        if (this.poleTvorov.contains(tvorTvorov)){
            System.out.println("Na zemi som nasiel tohto tvora a vymazal som ho");
            this.poleTvorov.remove(tvorTvorov);
        }else{
            System.out.println("Zatial na zemi takeho tvora nemame");
        }
    }

    public void printPoleTvorov(){
        this.poleTvorov.stream().forEach(System.out::println);
    }


    public int getPocetTvorov() {
        return pocetTvorov;
    }

    public void setPocetTvorov(int pocetTvorov) {
        this.pocetTvorov = pocetTvorov;
    }

    public LinkedList<Tvor> getPoleTvorov() {
        return poleTvorov;
    }

    public void setPoleTvorov(LinkedList<Tvor> poleTvorov) {
        this.poleTvorov = poleTvorov;
    }
}

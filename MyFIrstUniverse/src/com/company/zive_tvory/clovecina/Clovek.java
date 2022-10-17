package com.company.zive_tvory.clovecina;

import com.company.zive_tvory.cicavec.Cicavec;
import com.company.zive_tvory.cicavec.MaterskeMlieko;

import java.util.*;

public class Clovek extends Cicavec {

    protected String meno;
    protected String priezvisko;
    protected Clovek otec;
    protected Clovek mama;
    protected List<Clovek> deti;

    public Clovek(Clovek otec, Clovek mama, int pocet_stavcov) {
        super(pocet_stavcov);
        this.otec = otec;
        this.mama= mama;
        this.deti = new List<Clovek>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Clovek> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Clovek clovek) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Clovek> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Clovek> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Clovek get(int index) {
                return null;
            }

            @Override
            public Clovek set(int index, Clovek element) {
                return null;
            }

            @Override
            public void add(int index, Clovek element) {

            }

            @Override
            public Clovek remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Clovek> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Clovek> listIterator(int index) {
                return null;
            }

            @Override
            public List<Clovek> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {

    }

    @Override
    public void born(Date date_of_birth) {

    }

    @Override
    public void cicat(Cicavec mama) {

    }

    @Override
    public void cicat(MaterskeMlieko mliecko) {

    }

    @Override
    public void die(Date date_of_die) {

    }

    @Override
    public String toString() {
        return "Clovek{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                '}';
    }

    public void setMeno(String meno){
        this.meno = meno;
    }

    public List<Clovek> getDeti() {
        return deti;
    }

    public void setDeti(List<Clovek> deti) {
        this.deti = deti;
    }

}

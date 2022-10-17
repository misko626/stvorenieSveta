package com.company.space;

public class Hmlovina {

    private long size;
    private long lifeDuration;
    private long x;
    private long y;
    private long z;


    public Hmlovina(){
        size = 0;
        lifeDuration = 0;
        x=0;y=0;z = 0;

    }


    public Hmlovina(long size, long lifeDuration, long x, long y, long z) {
        this.size = size;
        this.lifeDuration = lifeDuration;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        size = size;
    }

    public long getLifeDuration() {
        return lifeDuration;
    }

    public void setLifeDuration(long lifeDuration) {
        this.lifeDuration = lifeDuration;
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    public long getZ() {
        return z;
    }

    public void setZ(long z) {
        this.z = z;
    }
}

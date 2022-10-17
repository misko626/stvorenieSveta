package com.company.space;



public class Space {

    private String creator;
    private boolean state;
    private long size;

    public Space(String creator, boolean state , long size) {
        this.creator = creator;
        this.state  = false;
        this.size = 0;
    }

    public void startSpace(){
        state = true;
        System.out.println("The universe is started");
        increaseSpaceSize();
    }

    public void stopSpace(){
        state = false;
        System.out.println("The universe is stopped");
        decreaseSpaceSize(1000);
    }

    private void increaseSpaceSize(){

        while(size!= 999000){
            size++;
        }
        System.out.println("Size increased to 999000km3 ");
    }

    private void decreaseSpaceSize(long deriredSize){
        while(size >= deriredSize){
            size--;
        }
        System.out.println("Size edcreased to "+deriredSize+"km3 ");
    }




    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}



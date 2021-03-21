package com.techreturners.cats;

public abstract class AbstractCat implements Cat{
    private boolean aSleep;
    private String setting;
    private int averageHeight;
    private String eating;

    public AbstractCat(String eating, int averageHeight,String setting){
        this.eating = eating;
        this.averageHeight = averageHeight;
        this.setting=setting;
    }

    public boolean isAsleep(){
        return this.aSleep;
    }
    public boolean goToSleep(){
       return this.aSleep = true;
    }
    public boolean wakeUp(){
       return this.aSleep = false;
    }
    public String getSetting(){
        return this.setting;
      }
    public String eat(){
        return this.eating;
    }
    public int getAverageHeight(){
        return this.averageHeight;
    }

}
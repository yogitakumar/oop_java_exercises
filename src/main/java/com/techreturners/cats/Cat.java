package com.techreturners.cats;

interface Cat {
    String getSetting();
    String eat();
    int getAverageHeight();
    boolean isAsleep();
    void goToSleep();
    void wakeUp();
}

class DomesticCat implements Cat{
    boolean aSleep=false;
    int averageHeight;
    String eat;
    String type;

    public DomesticCat(){
        this.averageHeight=23;
        this.eat ="Purrrrrrr";
        this.type="domestic";
    }
    public boolean isAsleep(){
        return aSleep;
    }
    public void goToSleep(){
       aSleep = true;
    }
    public void wakeUp(){
       aSleep = false;
    }
    public String getSetting(){
        return type;
    }
    public String eat(){
        return eat;
    }
    public int getAverageHeight(){
        return averageHeight;
    }
}

class LionCat extends DomesticCat{
    public LionCat(){
        this.averageHeight =1100;
        this.eat="Roar!!!!";
        this.type="domestic";
    }
}

class CheetahCat extends DomesticCat{
    public CheetahCat(){
        this.averageHeight =0;
        this.eat="Zzzzzzz";
        this.type="domestic";
    }
}
package com.evani.model;

public class Coin {
    int index;

    Boolean isFake;

    int value;

    public Coin(int index, Boolean isFake, int value) {
        this.index = index;
        this.isFake = isFake;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Boolean getFake() {
        return isFake;
    }

    public void setFake(Boolean fake) {
        isFake = fake;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

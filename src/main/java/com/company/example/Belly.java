package com.company.example;

public class Belly {

    private int cukeCount;

    Belly() {
        this.cukeCount = 0;
    }

    public void eat(int cukes) {
        this.cukeCount += cukes;
    }

    public int getCount() {
        return cukeCount;
    }
}

package com.company;

public class Pizza {
    private boolean mMushrooms;
    private boolean mPepperoni;
    private boolean mSausage;
    private char mSize;
    private boolean mVegan;

    public Pizza(char size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean vegan)
    {
        this.mSize = size;
        this.mPepperoni = pepperoni;
        this.mSausage = sausage;
        this.mMushrooms = mushrooms;
        this.mVegan = vegan;
    }
    public int getNumToppings()
    {
        int numToppings = 0;
        if(mPepperoni) numToppings++;
        if(mSausage) numToppings++;
        if(mMushrooms) numToppings++;
        if(mVegan) numToppings++;
        return numToppings;

    }

    public char getSize() {
        return mSize;
    }

    @Override
    public String toString() {
        String output = "Pizza [" + "Size=" + mSize;
        if(mPepperoni) output+= ", pepperoni";
        if(mSausage) output+= ", sausage";
        if(mMushrooms) output+= ", mushrooms";
        if(mVegan) output+= ", vegan";
        output += "]";
        return output;
    }
}


package com.company;

import java.text.NumberFormat;
import java.util.Arrays;

public class PizzaOrder {
    private static final int MAX_PIZZAS = 100;
    private static int mNumPies;
    static Pizza[] mPies = new Pizza[MAX_PIZZAS];

    public boolean addPizzaToOrder(char size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean vegan)
    {
        if(mNumPies < MAX_PIZZAS) {
            mPies[mNumPies++] = new Pizza(size, pepperoni, sausage, mushrooms, vegan);
            return true;
        }
        return false;
    }

    public static double calcCost()
    {
        double cost = 0.0;
        for (int i = 0; i < mNumPies; i++) {
            switch(mPies[i].getSize())
            {
                case 's':
                case 'S':
                    cost += 8.0;
                    break;
                case 'm':
                case 'M':
                    cost += 10.0;
                    break;
                case 'l':
                case 'L':
                    cost += 12.0;
                    break;
            }
            cost += mPies[i].getNumToppings();

        }
        return cost;

    }

    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String output = "Pizza Order: Number of Pies = " + mNumPies + "\n";
        for (int i = 0; i < mNumPies; i++)
            output += "Pie #" + (i+1) + ": " + mPies[i] + "\n";
        output += "Total cost = " + currency.format(calcCost()) + "\n";
        return output;
    }
}

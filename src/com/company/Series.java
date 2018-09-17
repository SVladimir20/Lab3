package com.company;

public class Series
{
    static void series()
    {
        double Calculation = 1;
        for (double n = 1; n < 10000; n++)
            Calculation += Math.pow(-1, n)*(1/(n+1));
        System.out.println(Calculation);
    }
}
package com.company;

public class Ferma
{
    public static void ferma(int n)
    {
        for (int a=1; a < 100; a++)
            for (int b=1; b < 100; b++)
                for (int c=1; c < 100; c++)
                    if (Math.round(Math.pow(c,n)) == Math.round(Math.pow(a,n)) + Math.round(Math.pow(b,n)))
                    {
                        System.out.println("Есть решение, при n=" + n);
                        return;
                    }
        System.out.println("Нет решений");
    }
}
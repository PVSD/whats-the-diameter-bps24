package com.company;

/**
 * Created by bs482 on 10/5/18.
 */
public class circle {

    public double radius;

    public circle (double r)
    {
        radius =r;
    }

    public double circumference ()
    {
        double c = 2 * Math.PI * radius;
        return c;
    }

    public double area ()
    {
        double a = Math.PI * radius * radius;
        return a;
    }

    public double diameter ()
    {
        double d = 2 * radius;
        return d;
    }
}

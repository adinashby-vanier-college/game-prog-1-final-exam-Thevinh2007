// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Write a description of class Point2D here.
 */
public class Point2D
{
    /* Instance variables - replace the example below with your own*/
    private double x;
    private double y;

    /**
     * Constructor for objects of class Point2D
     */
    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * get x
     */
    public double getX()
    {
        return x;
    }

    /**
     * get y
     */
    public double getY()
    {
        return y;
    }

    /**
     * add
     */
    public void add(Vector2D v)
    {
        x = x + v.getX();
        y =  + v.getY();
    }
}

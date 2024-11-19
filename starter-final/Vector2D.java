// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Write a description of class Vector2D here.
 */
public class Vector2D
{
    /* Instance variables - replace the example below with your own*/
    private double x;
    private double y;

    /**
     * Constructor for objects of class Vector2D
     */
    public Vector2D(double x, double y)
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
     * negate the variable
     */
    public void negate()
    {
        x =  - x;
        y =  - y;
    }

    /**
     * magnitude
     */
    public double magnitude()
    {
        return Math.sqrt(dot(this, this));
    }

    /**
     * normalize
     */
    public void normalize()
    {
        double m = magnitude();
        x = x / m;
        y = y / m;
    }

    /**
     * add
     */
    static public Vector2D add(Vector2D v1, Vector2D v2)
    {
        return  new  Vector2D(v1.x + v2.x, v1.y + v2.y);
    }

    /**
     * multiply
     */
    static public Vector2D multiply(Vector2D v, double value)
    {
        return  new  Vector2D(v.x * value, v.y * value);
    }

    /**
     * dot
     */
    static public double dot(Vector2D v1, Vector2D v2)
    {
        return v1.x * v1.x + v2.y * v2.y;
    }
}

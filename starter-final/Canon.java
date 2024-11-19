// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Canon extends Actor
{
    private final double CANNONBALLVELOCITY = 9.8;

    /**
     * Act - do whatever the Canon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        shootRandom();
    }

    /**
     * align with the vector
     */
    public void alignWithVector(Vector2D v)
    {
        double adjacent = v.getX();
        double opposite = v.getY();
        
        double angleRadians = Math.atan2(opposite, adjacent);
        double angleDegrees = Math.toDegrees(angleRadians);
        
        setRotation((int)angleDegrees);
    }

    /**
     * shoot cannons randomly
     */
    public void shootRandom()
    {
        int n = Greenfoot.getRandomNumber(100);
        if (n == 1 || n == 5) {
            CannonBall newBall =  new  CannonBall();
            getWorld().addObject(newBall, getX(), getY());
        }
    }
}

// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{
    private Point2D position;
    private Vector2D velocity;
    private Vector2D acceleration;
    private static final double GRAVITY = 9.8;

    /**
     * constructors
     */
    public CannonBall()
    {
        position = null;
        velocity =  new  Vector2D(0.0, 0.0);
        acceleration =  new  Vector2D(0.0, GRAVITY);
    }

    /**
     * main 
     */
    public void act()
    {
        updatePhysics();
        touchLadyBug();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * if we lost or not
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * transition to losing screen
     */
    public void transitionToGameOverWorld()
    {
        World gameLoseWorld =  new  gameLoseWorld();
        Greenfoot.setWorld(gameLoseWorld);
        Greenfoot.playSound("lose.wav");
    }

    /**
     * set velocity of ball
     */
    public void setVelocity(Vector2D newValue)
    {
        velocity = newValue;
    }

    /**
     * vectors and angles for the ball
     */
    public void updatePhysics()
    {
        if (position == null) {
            position =  new  Point2D(getX(), getY());
        }
        /* get time step duration*/
        MyWorld world = (MyWorld)getWorld();
        double dt = world.getTimeStepDuration();
        /* update velocity*/
        Vector2D velocityVariation = Vector2D.multiply(acceleration, dt);
        velocity = Vector2D.add(velocity, velocityVariation);
        /* update position*/
        Vector2D positionVariation = Vector2D.multiply(acceleration, dt);
        position.add(positionVariation);
        /* set new position of actor*/
        setLocation((int)position.getX(), (int)position.getY());
    }

    /**
     * condition to lose
     */
    public void touchLadyBug()
    {
        Actor Ladybug = getOneIntersectingObject(Ladybug.class);
        if (Ladybug != null) {
            World world = getWorld();
            world.removeObject(Ladybug);
            Greenfoot.playSound("eating.wav");
        }
    }
}

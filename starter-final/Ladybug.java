// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        touch();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * move the lady bug
     */
    public void moveAround()
    {
        move(0);
        if (Greenfoot.isKeyDown("w")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(4);
        }
    }

    /**
     * if we won the game or not
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * transition to winning screen 
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  gameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
        Greenfoot.playSound("win.wav");
    }

    /**
     * if we touch the finish location or not/ winning confition
     */
    public void touch()
    {
        Actor FinishLocation = getOneIntersectingObject(FinishLocation.class);
        if (FinishLocation != null) {
            World world = getWorld();
            world.removeObject(FinishLocation);
            Greenfoot.playSound("eating.wav");
        }
    }
}

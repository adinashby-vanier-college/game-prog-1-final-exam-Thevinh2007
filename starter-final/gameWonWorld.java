// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class gameWonWorld extends World
{

    /**
     * Constructor for objects of class gameWonWorld.
     */
    public gameWonWorld()
    {
        super(800, 600, 1);
        showTextWithBigGreenFont("YOU WONN", 220, 450);
    }

    /**
     * puts winning texte on screen
     */
    public void showTextWithBigGreenFont(String message, int x, int y)
    {
        GreenfootImage gov = getBackground();
        Font font =  new  Font(50);
        gov.setFont(font);
        gov.setColor(Color.GREEN);
        gov.drawString(message, x, y);
    }
}

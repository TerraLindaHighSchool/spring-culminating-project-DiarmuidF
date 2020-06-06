import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Lining are objects at the edge of the vein.
 * 
 * @author Diarmuid Feely
 * @version 0.1
 */
public class Lining extends Actor
{
    /**
     * Act - nothing to do. Represents the side walls of the blood stream.
     */
    public void act() 
    {
        setLocation(getX() - 1, getY());
    }    
/**
     * Constructor. Nothing to do so far.
     */
    public Lining()
    {
    }
}


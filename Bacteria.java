import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bacteria fload along in the bloodstream. They are bad. Best to destroy
 * them if you can.
 * 
 * @author Diarmuid Feely
 * @version 0.1
 */
public class Bacteria extends Actor
{
    /**
     * Constructor. Nothing to do so far.
     */
    public Bacteria()
    {
      GreenfootImage image = getImage();  
      image.scale(image.getWidth() - 10, image.getHeight() - 10);  
      setImage(image);  
    }

    /**
     * Float along the bloodstream, slowly rotating.
     */
    public void act() 
    {
        setLocation(getX()-2, getY());
        turn(1);
        
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
}

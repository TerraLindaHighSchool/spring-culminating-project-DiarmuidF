import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCell here.
 * 
 * @author Diarmuid Feely
 * @version 10/22/19
 */
public class RedCell extends Actor
 {
   private int m_Speed = Greenfoot.getRandomNumber(4);
   private int m_Rotate = Greenfoot.getRandomNumber(4)-3;
    /**
     * Act - do whatever the RedCell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    setLocation(getX() - m_Speed, getY());
    turn(m_Rotate);        
    if(getX() == 0)
    {
        getWorld().removeObject(this);
    }    
   }   
}

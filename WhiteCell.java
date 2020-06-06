import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a white blood cell. This kind of cell has the job to catch 
 * bacteria and remove them from the blood.
 * 
 * @author Diarmuid F.
 * @version 0.1
 */
public class WhiteCell extends Actor
{
    private int score = 0;
    private int count;
    private int time = 6000;
    
    /**
     * Act: move up and down when cursor keys are pressed.
     */
    public void act() 
    {
     checkKeyPress();
     setLocation(getX()-2, getY());
     collision();
     setTime();
     displayInScene();
     endGame();
      }
    
    /**
     *
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-4);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
        }
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-4, getY());
        }
        
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+4, getY());
        }
    }
    
     private void setTime()
    {
        if(count++ % 5 == 0)
        {
            if(time > 0)
            {
                time--;
            }
        }
    }
    
    private void endGame()
      {
    if (time == 0)
    
      {
          Greenfoot.playSound("game-over.wav");
          getWorld( ).showText("Your score was" + score + "Better Luck Next Time!", 100, 100);
          Greenfoot.stop();
          
        }
    if (score > 10000)
    {
        getWorld( ).showText("Your score was" + score + "congradulations!", 100, 100);
        Greenfoot.stop();
    }
    }
     
    private void displayInScene()
    {
      getWorld( ). showText("score: " + score, 50, 50);
      getWorld ( ). showText("time: " + time, 700, 50); 
       }
   
   
     private void collision()
     {
       if(isTouching(Virus.class))
      {
       removeTouching(Virus.class);
       score = -15;
      }
     if (isTouching(Bacteria.class))
      {
         removeTouching(Bacteria.class);
         Greenfoot.playSound("slurp.wav");
         score ++;
      }
    } 
}
  




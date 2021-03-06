import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startpoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startpoint extends Actor
{
    /**
     * Act - do whatever the startpoint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int Lap = 0;

    public void act() 
    {
        //add lap if the car touched, approximatly the time that will be after 3 laps, it will stop itself.

        if(isTouching(Car.class))
        {
            Lap = Lap + 1;
            if ((Lap % 11) == 0)
            {
                String lap = Integer.toString(Lap / 11);

                getWorld().showText(lap, 450, 30);
                getWorld().showText("Lap:", 400, 30);
            }
        }    
        if (Lap == 47)
        {
            Greenfoot.stop();
            getWorld().showText("GameOver",250,250);
        }
    }
}
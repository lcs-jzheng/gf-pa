import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Car()
    {  
        // Change the size of the actor
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 40, image.getHeight() - 20);
        setImage(image);
    }
    public void act() 
    {
        if (Greenfoot.isKeyDown("left"))
    {
        turn(-3);
    }
    if (Greenfoot.isKeyDown("right"))
    {
        turn(3);
    }
    if (Greenfoot.isKeyDown("up"))
    {
        move(2);
     
    }
    if(Greenfoot.isKeyDown("down"))
    {
        move(-1);
    }
    
    }    
}

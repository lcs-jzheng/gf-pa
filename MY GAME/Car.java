import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private int currentSpeed;
    public int Lap = 0;
    
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
        
        // Set the speed
        currentSpeed = 3;
    }

    public void act() 
    {
        //Movement using arrows keys
        
        Movement();
        //Play the cringe sound continuosly so it sounds like the engine. Very Awful but funny.
        Greenfoot.playSound("Vroom.wav");
        //Change the speed when it is touching the Invisible wall
        if(isTouching(InvisibleWall.class) == true)
        {
            currentSpeed = 1;
        }
        if(isTouching(InvisibleWall.class) == false)
        {
            currentSpeed = 3;
        }
        
    }
  
    private void Movement()
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
            move(currentSpeed);
            
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(-currentSpeed);
        }
    }
}

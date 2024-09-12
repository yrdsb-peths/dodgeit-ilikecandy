import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus extends Actor
{
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // move cactus
        move(-3);
        
        // move cactus back if reached end
        if (getX() <= 0) {
            resetCactus();
        }
        
        // cactus has touched hero
        if (isTouching(Hero.class)) {
            Death dead = new Death();
            getWorld().addObject(dead, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    // reset the cactus to starting postion
    public void resetCactus() {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0) {
            setLocation(600, 100);
        } else {
            setLocation(600, 300);
        }
        setLocation(600, 100);
    }
}

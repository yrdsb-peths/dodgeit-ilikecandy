import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    boolean atTop = true;
    
    public void act()
    {
        // switch postion
        if (Greenfoot.mouseClicked(null)) {
            atTop = !atTop;
        }
        
        // set location of hero
        if (atTop) {
            setLocation(100, 100);
        } else {
            setLocation(100, 300);
        }
    }
}

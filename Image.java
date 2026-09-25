import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Image here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image extends Actor
{
    /**
     * Act - do whatever the Image wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img = null;
    public Image(String link){
        GreenfootImage img = new GreenfootImage(link);
        this.img = img;
    }
    public Image(GreenfootImage img){
        this.img = img;
    }
    public void act()
    {
        setImage(img);
    }
    public Actor MouseOver(){
        Actor mouse = getOneIntersectingObject(Mouse.class);
        return mouse;
    }
}

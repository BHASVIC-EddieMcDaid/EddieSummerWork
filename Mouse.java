import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x = 0;
    int y = 0;
    GreenfootImage background = null;
    public Mouse(){
        background = new GreenfootImage(5,5);
        //background.setColor(Color.WHITE);
        //background.fillRect(0,0,5,5);
        setImage(background);
        //GreenfootImage img = new GreenfootImage (background);
        //img.setColor(Color.BLACK);
        //img.drawString("",10,10);
        //setImage (img);
    }
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if(mouse != null) { 
            x = mouse.getX();
            y = mouse.getY();
        }
        setLocation(x,y);
        
    }

}

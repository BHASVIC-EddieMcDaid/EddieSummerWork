import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage bullet = null;
    int type;
    public Bullet(int type){
        bullet = new GreenfootImage(5,15);
        bullet.setColor(Color.RED);
        bullet.fillRect(0,0,5,15);
        setImage(bullet);
        this.type = type;
    }
    public void act()
    {
        setLocation(getX(),getY()-(10*type));
        World world = getWorld();
        if(getY()==0 || getY() == 599){
            world.removeObject(this);
        }
    }
}

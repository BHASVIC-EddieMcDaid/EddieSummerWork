import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Actor
{
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cannon(){
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
        
    }
    int delay = 0;
    public void act()
    {
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            setLocation(getX()-10,getY());
        }
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            setLocation(getX()+10,getY());
        }
        if(Greenfoot.isKeyDown("space") && delay <= 0){
            World world = getWorld();
            world.addObject(new Pbullet(1),getX()+5,getY()-50);
            delay = 25;
        }
        Actor bullet = getOneIntersectingObject(Bullet.class);
        delay --;
        if(bullet != null){
            World world = getWorld();
            Greenfoot.setWorld(new Start());
            }
    }
}

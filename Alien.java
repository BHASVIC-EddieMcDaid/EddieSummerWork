import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Game world;
    
    public Alien(Game world){
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
        this.world = world;
    }
    int delay = Greenfoot.getRandomNumber(250)+100;
    int delay2 = 5;
    public void act()
    {
        if (delay <= 0){
            World world = getWorld();
            world.addObject(new Bullet(-1),getX()+5,getY()+50);
          delay = Greenfoot.getRandomNumber(250)+100;
        }
        delay--;
        if (delay2 <= 0){
            setLocation(getX(),getY()+1);
            delay2 = 5;
        }
        delay2--;
        Actor bullet = getOneIntersectingObject(Pbullet.class);
        
        if(bullet != null){
            world.addScore();
            world.removeObject(this);
            }
    }

}

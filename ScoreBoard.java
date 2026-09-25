import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage background = null;
    private int score;
    public void act()
    {
        background = new GreenfootImage(50,10);
        background.setColor(Color.BLACK);
        background.fillRect(0,0,50,10);
        setImage(background);
        GreenfootImage img = new GreenfootImage (background);
        img.setColor(Color.WHITE);
        img.drawString("Score: "+score,0,10);
        img.scale(100,65);
        setImage (img);
    }
    public void EditScoreBoard(int set){
        score = set;
    }
}

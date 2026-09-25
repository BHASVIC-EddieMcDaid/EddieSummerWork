import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    /**
     * Constructor for objects of class Game.
     * 
     */
    private int Score = 0;
    ScoreBoard sb;
    private void ResetScore(){
        Score = 0;
    }
    public void addScore(){
        Score++;
    }
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        addObject(new Cannon(),175,560);
        sb = new ScoreBoard();
        addObject(sb,324,22);
    }
    public void spawnWave(){
        for(int i =0;i<7;i++){
            addObject(new Alien(this),50+i*50,30);
        }
    }
    int delay;
    public void act(){
        if (delay <= 0){
          spawnWave();
          delay = Greenfoot.getRandomNumber(200)+500;
        }
        delay--;
        sb.EditScoreBoard(Score);
    }
}

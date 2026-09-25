import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    Image startButton,hsButton,qButton;
    GreenfootImage hbox = null;
    Mouse mouse;
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(638, 480, 1); 
        
        hbox = new GreenfootImage(90,15);
        //hbox.setColor(Color.WHITE);
        //hbox.fillRect(0,0,100,20);
        startButton = new Image(hbox);
        hsButton = new Image(hbox);
        qButton = new Image(hbox);
        addObject(startButton,316,250);
        addObject(hsButton,316,290);
        addObject(qButton,316,330);
        mouse = new Mouse();
        addObject(mouse,0,0);
    }
    public void act(){
        if(Greenfoot.mouseClicked(startButton)){
            Greenfoot.setWorld(new Game());
        }
        if(startButton.MouseOver() != null){
            setBackground(new GreenfootImage("images//menu2.png"));
            if(Greenfoot.mouseClicked(mouse)){
                Greenfoot.setWorld(new Game());
            }
        }
        else if(hsButton.MouseOver() != null){
            setBackground(new GreenfootImage("images//menu3.png"));
        }
        else if(qButton.MouseOver() != null){
            setBackground(new GreenfootImage("images//menu4.png"));
        }
        else{
            setBackground(new GreenfootImage("images//menu.png"));
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);

        Door door = new Door();
        addObject(door,1174,42);
        Player player = new Player(3, 5.6f, GRAVITY, 3, 3, Level2.class, MUSIC);
        addObject(player,19,759);

        addObject(new Floor(), 600, 800);
        addObject(new BrickWall(), 380, 500);
        addObject(new BrickWall(), 780, 300);
        addObject(new BrickWall(), 960, 100);
        addObject(new SmBrickWall(), 1120, 600);
        addObject(new SmBrickWall(), 880, 600);
        addObject(new SmBrickWall(), 420, 160);
        addObject(new SmBrickWall(), 1000, 200);
        addObject(new SmBrickWall(), 220, 280);
        addObject(new TrapDoor(), 60, 400);
        addObject(new TrapDoor(), 1000, 600);
        addObject(new Bomb(GRAVITY), 1050, 765);
        addObject(new Bomb(GRAVITY), 450, 115);
        addObject(new Gem(), 975, 160);
        addObject(new Gem(), 1030, 160);

    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}

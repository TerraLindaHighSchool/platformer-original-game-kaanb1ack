import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.0767f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level4.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    public void act()
    {
        spawn();
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
        addObject(door,1100,753);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,19,759);

        addObject(new Floor(), 600, 800);

        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,184,669);
        TrapDoor trapDoor2 = new TrapDoor();
        addObject(trapDoor2,484,668);
        VerticalWall verticalWall = new VerticalWall();
        addObject(verticalWall,1008,640);
        VerticalWall verticalWall2 = new VerticalWall();
        addObject(verticalWall2,1007,489);
        SmBrickWall smBrickWall6 = new SmBrickWall();
        addObject(smBrickWall6,1011,324);
        SmBrickWall smBrickWall7 = new SmBrickWall();
        addObject(smBrickWall7,846,715);
        SmBrickWall smBrickWall8 = new SmBrickWall();
        addObject(smBrickWall8,645,527);
        SmBrickWall smBrickWall9 = new SmBrickWall();
        addObject(smBrickWall9,494,432);
        TrapDoor trapDoor3 = new TrapDoor();
        addObject(trapDoor3,821,384);
        SmBrickWall smBrickWall10 = new SmBrickWall();
        addObject(smBrickWall10,280,509);
        SmBrickWall smBrickWall11 = new SmBrickWall();
        addObject(smBrickWall11,107,379);
        BrickWall brickWall3 = new BrickWall();
        addObject(brickWall3,440,200);
        Bomb bomb = new Bomb(0.0767f);
        addObject(bomb,890,668);
        Bomb bomb2 = new Bomb(GRAVITY);
        addObject(bomb2,436,156);
        Bomb bomb3 = new Bomb(GRAVITY);
        addObject(bomb3,326,461);
        Bomb bomb4 = new Bomb(GRAVITY);
        addObject(bomb4,181,623);
        DoorCave doorCave = new DoorCave();
        addObject(doorCave,1141,743);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
            addObject(new AcidRain(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}

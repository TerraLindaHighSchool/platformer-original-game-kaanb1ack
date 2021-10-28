import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{
    private final float GRAVITY = 0.0767f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level5.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level4()
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

        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,19,720);

        addObject(new Floor(), 600, 800);

        addObject(new SmRockWall(), 59, 766);
        addObject(new SmRockWall(), 59, 799);
        SmRockWall smRockWall3 = new SmRockWall();
        addObject(smRockWall3,215,632);
        SmRockWall smRockWall4 = new SmRockWall();
        addObject(smRockWall4,440,533);
        RockTrapDoor rockTrapDoor = new RockTrapDoor();
        addObject(rockTrapDoor,329,495);
        SmRockWall smRockWall5 = new SmRockWall();
        addObject(smRockWall5,558,532);
        SmRockWall smRockWall6 = new SmRockWall();

        addObject(new SmRockWall(), 650, 401);
        SmRockWall smRockWall7 = new SmRockWall();
        addObject(smRockWall7,1143,294);
        RockTrapDoor rockTrapDoor2 = new RockTrapDoor();
        addObject(rockTrapDoor2,886,370);
        Door door = new Door();
        addObject(door,1174,236);
        Lava lava = new Lava();
        addObject(lava,313,786);
        Lava lava2 = new Lava();
        addObject(lava2,701,786);
        Lava lava3 = new Lava();
        addObject(lava3,1089,786);
        lava3.setLocation(1186,786);
        Lava lava4 = new Lava();
        addObject(lava4,1186,786);
        Lava lava5 = new Lava();
        addObject(lava5,1078,786);
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

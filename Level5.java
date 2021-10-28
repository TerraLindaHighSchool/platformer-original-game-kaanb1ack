import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends World
{
    private final float GRAVITY = 0.0767f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level5()
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
        setPaintOrder(Boss.class, Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);

        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,19,720);

        addObject(new Floor(), 600, 800);

        addObject(new SmRockWall(), 59, 766);
        addObject(new SmRockWall(), 59, 799);

        SmRockWall smRockWall8 = new SmRockWall();
        addObject(smRockWall8,1173,758);
        SmRockWall smRockWall9 = new SmRockWall();
        addObject(smRockWall9,1076,760);
        SmRockWall smRockWall10 = new SmRockWall();
        addObject(smRockWall10,1076,792);
        SmRockWall smRockWall11 = new SmRockWall();
        addObject(smRockWall11,1184,788);
        Door door = new Door();
        addObject(door,1112,702);
        Lava lava = new Lava();
        addObject(lava,312,786);
        Lava lava2 = new Lava();
        addObject(lava2,676,786);
        Lava lava3 = new Lava();
        addObject(lava3,824,786);
        RockTrapDoor rockTrapDoor = new RockTrapDoor();
        addObject(rockTrapDoor,220,614);
        SmRockWall smRockWall7 = new SmRockWall();
        addObject(smRockWall7,0,590);

        SmRockWall smRockWall15 = new SmRockWall();
        addObject(smRockWall15,220,420);
        VerticalStoneWall verticalStoneWall = new VerticalStoneWall();
        addObject(verticalStoneWall,515,417);
        SmRockWall smRockWall16 = new SmRockWall();
        addObject(smRockWall16,439,416);
        RockTrapDoor rockTrapDoor2 = new RockTrapDoor();
        addObject(rockTrapDoor2,586,418);
        RockTrapDoor rockTrapDoor3 = new RockTrapDoor();
        addObject(rockTrapDoor3,653,147);
        SmRockWall smRockWall17 = new SmRockWall();
        addObject(smRockWall17,714,185);
        VerticalStoneWall verticalStoneWall2 = new VerticalStoneWall();
        addObject(verticalStoneWall2,1023,374);
        RockTrapDoor rockTrapDoor4 = new RockTrapDoor();
        addObject(rockTrapDoor4,882,235);
        Boss boss = new Boss();
        addObject(boss,1117,660);
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

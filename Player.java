import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private Health[] health;
    private Powerup[] powerup;
    private int healthCount;
    private int speed;
    private int walkIndex;
    private int frame;
    private float yVelocity;
    private boolean isWalking;
    private boolean isJumping;
    private boolean isFacingLeft;
    private GreenfootImage[] WALK_ANIMATION;
    private GreenfootImage STANDING;
    private float JUMP_FORCE;
    private float GRAVITY;
    private Class NEXT_LEVEL;
    private GreenfootSound MUSIC;
    
    public Player(int speed, int jumpForce, float gravity, int maxHealth, int maxPowerup, Class nextLevel, GreenfootSound music)
    {
    
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void addedToWorld(World world) {}
    
    private void walk() {}
    private void jump() {}
    private void fall() {}
    private void animator() {}
    private void onCollsion() {}
    private void mirrorImages() {}
    private void gameOver() {}
    private boolean isOnGround() 
    {
        return false;
    }
    
}

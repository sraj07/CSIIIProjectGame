import mayflower.*;

public class Cat extends MovableAnimatedActor
{
    private int currentFrame;
    private Animation walkRight;
    private Animation walkLeft;
    private Animation idle;
    private Animation idleLeft;
    private Animation fallRight;
    private Animation fallLeft;
    
    public Cat()
    {
        //walkRight
        String[] walkRightAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            walkRightAnimation[i] = "img/cat/Walk (" + (i+1) + ").png";
        }
        walkRight = new Animation(50, walkRightAnimation);
        walkRight.scale(100,87);
        walkRight.setBounds(18, 5, 54, 80);
        walkRight.setTransparency(3);
        setAnimation(walkRight);
        setWalkRightAnimation(walkRight);
        
        //walkLeft
        String[] walkLeftAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            walkLeftAnimation[i] = "img/cat/Walk (" + (i+1) + ").png";
        }
        walkLeft = new Animation(50, walkLeftAnimation);
        walkLeft.mirrorHorizontally();
        walkLeft.scale(100,87);
        walkLeft.setBounds(28,5,54,80);
        walkLeft.setTransparency(3);
        setWalkLeftAnimation(walkLeft);
        
        //idleLeft
        String[] idleLeftAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            idleLeftAnimation[i] = "img/cat/Idle (" + (i+1) + ").png";
        }
        idleLeft = new Animation(50, idleLeftAnimation);
        idleLeft.mirrorHorizontally();
        idleLeft.scale(100,87);
        idleLeft.setBounds(28,5,54,80);
        idleLeft.setTransparency(3);
        setIdleLeftAnimation(idleLeft);
        
        //idle (Right)
        String[] idleAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            idleAnimation[i] = "img/cat/Idle (" + (i+1) + ").png";
        }
        idle = new Animation(50, idleAnimation);
        idle.scale(100,87);
        idle.setBounds(18,5,54,80);
        idle.setTransparency(3);
        setIdleAnimation(idle);
        
        //fallRight
        String[] fallRightAnimation = new String[8];
        for (int i=0;i<8;i++)
        {
            fallRightAnimation[i] = "img/cat/Fall (" + (i+1) + ").png";
        }
        fallRight = new Animation(50, fallRightAnimation);
        fallRight.setBounds(18,5,54,80);
        fallRight.scale(100,87);
        fallRight.setTransparency(3);
        setFallRightAnimation(fallRight);
        
        //fallLeft
        String[] fallLeftAnimation = new String[8];
        for (int i=0;i<8;i++)
        {
            fallLeftAnimation[i] = "img/cat/Fall (" + (i+1) + ").png";
        }
        fallLeft = new Animation(50, fallLeftAnimation);
        fallLeft.setBounds(28,5,54,80);
        fallLeft.mirrorHorizontally();
        fallLeft.scale(100,87);
        fallLeft.setTransparency(3);
        setFallLeftAnimation(fallLeft);
    }
    
    public void act()
    {
        super.act();
    }
}
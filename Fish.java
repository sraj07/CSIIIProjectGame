import mayflower.*;

public class Fish extends MovableAnimatedActor
{
    private int currentFrame;
    private Animation walkRight;
    private Animation walkLeft;
    private Animation idle;
    private Animation idleLeft;
    private Animation fallRight;
    private Animation fallLeft;
    
    public Fish()
    {
        //walkRight
        String[] walkRightAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            walkRightAnimation[i] = "img/fish/New Piskel-" + (i+1) + ".png.png";
            //                                New Piskel-      1      .png.png
        }
        walkRight = new Animation(50, walkRightAnimation);
        walkRight.scale(100,87);
        //walkRight.setBounds(18, 5, 54, 80);
        setAnimation(walkRight);
        setWalkRightAnimation(walkRight);
        
        //walkLeft
        String[] walkLeftAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            walkLeftAnimation[i] = "img/fish/New Piskel-" + (i+1) + ".png.png";
        }
        walkLeft = new Animation(50, walkLeftAnimation);
        walkLeft.mirrorHorizontally();
        walkLeft.scale(100,87);
        //walkLeft.setBounds(28,5,54,80);
        setWalkLeftAnimation(walkLeft);
        
        //idleLeft
        String[] idleLeftAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            idleLeftAnimation[i] = "img/fish/New Piskel-" + (i+1) + ".png.png";
        }
        idleLeft = new Animation(50, idleLeftAnimation);
        idleLeft.mirrorHorizontally();
        idleLeft.scale(100,87);
        //idleLeft.setBounds(28,5,54,80);
        setIdleLeftAnimation(idleLeft);
        
        //idle (Right)
        String[] idleAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            idleAnimation[i] = "img/fish/New Piskel-" + (i+1) + ".png.png";
        }
        idle = new Animation(50, idleAnimation);
        idle.scale(100,87);
        //idle.setBounds(18,5,54,80);
        setIdleAnimation(idle);
        
        //fallRight
        String[] fallRightAnimation = new String[8];
        for (int i=0;i<8;i++)
        {
            fallRightAnimation[i] = "img/fish/New Piskel-" + (i+1) + ".png.png";
        }
        fallRight = new Animation(50, fallRightAnimation);
        //fallRight.setBounds(18, 5, 54, 80);
        fallRight.scale(100,87);
        setFallRightAnimation(fallRight);
        
        String[] fallLeftAnimation = new String[8];
        for (int i=0;i<8;i++)
        {
            fallLeftAnimation[i] = "img/fish/New Piskel-" + (i+1) + ".png.png";
        }
        fallLeft = new Animation(50, fallLeftAnimation);
        //fallLeft.setBounds(28, 5, 54, 80);
        fallLeft.mirrorHorizontally();
        fallLeft.scale(100,87);
        setFallLeftAnimation(fallLeft);
    }
    
    public void act()
    {
        super.act();
    }
}
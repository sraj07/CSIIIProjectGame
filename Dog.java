import mayflower.*;

public class Dog extends AnimatedActor
{
    private int currentFrame;
    private Animation walk;

    public Dog()
    {
        String[] walkAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            walkAnimation[i] = "img/dog/Walk (" + (i+1) + ").png";
        }
        walk = new Animation(50, walkAnimation);
        walk.scale(87,100);
        walk.setTransparency(33);
        setAnimation(walk);
    }
    
    public void act()
    {
        super.act();
    }
}

import mayflower.*;

public class Jack extends AnimatedActor
{
    private int currentFrame;
    private Animation walk;

    public Jack()
    {
        String[] walkAnimation = new String[7];
        for (int i=0;i<7;i++)
        {
            walkAnimation[i] = "img/jack/Walk (" + (i+1) + ").png";
        }
        walk = new Animation(50, walkAnimation);
        walk.scale(200,40);
        walk.setTransparency(20);
        setAnimation(walk);
    }
    
    public void act()
    {
        super.act();
    }
}

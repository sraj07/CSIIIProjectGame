import mayflower.*;

public class Ninja extends AnimatedActor
{
    private int currentFrame;
    private Animation walk;

    public Ninja()
    {
        String[] walkAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            walkAnimation[i] = "img/ninjagirl/Run__00" + (i) + ".png";
        }
        walk = new Animation(50, walkAnimation);
        walk.scale(40,100);
        walk.setTransparency(75);
        setAnimation(walk);
    }
    
    public void act()
    {
        super.act();
    }
}

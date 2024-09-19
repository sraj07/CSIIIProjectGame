import mayflower.*;

public class GravityActor extends Block
{
    public int gravity;
    
    public GravityActor()
    {
        gravity = 3;
    }
    
    public void act()
    {
        setLocation(getX(), getY()+gravity);
        
        if (isBlocked())
            setLocation(getX(), getY()-gravity);
        //if (isClimbing())
        //    setLocation(getX(), getY()-2);
    }
    
    public boolean isBlocked()
    {
        return isTouching(Block.class);
    }
    
    public boolean isFalling()
    {
        boolean ret;
        setLocation(getX(), getY() + gravity);
        ret = isTouching(Block.class);
        setLocation(getX(), getY() - gravity);
        return !ret;
    }
    
    public boolean isClimbing()
    {
        boolean ret;
        setLocation(getX(), getY() + 1);
        ret = isTouching(Ladder.class);
        setLocation(getX(), getY() - 1);
        return !ret;
    }
}

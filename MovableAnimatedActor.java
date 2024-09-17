import mayflower.*;
public class MovableAnimatedActor extends AnimatedActor
{
    private Animation walkRight;
    private Animation walkLeft;
    private Animation idle;
    private Animation idleLeft;
    private Animation fallRight;
    private Animation fallLeft;
    private String currentAction;
    private String direction;
    
    public MovableAnimatedActor()
    {   
        super();
        direction = "right";
    }
    
    public void act()
    {
        String newAction = null;
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        int speed = 5;
        
        if (currentAction==null)
        {
            if (isFalling())
            {
                if (direction.equals("left"))
                    newAction = "fallLeft";
                else if (direction.equals("right"))
                    newAction = "fallRight";
            }
            else
            {
                if (direction.equals("left"))
                    newAction = "idleLeft";
                else if (direction.equals("right"))
                    newAction = "idle";
            }
        }
        
        if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT ))
        {
            newAction = "walkRight";
            direction = "right";
            setLocation(x+speed,y);
            if (isBlocked())
                setLocation(x-1,y);
        }
        else if (Mayflower.isKeyDown( Keyboard.KEY_LEFT ))
        {
            newAction = "walkLeft";
            direction = "left";
            setLocation(x-speed,y);
            if (isBlocked())
                setLocation(x+1,y);
        }
        else if (Mayflower.isKeyDown( Keyboard.KEY_DOWN ))
        {
            if (direction.equals("left"))
                newAction = "walkLeft";
            else if (direction.equals("right"))
                newAction = "walkRight";
            setLocation(x,y+speed);
        }
        else if (Mayflower.isKeyDown( Keyboard.KEY_UP ))
        {
            if (direction.equals("left"))
                newAction = "walkLeft";
            else if (direction.equals("right"))
                newAction = "walkRight";
            setLocation(x,y-speed);
        }
        else
        {
            if (isFalling())
            {
                if (direction != null && direction.equals("left"))
                newAction = "fallLeft";
            else if (direction != null && direction.equals("right"))
                newAction = "fallRight";
            }
            else
            {
                if (direction != null && direction.equals("left"))
                    newAction = "idleLeft";
                else if (direction != null && direction.equals("right"))
                    newAction = "idle";
            }
        }
        
        if (x>=(800-w))
        {
            setLocation(800-w-1,y);
        }
        if (x<=0)
        {
            setLocation(1,y);
        }
        if (y<=0)
        {
            setLocation(x,1);
        }
        if (y>=(600-h))
        {
            setLocation(x,600-h-1);
        }
        super.act();
        
        if (newAction!=null && !newAction.equals(currentAction))
        {
            if (newAction.equals("idleLeft"))
                setAnimation(idleLeft);
            else if (newAction.equals("idle"))
                setAnimation(idle);
            else if (newAction.equals("walkRight"))
                setAnimation(walkRight);
            else if (newAction.equals("walkLeft"))
                setAnimation(walkLeft);
            else if (newAction.equals("fallRight"))
                setAnimation(fallRight);
            else if (newAction.equals("fallLeft"))
                setAnimation(fallLeft);
        }
    }
    
    public void setWalkRightAnimation(Animation ani)
    {
        walkRight = ani;
    }
    
    public void setWalkLeftAnimation(Animation ani)
    {
        walkLeft = ani;
    }
    
    public void setIdleAnimation(Animation ani)
    {
        idle = ani;
    }
    
    public void setIdleLeftAnimation(Animation ani)
    {
        idleLeft = ani;
    }
    
    public void setFallRightAnimation(Animation ani)
    {
        fallRight = ani;
    }
    
    public void setFallLeftAnimation(Animation ani)
    {
        fallLeft = ani;
    }
    
    public void setAnimation(Animation a)
    {
        super.setAnimation(a);
    }
}

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
    
    private double velocityX;
    private double velocityY;
    private double gravity;
    

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
            currentAction = "fallRight";
        }

        if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT ))
        {
            newAction = "walkRight";
            direction = "right";
            setLocation(x+speed,y);
            if (isBlocked())
                setLocation(x-1,y);
            if (isFalling())
            {
                newAction = "fallRight";
            }

        }
        else if (Mayflower.isKeyDown( Keyboard.KEY_LEFT ))
        {
            newAction = "walkLeft";
            direction = "left";
            setLocation(x-speed,y);
            if (isBlocked())
                setLocation(x+1,y);
            if (isFalling())
            {
                newAction = "fallLeft";
            }
        }

        else if (Mayflower.isKeyDown( Keyboard.KEY_DOWN ))
        {
            if (isTouching(Ladder.class))
            {
                if (direction.equals("left"))
                {
                    newAction = "walkLeft";
                    if (!isBlocked())
                        setLocation(x, y+speed);
                }
                else if (direction.equals("right"))
                {
                    newAction = "walkRight";
                    if (!isBlocked())
                        setLocation(x, y+speed);
                }
            }
        }

        else if (Mayflower.isKeyDown( Keyboard.KEY_UP ))
        {
            if (isTouching(Ladder.class))
            {
                if (direction.equals("left"))
                    newAction = "walkLeft";
                else if (direction.equals("right"))
                    newAction = "walkRight";
                setLocation(x,y-speed);
            }
            else
            {
                
            }
        }
        else
        {
            
             if (direction.equals("left"))
                    newAction = "idleLeft";
                else 
                    newAction = "idle";
            if (isFalling())
            {
                if (direction.equals("left"))
                    newAction = "fallLeft";
                else 
                    newAction = "fallRight";
            }

        }

        if (x>=(1600-w))
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
        if (y>=(900-h))
        {
            setLocation(x,600-h-1);
        }
        //thank you hudson!
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

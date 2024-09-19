import mayflower.*;

public class MyMayflower extends Mayflower 
{
    //Constructor
    public MyMayflower()
    {
        super("Lab 6", 1200, 700);
    }

    public void init()
    {
        //Change this to true to run this program in fullscreen mode
        Mayflower.setFullScreen(false);
        World w =  new MyWorld();
        Mayflower.setWorld(w);
    }
}

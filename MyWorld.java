import mayflower.*;

public class MyWorld extends World {
    private String[][] tiles;
    
    private Cat cat;
    private Dog dog;
    private Jack jack;
    private Ninja ninja;
    private Block block;
    private Block block1;
    private Ladder ladder;
    
    private Fish fish;
    
    public MyWorld() 
    {
        setBackground("img/BG/BG-1.png");
        
        tiles = new String[7][12];
        buildWorld();
        
        Mayflower.showBounds(true);
        
        fish = new Fish();
        addObject(fish, 100, 100);
        
        ladder = new Ladder();
        addObject(ladder, 300, 300);
    }
    
    public void buildWorld()
    {
        for (int i=0;i<tiles.length;i++)
        {
            for (int j=0;j<tiles[0].length;j++)
            {
                tiles[i][j] = "";
            }
        }

        for (int k=0;k<tiles[0].length;k++)
        {
            tiles[tiles.length-1][k] = "ground";
        }

        for (int l=0;l<tiles.length;l++)
        {
            for (int m=0;m<tiles[0].length;m++)
            {
                if (tiles[l][m].equals("ground"))
                {
                    addObject(new Block(), m*100, l*100);
                }
            }
        }
    }
    
    public void act() {}
}
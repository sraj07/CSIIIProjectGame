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
        
        ladder = new Ladder();
        ladder.scale(2);
        addObject(ladder, 150, 125);
        
        
        fish = new Fish();
        addObject(fish, 0, 100);
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
        
        for (int i=3;i<=5;i++)
        {
            tiles[tiles.length-2][i] = "ground";
            tiles[tiles.length-3][i] = "ground";
            tiles[tiles.length-4][i] = "ground";
        }
        
        for (int i=6; i<=7; i++)
        {
            tiles[tiles.length-2][i] = "ground";
            tiles[tiles.length-3][i] = "ground";
            tiles[tiles.length-4][i] = "ground";
            tiles[tiles.length-5][i] = "ground";
        }
        
        tiles[tiles.length-2][tiles[0].length-1] = "ground";
        tiles[tiles.length-3][tiles[0].length-1] = "ground";
        tiles[tiles.length-4][tiles[0].length-1] = "ground";
        tiles[tiles.length-5][tiles[0].length-1] = "ground";
        
        for (int l=0;l<tiles.length;l++)
        {
            for (int m=0;m<tiles[0].length;m++)
            {
                if (tiles[l][m].equals("ground"))
                {
                    addObject(new Block(), m*100, l*100);
                }
                //addObject(new Block, )
            }
        }
        
        
    }
    
    public void act() {}
}
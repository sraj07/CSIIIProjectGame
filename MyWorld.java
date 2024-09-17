import mayflower.*;

public class MyWorld extends World {
    private Cat cat;
    private Dog dog;
    private Jack jack;
    private Ninja ninja;
    private Block block;
    private Block block1;
    
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        Mayflower.showBounds(true);
        
        cat = new Cat();
        addObject(cat, 400, 100);
        dog = new Dog();
        addObject(dog, 150, 100);
        jack = new Jack();
        addObject(jack, 275, 100);
        ninja = new Ninja();
        addObject(ninja, 400, 100);
        
        block = new Block();
        addObject(block, 400, 500);
        block1 = new Block();
        addObject(block1, 528, 372);
    }
    
    public void act()
    {
        
    }
}
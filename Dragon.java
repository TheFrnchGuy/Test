
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon extends Animal
{
    private int goldHoard;
    private String breed;
    
    public Dragon (boolean _isHungry, String _gender, int _goldHoard, String _breed)
    {
        super(_isHungry, 1, 4, _gender);
        
        goldHoard = _goldHoard;
        breed = _breed;
    }
    
    public void breathFire()
    {
        if(getHungry())
            System.out.println("Large flames emerge");
        else
            System.out.println("There is a small sputter of ash");
    }
    
    public void countGold()
    {
        if(goldHoard < 500)
            System.out.println("I'm poor");
        else if(goldHoard < 1000)
            System.out.println("I have moooooney");
        else if(goldHoard < 2000)
            System.out.println("I'm rich!");
        else
            System.out.println("I'm filthy rich >:D");
    }
    
    public void locomote()
    {
        System.out.println("I am flying!");
    }
}

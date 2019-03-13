
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    private boolean isHungry;
    private int tastiness, numLegs;
    private String gender;
    
    public Animal(boolean _isHungry, int _tastiness, int _numLegs, String _gender)
    {
        isHungry = _isHungry;
        tastiness = _tastiness;
        numLegs = _numLegs;
        gender = _gender;
    }
    
    public void locomote()
    {
        System.out.println("I am moving!");
    }
    
    public void eat()
    {
        isHungry = false;
        System.out.println("I am eating!");
    }
    
    public void loseLeg()
    {
        numLegs --;
        if(numLegs < 0)
            numLegs = 0;
        System.out.println("I have " + numLegs + " left. :O");
    }
    
    public boolean getHungry()
    {
        return isHungry;
    }
}

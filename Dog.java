
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Animal
{
    private boolean isOwnerPresent;
    private String breed;
    
    public Dog (boolean _isHungry, String _gender, boolean _isOwnerPresent, String _breed)
    {
        super(_isHungry, 5, 4, _gender);
        
        isOwnerPresent = _isOwnerPresent;
        breed = _breed;
    }
    
    public void wagTail()
    {
        if(isOwnerPresent)
            System.out.println("WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG");
        else
            System.out.println("WAG");
    }
    
    public void bork()
    {
        if(!isOwnerPresent)
            System.out.println("BORK BORK BORK BORK BORK BORK BORK BORK BORK BORK BORK BORK BORK BORK BORK BORK BORK");
        else
            System.out.println("bark");
    }
    
    public void locomote()
    {
        System.out.println("I am running!");
    }
}

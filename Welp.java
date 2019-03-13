
/**
 * Write a description of class Welp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Welp extends Dragon
{
    private boolean hasTeeth;
    
    public Welp (boolean _isHungry, String _gender, boolean _hasTeeth, String _breed)
    {
        super(_isHungry, _gender, 50, _breed);
        
        hasTeeth = _hasTeeth;
    }
    
    public void bite()
    {
        if(hasTeeth)
            System.out.println("I sink my teef in");
        else
        System.out.println("Nibble Nibble");
    }
}

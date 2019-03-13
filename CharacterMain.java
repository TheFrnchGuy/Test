
/**
 * Write a description of class CharacterMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CharacterMain
{
    public static void main(String [] args)
    {
        Character ch1 = new Character("Steven", 25, "White", 100);
        Character ch2 = new Character("Scott", 20, "Blue", 101);
        
        Battle yeet = new Battle(ch1, ch2);
        yeet.fight();
    }
}

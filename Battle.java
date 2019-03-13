
/**
 * characters get to fight to the death
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    private Character ch1, ch2;
    
    public Battle(Character char1, Character char2)
    {
        ch1 = char1;
        ch2 = char2;
    }
    
    public void fight()
    {
        System.out.println("Selection of our fighters:");
        System.out.println(ch1);
        System.out.println(ch2);
        
        if(ch1.getHealth() > ch2.getHealth())
        {
            System.out.println(ch1.getName() + " is the winner");
            ch2.setHealth(0);
            ch2.checkHealth();
        }
        else if (ch2.getHealth() > ch1.getHealth())
        {
            System.out.println(ch2.getName() + " is the winner");
            ch1.setHealth(0);
            ch1.checkHealth();
        }
        else if (ch2.getHealth() == ch1.getHealth())
        {
            System.out.println(ch1.getName() + " and " + ch2.getName() + " both died");
            ch1.setHealth(0);
            ch2.setHealth(0);
            ch1.checkHealth();
            ch2.checkHealth();
        }
        
    }
}

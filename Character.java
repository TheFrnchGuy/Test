
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{
    private String name;
    private int age;
    private String race;
    private int health;
    
    public Character(String name, int age, String race, int health)
    {
        this.name = name;
        this.age = age;
        this.race = race;
        this.health = health;
    }
    
    public Character()
    {
        this("Bob", 0, "Baby", 5);
    }
    
    public void jump()
    {
        System.out.println(name + "jumped");
        health += 5;
    }
    
    public void growOld()
    {
        age++;
        System.out.println(name + " is now " + age + " years old!");
        if (age <= 40)
        {
            health += 10;
            System.out.println(name + " now has " + health + " health.");
        }
        else if (age >= 60)
        {
            health -=  20;
            System.out.println(name + " now has " + health + " health.");
        }
            
        checkHealth();
    }
    
    public void nameChange(String newName)
    {
        System.out.println("Hi, I'm no longer " + name + ". ");
        name = newName;
        System.out.println("My name is now " + name);
    }
    
    public void punchWood()
    {
        System.out.println(name + " punched a tree");
        health -= 20;
        
        if(health/20 <= 0)
            System.out.println(name + " feels their conciousness fading");
        else if(health/20 <= 1)
            System.out.println("It broke " + name + "'s fingers");
        else if(health/20 <= 2)
            System.out.println("It left a huge cut");
        else if(health/20 <= 3)
            System.out.println("There's a slight bruise");
        else if(health/20 <= 4)
            System.out.println(name + "'s hand is fine");
        else if(health/20 <= 5)
            System.out.println(name + " thought it was fun");
        System.out.println();
        checkHealth();
    }
    
    public void checkHealth()
    {
        if (health <= 0)
            System.out.println(name + " has died. Oof");
    }
    
    public String toString()
    {
        return "Name: " + name + "\n\tAge: " + age + "\n\tRace: " + race + "\n\tHealth: " + health;
    }
    
    public void setHealth(int newHealth)
    {
        health = newHealth;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getHealth()
    {
        return health;
    }
}

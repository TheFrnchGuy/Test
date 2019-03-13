
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Ticket
{
    private int ticketNum;
    private int daysInAdvance;
    private double price;
    private boolean student;
    
    public Ticket(int ticketNum, int daysInAdvance, int price, boolean student)
    {
        this.ticketNum = ticketNum;
        this.daysInAdvance = daysInAdvance;
        this.price = price;
        this.student = student;
    }
    
    public void changePrice(double _price)
    {
        price = _price;
    }
    
    public String toString()
    {
        return "Number: " + ticketNum + ", Price: " + price;
    }
}


/**
 * Write a description of class StudentAdvanceTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentAdvanceTicket extends Ticket
{
    public StudentAdvanceTicket(int ticketNum, int daysInAdvance)
    {
        super(ticketNum, daysInAdvance, 0, true);
        if(daysInAdvance >= 10)
            changePrice(15);
        else if(daysInAdvance < 10)
            changePrice(20);
    }
    
    public String toString()
    {
        return super.toString() + " (ID Required)";
    }
}

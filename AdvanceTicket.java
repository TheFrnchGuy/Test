
/**
 * Write a description of class AdvanceTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdvanceTicket extends Ticket
{
    public AdvanceTicket(int ticketNum, int daysInAdvance)
    {
        super(ticketNum, daysInAdvance, 0, false);
        if(daysInAdvance >= 10)
            changePrice(30);
        else if(daysInAdvance < 10)
            changePrice(40);
    }
}

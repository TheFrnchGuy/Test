
/**
 * Creates a residance object
 *
 * @author (Paris G.)
 * @version (2/13/19)
 */
public class Resident
{
    private int residentNum, sleepHabits, studyHabits, socialActivity;
    
    public Resident(int rn, int sl, int st, int so)
    {
        residentNum = rn;
        sleepHabits = sl;
        studyHabits = st;
        socialActivity = so;
    }
    
    public Resident()
    {
        this(0, 0, 0, 0);
    }
    
    public int getResNum()
    {
        return residentNum;
    }
    
    public int getSleepHab()
    {
        return sleepHabits;
    }
    
    public int getStudyHab()
    {
        return studyHabits;
    }
    
    public int getSocAct()
    {
        return socialActivity;
    }
    
    
    public String toString()
    {
        return "Resident #" + residentNum + "\n\tSleep Habits: " + sleepHabits + "\n\tStudy Habits: " + studyHabits + "\n\tSocial Activity: " + socialActivity;
    }
}

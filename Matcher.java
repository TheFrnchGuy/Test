
/**
 * Write a description of class group here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matcher
{
    private Resident [] group;
    
    public Matcher(Resident [] residents)
    {
        group = residents;
    }
    
    public double calculateCompScore(Resident A, Resident B)
    {
        double sleepCompScore = Math.abs(A.getSleepHab() - B.getSleepHab());
        double studyCompScore = Math.abs(A.getStudyHab() - B.getStudyHab());
        double socialCompScore = Math.abs(A.getSocAct() - B.getSocAct());
        return (sleepCompScore + studyCompScore + socialCompScore) / 3.0;
    }
    
    public Resident [] bestMatch()
    {
        Resident [] bestMates = {group[0], group[1]};
        double bestScore = calculateCompScore(group[0], group[1]);
        for(int i = 0; i < group.length; i++)
        {
            for(int j = i + 1; j < group.length; j++)
            {
                Matcher roommates = new Matcher(group);
                double matchScore = roommates.calculateCompScore(group[i], group[j]);
                if(matchScore < bestScore)
                {
                    bestScore = matchScore;
                    bestMates[0] = group[i];
                    bestMates[1] = group[j];
                }
            }
        }
        System.out.println("The best matched partners are the following with a compatibility score of " + bestScore + ":\n" + bestMates[0] + "\n" + bestMates[1]);
        return bestMates;
    }
    
    public Resident [] worstMatch()
    {
        Resident [] worstMates = {group[0], group[1]};
        double worstScore = calculateCompScore(group[0], group[1]);
        for(int i = 0; i < group.length; i++)
        {
            for(int j = i + 1; j < group.length; j++)
            {
                Matcher roommates = new Matcher(group);
                double matchScore = roommates.calculateCompScore(group[i], group[j]);
                if(matchScore > worstScore)
                {
                    worstScore = matchScore;
                    worstMates[0] = group[i];
                    worstMates[1] = group[j];
                }
            }
        }
        System.out.println("The worst matched partners are the following with a compatibility score of " + worstScore + ":\n" + worstMates[0] + "\n" + worstMates[1]);
        return worstMates;
    }
    
    public Resident [] bestIndividualMatch(Resident person)
    {
        Resident [] bestMates = {person, group[0]};
        double bestScore = calculateCompScore(person, group[0]);
        if(person == group[0])
        {
            bestScore = calculateCompScore(person, group[1]);
            bestMates[1] = group[1];
        }
        
        for(int i = 0; i < group.length; i++)
        {
            Matcher roommates = new Matcher(group);
            double matchScore = roommates.calculateCompScore(person, group[i]);
            if (matchScore < bestScore && person.getResNum() != group[i].getResNum())
            {
                bestScore = matchScore;
                bestMates[1] = group[i];
            }
        }
        System.out.println("The best match for Resident #" + person.getResNum() + " is Resident #" + bestMates[1].getResNum() + "\nThey have a  compatibility score of " + bestScore + ":\n" + person + "\n" + bestMates[1]);
        return bestMates;
    }
    
    public Resident [] worstIndividualMatch(Resident person)
    {
        Resident [] worstMates = {person, group[0]};
        double worstScore = calculateCompScore(person, group[0]);
        if(person == group[0])
        {
            worstScore = calculateCompScore(person, group[1]);
            worstMates[1] = group[1];
        }
        
        for(int i = 0; i < group.length; i++)
        {
            Matcher roommates = new Matcher(group);
            double matchScore = roommates.calculateCompScore(person, group[i]);
            if(person.getResNum() == group[i].getResNum())
            {}
            else if (matchScore > worstScore && person.getResNum() != group[i].getResNum())
            {
                worstScore = matchScore;
                worstMates[1] = group[i];
            }
        }
        System.out.println("The worst match for Resident #" + person.getResNum() + " is Resident #" + worstMates[1].getResNum() + "\nThey have a  compatibility score of " + worstScore + ":\n" + person + "\n" + worstMates[1]);
        return worstMates;
    }
}

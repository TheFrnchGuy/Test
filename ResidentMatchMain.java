
/**
 * Write a description of class ResidentMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResidentMatchMain
{
    public static void main(String [] args)
    {
        Resident [] sample = {new Resident(1, 47, 89, 22), new Resident(2, 99, 14, 44), new Resident(3, 26, 55, 60), new Resident(4, 89, 45, 1), new Resident(5, 42, 74, 81), new Resident(6, 66, 57, 27), new Resident(7, 92, 53, 25), new Resident(8, 26, 98, 11), new Resident(9, 41, 41, 10), new Resident(10, 69, 50, 90), new Resident(11, 22, 54, 17), new Resident(12, 10, 49, 10), new Resident(13, 81, 77, 94), new Resident(14, 54, 87, 96), new Resident(15, 98, 93, 32), new Resident(16, 93, 5, 69), new Resident(17, 52, 90, 75), new Resident(18, 72, 28, 97), new Resident(19, 64, 51, 19), new Resident(20, 56, 58, 59)};
                
        printArray(sample);
                
        Matcher dorm = new Matcher(sample);
                
        dorm.bestMatch();
        dorm.worstMatch();
        dorm.bestIndividualMatch(sample[0]);
        dorm.worstIndividualMatch(sample[0]);

    }
    
    //Prints all the elements in an array of Residents
    public static void printArray(Resident [] arr)
    {
        for (Resident r: arr)
        {
            System.out.println(r);
        }
    }
    
    //Generates a random integer between a min and max value 
    public static int randomNumber(int min, int max)
    {
        return (int)(Math.random() * (max - min + 1) + min);
    }

}

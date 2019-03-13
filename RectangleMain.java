
/**
 * The main method for testing the rectangle class.
 *
 * @author (Paris G)
 * @version (1/31/19)
 */
public class RectangleMain
{
    public static void main(String [] args)
    {
        Rectangle r1 = new Rectangle(4, 3);
        System.out.println("Rectangle r1: " + r1);
        
        System.out.println("Rectangle r1 has an area of " + r1.getArea());
        
        System.out.println("Rectangle r1 has a perimeter of " + r1.getPerimeter());
        
        r1.doubleSides();
        System.out.println("Rectangle r1 after doubling sides: " + r1);
        
        System.out.println("Rectangle r1 is a square: " + r1.isSquare());
        
        r1.changeWidth(8);
        System.out.println("Rectangle r1 after changing width: " + r1);
        
        System.out.println("Rectangle r1 is a square: " + r1.isSquare());
        
        r1.changeLength(12);
        System.out.println("Rectangle r1 after changing length: " + r1);
        
        Rectangle r2 = new Rectangle(3, 7);
        System.out.println("Rectangle r2: " + r2);
        
        System.out.println("The difference in area between r1 and r2 is " + r1.differenceInArea(r2));
    }
}

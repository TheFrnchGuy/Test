import java.awt.Point;

/**
 * An intro to objects by looking at awt.Points.
 *
 * @author (Paris G.)
 * @version (1/29/19)
 */
public class PointsIntro
{
    public static void main(String [] args)
    {
        Point p = new Point(3, 8);
        
        System.out.println(p);
        
        p.translate(-1, -2);
        System.out.println(p);
        
        p.setLocation(5, 8);
        
        System.out.println(p);
        
        p.x = -1;
        System.out.println(p);
        
        System.out.println();
        
        Point p1 = new Point (2, 9);
        Point p2 = new Point (7, 4);
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        System.out.println("Distance from p1 to p2:" + p1.distance(p2));
    }
}

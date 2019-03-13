
/**
 * Write a description of class EquilateralTriganle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EquilateralTriganle extends RegularPolygon
{
    public EquilateralTriganle(int sideLength)
    {
        super("Equilateral Triganle", 3, sideLength);
    }
    
    public double getArea()
    {
        return Math.sqrt(3) / 4 * getSideLength() * getSideLength();
    }
}


/**
 * Rectangle Class.
 *
 * @author (Paris G)
 * @version (1/31/19)
 */
public class Rectangle
{
    private int length;
    private int width;
    
    public Rectangle(int lengthSet, int widthSet)
    {
        length = lengthSet;
        width = widthSet;
    }
    
    public String toString()
    {
        return length + " x " + width;
    }
    
    public int getArea()
    {
        return length * width;
    }
    
    public int getPerimeter()
    {
        return (length * 2) + (width * 2);
    }
    
    public void doubleSides()
    {
        length = length * 2;
        width = width * 2;
    }
    
    public boolean isSquare()
    {
        return width == length;
    }
    
    public void changeLength(int newLength)
    {
        length = newLength;
    }
    
    public void changeWidth(int newWidth)
    {
        width = newWidth;
    }
    
    public int differenceInArea(Rectangle r2)
    {
        return getArea() - r2.getArea();
    }
}

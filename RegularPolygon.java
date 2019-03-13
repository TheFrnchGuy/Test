
/**
 * Write a description of class RegularPolygon here.
 *
 * @author Paris G.
 * @version 3/5/19
 */
public abstract class RegularPolygon
{
    private String Name;
    private int numSides;
    private int sideLength;
    
    public RegularPolygon(String _Name ,int _numSides, int _sideLength)
    {
        Name = _Name;
        numSides = _numSides;
        sideLength = _sideLength;
    }
    
    public int getPerimeter()
    {
        return numSides * sideLength;
    }
    
    public abstract double getArea();
    
    public String hey()
    {
        return "Hello";
    }
    
    public String toString()
    {
        return Name + " -- Perimeter: " +getPerimeter() + ", Area: " +getArea();
    }
    
    public int getNumSides(){return numSides;}
    public int getSideLength(){return sideLength;}
}

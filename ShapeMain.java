
/**
 * Write a description of class ShapeMain here.
 *
 * @author Paris G.
 * @version 3/5/19
 */
public class ShapeMain
{
    public static void main(String [] args)
    {
        Square s = new Square(10);
        
        System.out.println(s.hey());
        
        System.out.println(s);
        System.out.println(s.getArea());
        
        EquilateralTriganle t = new EquilateralTriganle(5);
        
        System.out.println(t);
        System.out.println(t.getArea());
        
        RegularPolygon s2 = new Square(15);
        
        RegularPolygon t2 = new EquilateralTriganle(15);
        
        RegularPolygon [] shapes = {s2, t2};
        
        for(int i = 0; i < shapes.length; i++)
        {
            System.out.println(shapes[i]);
        }
    }
}

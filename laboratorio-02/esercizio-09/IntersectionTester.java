import java.awt.Rectangle;

public class IntersectionTester
{
 public static void main(String[] args)
 {
   Rectangle r1 = new Rectangle(5, 10, 12, 30);
   Rectangle r2 = new Rectangle(0, 12, 34, 44);
   Rectangle r3 = r1.intersection(r2);
   System.out.println("Rettangolo 1: " + r1.getX() + " , " + r1.getY() + " , " + r1.getWidth() + " , " + r1.getHeight());
   System.out.println("Rettangolo 2: " + r2.getX() + " , " + r2.getY() + " , " + r2.getWidth() + " , " + r2.getHeight());
   System.out.println("Rettangolo 3: " + r3.getX() + " , " + r3.getY() + " , " + r3.getWidth() + " , " + r3.getHeight());
 }
}

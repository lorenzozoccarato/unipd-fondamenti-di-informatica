import java.awt.Rectangle;

public class RectangleTester
{
 public static void main(String[] args)
 {
   //Aggiunge un punto, specificato dagli argomenti interi newx,newy ai limiti del Rectangle.
   Rectangle box = new Rectangle(5, 10, 20, 30);
   System.out.println(box);
   box.add(0, 0);
   System.out.println(box);
 }
}

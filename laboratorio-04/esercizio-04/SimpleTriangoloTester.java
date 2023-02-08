import java.util.Scanner;

public class SimpleTriangoloTester
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Inserisci il primo lato: ");
    int l1 = in.nextInt();
    System.out.print("Inserisci il secondo lato: ");
    int l2 = in.nextInt();
    System.out.print("Inserisci il terzo lato: ");
    int l3 = in.nextInt();
    in.close();  
         
    int a = l1;
    int b = l2;
    int c = l3;
    int t;

    if (a > b)
    {
      t = b;
      b = a;
      a = t;
    }
    if (a > c) 
      {
        t = c;
        c = a;
        a = t;
      }
    if (b > c)  
      {
        t = c;
        c = b;
        b = t;
      } 
        
    String output = "triangolo";

    if (a + b <= c) 
      output = "Non e' un triangolo!";
    else 
    {
      if (a == b && b == c) 
        output += " equilatero";  
      else 
      {
        if (a == b || b == c) 
          output += " isoscele";
        else output += " scaleno";
        if (c * c - a * a - b * b == 0)  
          output += " rettangolo";
        else if (c * c - a * a - b * b < 0) 
          output += " acutangolo";  
        else 
          output += " ottusangolo";
      }
    }
    System.out.println(output);
  }
}

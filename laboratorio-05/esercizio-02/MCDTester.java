import java.util.Scanner;

public class MCDTester
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Insersci due interi positivi m ed n (possibilmente m>n)");
    System.out.print("m: ");
    int m = in.nextInt();
    System.out.print("n: ");
    int n = in.nextInt();
    
    in.close();
    
    if (m <= 0 || n <= 0)
    {
      if (m <= 0)
        System.out.println("m = " + m + ": ingresso non ammesso");
      if (n <= 0)
        System.out.println("n = " + n + ": ingresso non ammesso");
      return; 
    }
    
    if (n > m)
    {
      int temporary = m;
      m = n;
      n = temporary;
    }
    
    int r = m%n;
    int mcd = 0;
    
    if (r != 0)
    {
      while (r != 0)
      {
        r = m%n;
        m = n;
        if (r != 0)
        {
          n = r;
        } 
      }
      mcd = n;
    }
    else
    {
      mcd = n;
    }
    System.out.println("Il valore dell'MCD è: " + mcd);
  }
}

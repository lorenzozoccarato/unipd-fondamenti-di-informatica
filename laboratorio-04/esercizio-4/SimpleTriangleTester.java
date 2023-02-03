import java.utils.Scanner;

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
    
    if (l1==l2 && l2==l3)
    {
      System.out.println("triangolo equilatero");
    }
    else if (l2==l3)
    {
      if(l1 < l2)
      {
        System.out.println("triangolo isoscele ottusangolo");
      }
      else
      {
        System.out.println("triangolo isoscele acutangolo");
      }
    }
    else
    {
      System.out.println("Verificare che si un triangolo");
    }
  }
}

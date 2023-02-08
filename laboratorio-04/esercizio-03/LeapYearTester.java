import java.util.Scanner;

public class LeapYearTester 
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Inserisci un anno: ");
    int year = in.nextInt();
    
    while (year<=1582)
    {
     System.out.print("Inserisci un anno valido: ");
     year = in.nextInt();
    }
    
    if (year%4==0 || year%400==0)
    {
      if (year%100==0 && year%400!=0)
      {
        System.out.println("Anno non bisestile");
      }
      else
      {
        System.out.println("Anno bisestile");
      }
    }
    else
    {
      System.out.println("Anno non bisestile");
    }
  }
}

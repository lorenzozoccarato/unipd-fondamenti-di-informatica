import java.util.Scanner;

public class LeapYearTester 
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    boolean done = false;

    while (!done)
    {
      System.out.print("Inserisci un anno (0 per terminare): ");
      String newInput;
      
      if(!in.hasNextLine() || (newInput = in.next()).equalsIgnoreCase("0"))
      {
        done = true;
      }

      else
      {
        try
        {
          int year = Integer.parseInt(newInput);
          if (year < 0)
          {
            System.out.println("Deve essere un intero positivo");
          }
          else
          {
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
        catch(NumberFormatException e)
        {
          System.out.println("No, voglio un numero intero");
        }
      }
    }
  }
}

import java.util.Scanner;

public class FactorResolver
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Inserisci un numero intero positivo: ");
    int n = in.nextInt();
    
    while (n <= 0)
    {
      System.out.println("Il numero è negativo o uguale a zero");
      System.out.print("Reinserisci il numero: ");
      n = in.nextInt();
    }
    
    in.close();
    
    String output = "1";
    int divisor = n;
    int factor = 2;
    
    while (factor * factor <= divisor)
    {
      while (divisor % factor == 0)
      {
        output = output + " * " + factor; 
        divisor = divisor / factor; 
      }
        factor++;
    }
    
    if (divisor > 1)  
      output += " * " + String.valueOf(divisor);

    System.out.println(n + " = " + output); 
  }
}

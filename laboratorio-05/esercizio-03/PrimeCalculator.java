import java.util.Scanner;

public class PrimeCalculator
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Inserisci un numero intero positivo: ");
    int number = in.nextInt();
    
    while (number<=0)
    {
      System.out.println("Il numero è negativo o uguale a zero");
      System.out.print("Reinserisci il numero: ");
      number = in.nextInt();
    }
    
    in.close();
    
    System.out.println("Numeri primi minori uguali a " + number + ":");
    
    for (int i = 1; i <= number; i++)
    {
      boolean isPrime = true;
      for (int divisor = 2; divisor*divisor <= i && isPrime; divisor++)
      {
        //se il resto della divisione tra il numero e il divsore è uguale a 0, il numero non è primo
        if(i % divisor == 0)
          isPrime = false;
      }
      
      //stampa solo i numeri primi
      if (isPrime == true)
      {
        System.out.println(i);
      }
    }
  }
}

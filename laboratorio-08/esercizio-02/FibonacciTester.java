import java.util.Scanner;

public class FibonacciTester
{
    public static void main(String[] args)
    {
        int number = 0;

        if (args.length > 1)
        {  
            System.out.println("Troppi argomenti inseriti");
            System.exit(1);
        }
        else if (args.length == 1)
        {
            try
            {   
                number = Integer.parseInt(args[0]); 
            }
            catch (NumberFormatException e)
            {   
                System.out.println("Parametro errato");
                System.exit(1); 
            }
        }
        else
        {  
            Scanner in = new Scanner(System.in);
            while(number <= 0)
            {  
                System.out.print("Inserisci un numero intero positivo: ");
                try
                {  
                    number = Integer.parseInt(in.nextLine());
                }
                catch (NumberFormatException e)
                {  
                    System.out.println("Errore");
                }
            }
        }

        long itTime = System.currentTimeMillis();
        long itf = iterativeFib(number);
        itTime = System.currentTimeMillis() - itTime;
        System.out.println("Algoritmo iterativo: " + itf);
        System.out.printf("Tempo di calcolo: %.3f secondi%n", itTime/1000.0);

        long recTime = System.currentTimeMillis();
        long recf = recursiveFib(number);
        recTime = System.currentTimeMillis() - recTime;
        System.out.println("Algoritmo ricorsivo: " + recf);
        System.out.printf("Tempo di calcolo: %.3f secondi%n", recTime/1000.0);
    }

    private static long recursiveFib(int n)
    {
        long fib = 0;
        if (n<1)
         throw new IllegalArgumentException();
        else if (n < 3)
        {
            fib = 1;
        }
        else
        {
            fib = recursiveFib(n-1) + recursiveFib(n-2); 
        }
        return fib;
    }

    private static long iterativeFib(int n)
    {
        if (n < 1) 
          throw new IllegalArgumentException();
        
        long fib = 1;

        if (n >= 3)
        {
            long fib1 = 1;
            long fib2 = 1;

            for (int i = 3; i <= n; i++)
            {
                fib = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib;
            }
        }
        return fib;
    }
}
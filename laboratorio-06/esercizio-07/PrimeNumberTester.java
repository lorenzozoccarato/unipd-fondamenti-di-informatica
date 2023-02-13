import java.util.Scanner;

public class PrimeNumberTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int n = 0;

        String out = "";

        boolean done = false;

        while (!done)
        {
            try
            {
                n = in.nextInt();
                if (n==1)
                {
                    System.out.println("Il numero è primo");
                    break;
                }
                FactorGenerator fg = new FactorGenerator(n);
                while (fg.hasNextFactor())
                {
                    int factor = fg.nextFactor();
                    if (factor == n)
                    {
                        System.out.println("Il numero è primo");
                    }
                    else
                    {
                        System.out.println("Il numero non è primo");
                        break;
                    }
                }
                done = true;
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Il numero inserito non è valido");
                System.out.print("Inserisci un numero da scomporre in fattori primi: ");
            }
        }
    }
}

class FactorGenerator {

    public FactorGenerator(int value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }
        number = value;
        tempNumber = value;
    }

    public int nextFactor() {
        for (int i = temp; i <= tempNumber; i++) {
            if (tempNumber % i == 0) {
                tempNumber /= i;
                temp = i;
                return temp;
            }
        }
        return 0;
    }

    public boolean hasNextFactor() {
        return tempNumber != 1;
    }

    private int number;
    private int temp = 2;
    private int tempNumber;
}


//se il metodo viene invocato dopo aver ottenuto tutti i fattori primi, esso lancia IllegalStateException (da fare)
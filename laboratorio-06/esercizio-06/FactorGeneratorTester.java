import java.util.Scanner;

public class FactorGeneratorTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un numero da scomporre in fattori primi: ");
        int n = 0;

        String out = "Scomposizione in fattori primi: 1";

        boolean done = false;

        while (!done)
        {
            try
            {
                n = in.nextInt();
                FactorGenerator fg = new FactorGenerator(n);
                while (fg.hasNextFactor())
                {
                    int factor = fg.nextFactor();
                    String str = Integer.toString(factor);
                    out = out + ", " + str;
                }
                done = true;
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Il numero inserito non è valido");
                System.out.print("Inserisci un numero da scomporre in fattori primi: ");
            }
            System.out.println(out);
        }
    }
}

//se il metodo viene invocato dopo aver ottenuto tutti i fattori primi, esso lancia IllegalStateException (da fare)
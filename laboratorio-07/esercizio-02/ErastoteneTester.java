import java.util.Scanner;

public class ErastoteneTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci il numero MAX: ");
        int max = in.nextInt();

        boolean[] array = new boolean[max];

        for (int i = 0; i < max; i++)
        {
            array[i] = false;
        }
        
        for (int j = 2; j < max; j++)
        {
            for (int z = 2; z*j < max; z++)
            {
                int pos = z*j;
                array[pos] = true;
            }
        }

        for (int k = 1; k < max; k++)
        {
            if (array[k] == false)
              System.out.println(k);
        }
    }
}
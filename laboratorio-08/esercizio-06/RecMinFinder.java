public class RecMinFinder
{
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Il numero di parametri inseriti è errato");
            System.exit(1);
        }
        else 
        {
            int dim = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            int[] array = new int[dim];

            for (int i = 0; i < array.length; i++)
            {
                array[i] = (int) (1 + (1+n-1)*Math.random());
                System.out.print(array[i] + " ");
            }

            int min = MinFinder(array, array[0], dim);
            System.out.println("\nIl minimo valore dell'array è: " + min);
        }
    }

    private static int MinFinder(int v [], int min, int dim)
    {
       if (dim == 0)
         return min;
       else
       {
          if (min > v[dim - 1])
            {
               min = v[dim-1];
            }
          return MinFinder(v, min, dim - 1);
       }
    }
}
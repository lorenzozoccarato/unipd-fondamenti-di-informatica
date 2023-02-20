public class RecSelSortTester
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
            int [] array = new int[dim];
            
            System.out.print("Array generato: ");

            for (int i = 0; i < array.length; i++)
            {
                array[i] = (int) (1 + (1+n-1)*Math.random());
                System.out.print(array[i] + " ");
            }
            
            recSelectionSort(array, 0, array.length);

            System.out.println("");
            System.out.print("Array ordinato: ");

            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i] + " ");
            }
            System.out.println("");
        }
    }

    public static void recSelectionSort(int[] v, int from, int dim)
    {
        if (from >= dim) 
        {
            throw new IllegalArgumentException();
        }

        if (from == dim-1)
        {
            return;
        }

        int minPos = findMinPos(v, from, dim-1);
        if (minPos != from)
        {
            swap(v, minPos, from);
        } 

        recSelectionSort(v, from+1, dim);
    }

    private static void swap(int[] v, int i, int j)
    {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    private static int findMinPos(int[] v, int from, int to)
    {
        int pos = from;
        int min = v[from];
        for (int i = from + 1; i <= to; i++)
           if (v[i] < min)
           { 
              pos = i;
              min = v[i]; 
           }
        return pos;
    }
}
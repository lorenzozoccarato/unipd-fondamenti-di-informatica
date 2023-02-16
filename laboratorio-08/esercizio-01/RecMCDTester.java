public class RecMCDTester
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
            if (((Integer.parseInt(args[0])) < 0) || ((Integer.parseInt(args[1]) < 0)))
            {
                System.out.println("Uno dei due numeri inseriti non è positivo");
                System.exit(1);
            }
            else
            {
                System.out.println("----CALCOLO MCD----");
                int n = Integer.parseInt(args[0]);
                int m = Integer.parseInt(args[1]);
                if (n < m)
                {
                    int temp = n;
                    n = m;
                    m = temp;
                }
                int r = m%n;
                System.out.println(recursiveMCD(n, m, r));
            }
        }
    }

    public static int recursiveMCD(int n, int m , int r)
    {
        if (r == 0)
        {
            return n;
        }
        else
        {
            return recursiveMCD(m, n % m, n % m % r);
        }
    }
}
public class RecNumberPrinter 
{
    public static void main(String[] args) 
    {
        if (args.length != 1) 
        {
            System.out.println("Devi inserire un solo numero intero.");
        } 
        else 
        {
            int number = Integer.parseInt(args[0]);
            System.out.println(listNumbers(number));
        }
    }

    public static String listNumbers(int n)
    {
        if (n <= 0) 
            throw new IllegalArgumentException();
        if (n == 1) 
            return "" + n;
        return listNumbers(n-1) + " " + n; 
    }
}


/*
---Alternativa personale---

System.out.println(listNumbers(1, number));

    public static String listNumbers(int start, int end) {
        if (start > end) {
            return "";
        } else {
            return start + " " + listNumbers(start+1, end);
        }
    }
}
*/
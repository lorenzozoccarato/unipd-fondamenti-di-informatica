public class RecStringReverser
{
    public static void main(String[] args)
    {
        if (args.length != 1)
            System.out.println("Hai inserito più di una stringa");
        else
            System.out.println(reverseString(args[0]));
    }

    private static String reverseString(String str)
    {
        if (str == null)
            throw new IllegalArgumentException();
        if (str.length() < 2) 
            return str;
        return reverseString(str.substring(1)) + str.charAt(0); 
    }
}
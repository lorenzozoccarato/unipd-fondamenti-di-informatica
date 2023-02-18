public class RecPalindromeTester
{
    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("Non hai inserito parole, quindi non posso verificare");
            System.exit(1);
        }
        else if (args.length == 1)
        {
            if (isPalindromeString(args[0]))
            {
                System.out.println("La parola è palindrome");
            }
            else
            {
                System.out.println("La parola non è palindrome");
            }
        }
        else
        {
            System.out.println("Hai inserito una frase, al momento non sono in grado di verificare se è parlindrome");
            System.exit(1);
        }
    }

    private static boolean isPalindromeString(String s) 
    {
        if (s == null)
            throw new IllegalArgumentException();

        int length = s.length();
        if (length < 2)
            return true;
        
        if (s.charAt(0) != s.charAt(length - 1))
            return false;

        String ss = s.substring(1, length - 1);
            return isPalindromeString(ss);
    }
}
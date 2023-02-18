public class RecSubstringGenerator
{
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.out.println("Il numero dei parametri inseriti è errato");
            System.exit(1);
        }
        else
        {
            String[] substring = getSubstrings(args[0]);
            for (int i = 0; i <= substring.length; i++)
            {
                System.out.print(substring[i] + " ");
            }
        }
    }

    private static String[] getSubstrings(String s)
    {
        if (s.length() < 2)
        return new String[] {s};
        
        String[] substrings1 = new String[s.length()]; 
        for (int i = 0; i < s.length(); i++)
        {
            substrings1[i] = s.substring(0 , i+1);
        }

        String[] substrings2 = getSubstrings(s.substring(1));

        String[] substrings = new String[substrings1.length + substrings2.length];

        for (int i = 0; i < substrings1.length; i++)
        {
            substrings[i] = substrings1[i];
        }

        for (int i = 0; i < substrings2.length; i++)
        {
            substrings[i + substrings1.length] = substrings2[i];
        }
        return substrings;
    } 
}
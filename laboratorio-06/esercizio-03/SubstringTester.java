import java.util.Scanner;

public class SubstringTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserire la prima stringa: ");
        String str1 = in.nextLine();
        System.out.print("Inserire la seconda stringa: ");
        String str2 = in.nextLine();
        
        int c=0;

        for (int i = 0; i < str2.length(); i++)
        {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 != c2)
            {
                System.out.println("La seconda stringa non è una sottostringa...");
                break;
            }
            else
                c++;
        }
        if (c == str2.length())
        {
            System.out.println("La seconda stringa è una sottostringa");
        }
    }
}
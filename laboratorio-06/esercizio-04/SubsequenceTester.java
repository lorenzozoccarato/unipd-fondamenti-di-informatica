import java.util.Scanner;

public class SubsequenceTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserire la prima stringa: ");
        String str1 = in.nextLine();
        System.out.print("Inserire la seconda stringa: ");
        String str2 = in.nextLine();

        boolean state = true;
        int c = 0;

        int temp = 0;
        int temps = 0;

        for (int i = 0; i < str2.length(); i++)
        {
            char c2 = str2.charAt(i);
            for (int j = 0; j < str1.length(); j++)
            {
                
                char c1 = str1.charAt(j);

                if (c1 == c2)
                {
                    temps = temp;
                    temp = j;
                    break;
                }
            }
            if (temp >= temps)
            {
                c++;
            }
        }
        if (c == str2.length())
          System.out.println("La seconda stringa è una sottosequenza");
        else
          System.out.println("La seconda stringa non è una sottosequenza");
    }
}
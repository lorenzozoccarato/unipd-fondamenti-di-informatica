import java.util.Scanner;

public class StringComparator 
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Inserisci la prima parola: ");
    String s1 = in.nextLine();
    System.out.print("Inserisci la seconda parola: ");
    String s2 = in.nextLine();
    System.out.print("Inserisci la terza parola: ");
    String s3 = in.nextLine();
    
    String primo;
    String secondo;
    String terzo;
    
    if (s1.compareTo(s2)<0)
    {
      if (s1.compareTo(s3)<0)
      {
        if (s2.compareTo(s3)<0)
        {
          primo = s1;
          secondo = s2;
          terzo = s3;
        }
        else
        {
          primo = s1;
          secondo = s3;
          terzo = s2;
        }
      }
      else
      {
        primo = s3;
        secondo = s1;
        terzo = s2;
      }
    }
    
    else 
    {
      if (s2.compareTo(s3)<0)
      {
        if (s1.compareTo(s3)<0)
        {
          primo = s2;
          secondo = s1;
          terzo = s3;
        }
        else
        {
          primo = s2;
          secondo = s3;
          terzo = s1;
        }
      }
      else
      {
        primo = s3;
        secondo = s2;
        terzo = s1;
      }
    }
   System.out.println(primo + " " + secondo + " " + terzo);
  }
}

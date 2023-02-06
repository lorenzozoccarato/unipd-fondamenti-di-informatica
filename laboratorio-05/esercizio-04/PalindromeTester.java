import java.util.Scanner;

public class PalindromeTester
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Inserisci una stringa: ");
    String word = in.nextLine();
    
    in.close();
    
    boolean isPalindrome = false;
    
    if (word.length() == 0)
      isPalindrome = true;
    
    for (int i = 0; i < word.length()/2; i++)
    {  
      if(word.charAt(i) != word.charAt(word.length() - 1 - i))
        isPalindrome = false;
      else
        isPalindrome = true;
      
    }
    
    if (isPalindrome)
      System.out.println("La stringa è palindroma");
    else
      System.out.println("La stringa non è palindroma");
  }
}

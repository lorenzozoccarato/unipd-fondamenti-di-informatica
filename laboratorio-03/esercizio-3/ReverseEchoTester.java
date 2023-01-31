import java.util.Scanner;

public class ReverseEchoTester
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Inserisci tre parole nella stessa riga: ");
    
    String first = in.next();
    String second = in.next();
    String third = in.next();
    
    System.out.println("La prima parola è: " + third);
    System.out.println("La seconda parola è: " + second);
    System.out.println("La terza parola è: " + first);
  }
}

import java.util.Scanner;

public class DoubleComparator
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Inserisci il primo numero: ");
    Double n1 = in.nextDouble();
    System.out.print("Inserisci il secondo numero: ");
    Double n2 = in.nextDouble();
    
    final int cifre = 2;
    String negazione = "non ";
    
    //senza parentesi graffe
    if (approxEqual(n1, n2, 2))
     negazione = "";
    
    //attenzione alla variabile negazione che varia in base alla condizione precedente
    System.out.println(n1 + " e " + n2 + " " + negazione + "sono approssimativamente uguali se arrotondati a " + cifre + " cifre decimali");  
  }
  
  public static boolean approxEqual(double n1, double n2, int cifre)
  {
    //nel nostro caso facciamo il troncamento per 10^2 (2 cifre decimali)
    double potenza = Math.pow(10, cifre);
    return Math.round(potenza * n1) == Math.round(potenza * n2);
  }
}

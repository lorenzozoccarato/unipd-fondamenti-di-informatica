import java.util.Scanner;

public class AdjectiveTester
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Inserisci un aggettivo qualificativo: ");
    String aggettivo = in.nextLine();
    in.close();
    
    String iniziale = aggettivo.substring(0, aggettivo.length()-1);
    String diminutivo = iniziale + "in" + aggettivo.charAt(aggettivo.length()-1);
    String superlativo = iniziale + "issim" + aggettivo.charAt(aggettivo.length()-1);
    
    System.out.println("Aggettivo inserito: " + aggettivo);
    System.out.println("Forma diminutiva: " + diminutivo);
    System.out.println("Superlativo assoluto: " + superlativo);
  }
}

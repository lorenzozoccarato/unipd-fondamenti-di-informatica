import java.util.Scanner;

public class BankAccountTester
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    BankAccount account = new BankAccount();
    
    System.out.println("Hai aperto un nuovo conto. Grazie per averci scelto!");
    System.out.println("Numero di conto: " + account.getAccountNumber());
    System.out.println("Saldo iniziale: " + account.getBalance());

    boolean done = false;

    while (!done)
    {
      System.out.print("Comando? (Q, B, D, W, A) ");
      String input = in.nextLine();

      Scanner command = new Scanner(input);
      String value="";
      String action="";

      while (command.hasNext())
      {
        String token = command.next();
        if (token.length()>1)
        {
          value = token;
        }
        else
        {
          action = token;
        }
      }

      if (action.equalsIgnoreCase("Q"))
      {
        System.out.println("Arrivederci");
        done = true;
      }
      else if (action.equalsIgnoreCase("B"))
        System.out.println("Saldo attuale: " + account.getBalance());
      else if (action.equalsIgnoreCase("D"))
      {
        if (account.deposit(Double.parseDouble(value)) == true)
         System.out.println("Versamento effettuato: " + Double.parseDouble(value));
        else
         System.out.println("Versamento non autorizzato");
      } 
      else if (action.equalsIgnoreCase("W"))
      {
        if (account.withdraw(Double.parseDouble(value)) == true)
         System.out.println("Prelievo effettuato: " + Double.parseDouble(value));
        else
         System.out.println("Prelievo non autorizzato");
      }
      else if (action.equalsIgnoreCase("A"))
        account.addInterest(Double.parseDouble(value));
      else
        System.out.println("Il comando specificato non esiste");
    }
  }
}


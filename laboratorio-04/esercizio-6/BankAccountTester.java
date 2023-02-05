import java.util.Scanner;

public class BankAccountTester
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Inserire saldo iniziale: ");
    double initialBalance = Double.parseDouble(in.nextLine());
    
    BankAccount account = new BankAccount(initialBalance);
    
    System.out.print("Inserire tasso di interesse: ");
    double rate = Double.parseDouble(in.nextLine());
    
    account.addInterest(rate);
    account.addInterest(rate);
    
    System.out.println("Saldo dopo 2 anni: " + account.getBalance() + " euro");
    
    System.out.print("Inserire somma da prelevare: ");
    double amount = Double.parseDouble(in.nextLine());
    
    account.withdraw(amount);
    
    System.out.println("Saldo dopo il prelievo: " + account.getBalance() + " euro");  
  }
}

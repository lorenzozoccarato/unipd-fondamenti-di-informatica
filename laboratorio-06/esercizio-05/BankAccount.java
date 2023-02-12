public class BankAccount
{
  public BankAccount()
  {
    balance = 0;
    lastAssignedNumber++;
    accountNumber = lastAssignedNumber;
  }
  
  public BankAccount(double initialBalance)
  {
    if (initialBalance < 0)
    {
      System.out.println("Non si può aprire un conto con saldo negativo");
      return;
    }
    
    else
    {
      balance = initialBalance;
    }
  }
  
  public void deposit(double amount)
  {
    if (amount < 0)
    {
      System.out.println("Versamento non autorizzato");
      return;
    }
    
    else if (amount == 0)
    {
      System.out.println("Versamento non corretto");
      return;
    }

    else
    {
      balance = balance + amount;
      System.out.println("Versamento effettuato: " + amount);
    }
  }
  
  public void withdraw(double amount)
  {
    if (amount < 0)
    {
      System.out.println("Prelievo non corretto");
      return;
    }
    
    else
    {
      if (amount > balance)
      {
        System.out.println("Prelievo non autorizzato");
        return;
      }
      else
      {
        balance = balance - amount;
        System.out.println("Prelievo effettuato: " + amount);
      }
    }
  }
  
  public void addInterest(double rate)
  {
    if (rate >= 0)
    {
      balance = balance + (balance * rate / 100);
      System.out.println("Interessi calcolati e accreditati:" + (balance * (rate / 100)));
    }
    
    else
    {
      System.out.println("Non si può aggiungere un tasso negativo");
      return;
    }
  }
  
  public double getBalance()
  {
    return balance;
  }

  public int getAccountNumber()
  {
    return accountNumber;
  }
  
  private double balance;
  private int accountNumber;
  private static int lastAssignedNumber = 10000;
}

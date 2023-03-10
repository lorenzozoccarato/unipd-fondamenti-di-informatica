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
  
  public boolean deposit(double amount)
  {
    if (amount < 0)
    {
      return false;
    }
    
    else if (amount == 0)
    {
      return false;
    }

    else
    {
      balance = balance + amount;
      return true;
    }
  }
  
  public boolean withdraw(double amount)
  {
    if (amount < 0)
    {
      return false;
    }
    
    else
    {
      if (amount > balance)
      {
        return false;
      }
      else
      {
        balance = balance - amount;
        return true;
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

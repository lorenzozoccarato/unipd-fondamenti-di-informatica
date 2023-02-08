public class BankAccount
{
  //costruttori
  public BankAccount()
  {
    balance = 0;
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
  
  //metodi
  public void deposit(double amount)
  {
    if (amount < 0)
    {
      System.out.println("Non si può depositare un saldo negativo");
      return;
    }
    
    else
    {
      balance = balance + amount;
    }
  }
  
  public void withdraw(double amount)
  {
    if (amount < 0)
    {
      System.out.println("Non si può prelevare un saldo negativo");
      return;
    }
    
    else
    {
      if (amount > balance)
      {
        System.out.println("Attenzione! Il saldo del conto corrente diventa negativo");
        return;
      }
      else
      {
        balance = balance - amount;
      }
    }
  }
  
  public void addInterest(double rate)
  {
    if (rate >= 0)
    {
      balance = balance + (balance * rate / 100);
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
  
  private double balance;
}

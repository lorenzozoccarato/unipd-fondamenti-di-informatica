import java.util.Scanner;

public class ProductTester
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int c;
    
    System.out.print("Inserisci il nome del primo prodotto: ");
    String name = in.next();
    System.out.print("Inserisci il nome del primo prodotto : ");
    double price = in.nextDouble();
    
    Product p1 = new Product(name, price);
    
    System.out.print("Inserisci il nome del secondo prodotto: ");
    name = in.next();
    System.out.print("Inserisci il nome del secondo prodotto: ");
    price = in.nextDouble();
    
    Product p2 = new Product(name, price);
    
    String name_p1 = p1.getName();
    String name_p2 = p2.getName();
    
    if (p1.getPrice() > p2.getPrice())
    {
      System.out.println(name_p1 + ": " + p1.getPrice() + " euro  " + name_p2 + ": " + p2.getPrice() + " euro");
      c=1;
    }
    else
    {
      System.out.println(name_p2 + ": " + p2.getPrice() + " euro  " + name_p1 + ": " + p1.getPrice() + " euro");
      c=0;
    }
    
    System.out.print("Inserisci la percentuale di sconto: ");
    double rate = in.nextDouble();
    
    if (c == 1)
    {
      p1.reducePrice(rate);
    }
    else
    {
      p2.reducePrice(rate);
    }
    
    if (p1.getPrice() > p1.getPrice())
    {
      System.out.println(name_p2 + ": " + p2.getPrice() + " euro  " + name_p1 + ": " + p1.getPrice() + " euro");
    }
    else
    {
      System.out.println(name_p1 + ": " + p1.getPrice() + " euro  " + name_p2 + ": " + p2.getPrice() + " euro");
    }
  }
}

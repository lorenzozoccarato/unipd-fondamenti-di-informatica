public class Product
{
  public Product(String name, double price)
  {
     productName = name;
     productPrice = price;
  }
  
  public String getName()
  {
    return productName;
  }
  
  public double getPrice()
  {
    return productPrice;
  }
  
  public void reducePrice(double rate)
  {
    productPrice -= productPrice * rate / 100;
  }

  private String productName;
  private double productPrice;
}

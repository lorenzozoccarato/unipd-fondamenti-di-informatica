import java.util.Scanner;

public class CircleMathTester
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  System.out.print("Inserisci il raggio del cerchio: ");
  double raggio = in.nextDouble();
  in.close();
  
  double perimetro = raggio*2*Math.PI;
  double area = Math.pow(raggio,2)*Math.PI;
  
  System.out.println("Circonferenza = " + perimetro + " cm");
  System.out.println("Area = " + area + " cm2");
 }
}

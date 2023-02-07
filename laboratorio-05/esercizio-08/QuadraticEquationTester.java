import java.util.Scanner;

public class QuadraticEquationTester
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);

       System.out.print("Inserire il coefficiente a: ");
       double a = in.nextDouble();
       System.out.print("Inserire il coefficiente b: ");
       double b = in.nextDouble();
       System.out.print("Inserire il coefficiente c: ");
       double c = in.nextDouble();

       QuadraticEquation eq1 = new QuadraticEquation(a, b, c);

       if(eq1.hasSolutions())
       {
        System.out.println("La prima soluzione è: x1 = " + eq1.getSolution1());
        System.out.println("La seconda soluzione è: x2 = "+ eq1.getSolution2());
       }
       else
        System.out.println("L'equazione non ha soluzioni");
    }
}

class QuadraticEquation
{

  /*
      Costruttore: riceve i coefficienti a, b, c dell'equazione quadratica
      e inizializza i campi di esemplare secondo i valori ricevuti
  */

  public QuadraticEquation()
  {
    a = 0;
    b = 0;
    c = 0;
  }

  public QuadraticEquation(double acoeff, double bcoeff, double ccoeff)
  {
	a = acoeff;
    b = bcoeff;
    c = ccoeff;
  }



  /*
      Restituisce la prima delle due soluzioni dell'equazione quadratica,
      usando la ben nota formula...
  */

  public double getDelta()
  {
    return (b * b) - (4* a * c);
  }

  public double getSolution1()
  {
	return (- b + Math.sqrt(getDelta())) / (2 * a);
  }


  /*
      Restituisce la seconda delle due soluzioni dell'equazione quadratica,
      usando la ben nota formula...
  */
  public double getSolution2()
  {
	return (- b - Math.sqrt(getDelta())) / (2 * a);
  }



  /*
      Restituisce il valore false se l'equazione non ha soluzioni
      (ovvero se il discriminante e` negativo)
  */
  public boolean hasSolutions()
  {
	if (getDelta() < 0)
      return false;
    else
      return true;
  }

  private double a;
  private double b;
  private double c;

}
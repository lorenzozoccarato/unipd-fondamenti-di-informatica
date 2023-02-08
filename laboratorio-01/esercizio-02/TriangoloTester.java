import java.util.Scanner;
import java.util.Locale;

public class TriangoloTester
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      in.useLocale(Locale.US);

      // lettura dei dati da Standard Input
      System.out.print ("Introduci lati a, b, c: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();

      // creazione di una istanza del triangolo
      Triangolo triangolo = new Triangolo(a, b, c);

      // emissione a Standard Output dell'elaborazione
      System.out.println(triangolo +  ": " + triangolo.info());
      System.out.println("area = " + triangolo.area());
      System.out.println("h = " + triangolo.h());
   }
}

class Triangolo
{
   /*
      Construttore della classe Triangolo
   */
   public Triangolo (double la, double lb, double lc)
   {
	  a = la;
      b = lb;
      c = lc;
   }

   /*
      restituisce informazioni sul triangolo. le informazioni sono relative
      ai lati:     equilatero,  isoscele,    scaleno.
      agli angoli: acutangolo,  rettangolo,  ottusangolo.
      Esempio: per il triangolo di lati 3, 4, 5 restituisce la stringa
      "scaleno rettangolo".
   */
   public String info()
   {
     double t;

     if (a > b)
     {
       t = b;
       b = a;
       a = t;
     }
     if (a > c) 
     {
       t = c;
       c = a;
       a = t;
      }
    if (b > c)  
    {
      t = c;
      c = b;
      b = t;
    } 
        
    String output = "Triangolo";

    if (a + b <= c) 
      output = "Non e' un triangolo!";
    else 
    {
      if (a == b && b == c) 
        output += " equilatero";  
      else 
      {
        if (a == b || b == c) 
          output += " isoscele";
        else output += " scaleno";
        if (c * c - a * a - b * b == 0)  
          output += " rettangolo";
        else if (c * c - a * a - b * b < 0) 
          output += " acutangolo";  
        else 
          output += " ottusangolo";
      }
    }
    return output;
   }
   
   /*
      restituisce una stringa contenente una descrizione testuale dell'oggetto
      nel formato T(a, b, c)
      Esempio "T(3, 4, 5)"
   */
   public String toString ()
   {
     return "T(" + a + ", " + b + ", " + c + ")";
   }

    /*
       calcola e restituisce l'area del triangolo.
       Usa la formula di Erone:
            area * area = p * (p - a) * (p - b) * (p - c)
       dove p e` il semiperimetro, ovvero p = (a + b + c) / 2
    */
    public double area()
    {
      double p = (a + b + c) / 2;
	  return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
   
    /*
       calcola e restituisce l'altezze del triangolo relativa al lato maggiore:
    */
    public double h()
    {
	  return 2 * area() / c;
    }

  private double a;
  private double b;
  private double c;

}
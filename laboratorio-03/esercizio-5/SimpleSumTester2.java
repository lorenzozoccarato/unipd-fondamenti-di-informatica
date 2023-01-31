import java.util.Scanner;
import java.util.Locale;

public class SimpleSumTester2
{
 public static void main(String[] args)
 {
   Scanner in = new Scanner(System.in);
   in.useLocale(Locale.US);
   System.out.print("Inserisci tre numeri nella stessa riga: ");
   
   double primo = in.nextDouble();
   double secondo = in.nextDouble();
   double terzo = in.nextDouble();
   
   double somma = primo + secondo + terzo;
   
   System.out.println(primo + " + " + secondo + " + " + terzo + " = " + somma);
   
   in.close();
 }
}

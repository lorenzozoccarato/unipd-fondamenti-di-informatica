import java.util.Scanner;
import java.util.Locale;

public class SimpleSumTester
{
 public static void main(String[] args)
 {
   Scanner in = new Scanner(System.in);
   in.useLocale(Locale.ITALY);
   System.out.print("Inserisci tre numeri nella stessa riga: ");
   
   double primo = in.nextDouble();
   double secondo = in.nextDouble();
   double terzo = in.nextDouble();
   
   double somma = primo + secondo + terzo;
   
   System.out.println(primo + " + " + secondo + " + " + terzo + " = " + somma);
   
   in.close();
 }
}

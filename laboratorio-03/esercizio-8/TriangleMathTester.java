import java.util.Scanner;

public class TriangleMathTester
{
 public static void main(String[] args)
 {
   Scanner in = new Scanner(System.in);
   System.out.print("Inserisci il primo cateto del triangolo: ");
   double cateto1 = Double.parseDouble(in.nextLine());
   System.out.print("Inserisci il secondo cateto del triangolo: ");
   double cateto2 = Double.parseDouble(in.nextLine());
   in.close();
   
   double ipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
   System.out.println("Ipotenusa : " + ipotenusa + " cm");
   
   double perimetro = cateto1 + cateto2 + ipotenusa;
   System.out.println("Perimetro : " + perimetro + " cm");
   
   double area = (cateto1*cateto2)/2;
   System.out.println("Area : " + area + " cm2");
   
   double angolo1 = Math.asin(cateto1/ipotenusa); 
   double angolo2 = Math.asin(cateto2/ipotenusa);
   final double PI_GRADI = 180;
   angolo1 = angolo1/Math.PI*PI_GRADI;
   angolo2 = angolo2/Math.PI*PI_GRADI;
   System.out.println("Angolo1 : " + Math.round(angolo1) + " gradi");
   System.out.println("Angolo2 : " + Math.round(angolo2) + " gradi"); 
 }
}

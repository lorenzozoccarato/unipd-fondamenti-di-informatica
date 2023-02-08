import java.util.Scanner;

public class IntReader
{
 public static void main(String[] args)
 {
   Scanner in = new Scanner(System.in);
   int number = in.nextInt();
   String strnumber = Integer.toString(number);
   
   while (strnumber.length()>5 || number<0)
   {
      System.out.println("Error: enter a new number: ");
      number = in.nextInt();
      strnumber = Integer.toString(number);
   }
   
   //aggiungere il controllo del valore di ingresso non numerico e numeri in virgola mobile
   //il risultato è un errore 
   
   while (strnumber.length()<5)
   {
     strnumber = "0" + strnumber;
   }

   //non ho utlizzato la divisione intera / e modulo %
   System.out.println(strnumber.substring(0, 1) + " " + strnumber.substring(1, 2) + " " + strnumber.substring(2, 3) + " " + strnumber.substring(3, 4) + " " + strnumber.substring(4, 5) );
 }
}

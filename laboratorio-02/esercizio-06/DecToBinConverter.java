import java.util.Scanner;

public class DecToBinConverter
{
 public static void main(String[] args)
 {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter a number: ");
   float number = in.nextFloat();
   int intNumber = (int)(number);
   float decNumber = number - intNumber;
   //variabile contatore
   int i=0;
   int j=0;
   int d;
   int r;
   int one=1;
   int zero=0;
   String integer = "";
   String decimal = "";
   
   while (number<0 || number>=32)
   {
     System.out.println("Error: enter a new number ");
     number = in.nextInt();
   }
   
   //parte intera
   while (i<5)
   {
     d = intNumber/2;
     r = intNumber%2;
     integer = Integer.toString(r) + integer;
     intNumber = d;
     i++;
   } 
   
   //parte decimale
   while (j<5){
      decNumber = decNumber*2;
      if (decNumber>=1){
        decNumber = decNumber-one;
        decimal = decimal + Integer.toString(one);
      }
      
      else {
        decimal = decimal + Integer.toString(zero);
      }
      j++;
   }
   System.out.println(integer + "." + decimal);
 }
}
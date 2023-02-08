import java.util.Scanner;

public class TimeDiffComputer
{
 public static void main(String[] args)
 {
   Scanner in = new Scanner(System.in);
   System.out.println("Inserisci il primo orario: ");
   String orario1 = in.nextLine();
   System.out.println("Inserisci il secondo orario: ");
   String orario2 = in.nextLine();
   float differenza;
   int ore;
   float minuti;
   
   int minuti1 = (Integer.parseInt(orario1.substring(2,4))) + (Integer.parseInt(orario1.substring(0,2))*60);
   int minuti2 = (Integer.parseInt(orario2.substring(2,4))) + (Integer.parseInt(orario2.substring(0,2))*60);
   
   if (minuti1<=minuti2){
     differenza = minuti2-minuti1;
     ore = (int)differenza/60;
     differenza = (differenza/60)-ore;
     minuti = differenza*60;
     System.out.println(ore + " ore e " + (int)minuti + " minuti");
   }
   
   else{
     differenza = minuti1-minuti2;
     ore = (1440-(int)differenza)/60;
     differenza = ((1440-differenza)/60)-ore;
     minuti = differenza*60;
     System.out.println(ore + " ore e " + (int)minuti + " minuti");
   }
 }
}

import java.util.Scanner;

public class EtaBetaTester
{
 public static void main(String[] args)
 {
   Scanner in = new Scanner(System.in);
   System.out.print("Inserisci una una frase nel formato \"Articolo Sostantivo Verbo Aggettivo\": ");
   String articolo = in.next();
   String sostantivo = in.next();
   String verbo = in.next();
   String aggettivo = in.next();
   in.close();
   
   String iniziale = articolo.substring(0,1);
   iniziale = iniziale.toUpperCase();
   String finale = articolo. substring(1);
   articolo = iniziale + finale;
   
   System.out.println(articolo + " p" + sostantivo + " " + verbo + " p" + aggettivo);
 }
}

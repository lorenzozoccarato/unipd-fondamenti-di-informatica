import java.util.Scanner;

public class OroscopoTester
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("--Oroscopo prank--");
    System.out.print("Inserisci la data: ");
    int giorno = in.nextInt();
    int mese = in.nextInt();
    
    //controllo data
    while ((mese <= 0 || mese > 12) || (giorno <= 0 || giorno >= 31) || (mese == 2 && (giorno == 30 || giorno == 31)) || ((mese == 4 || mese == 6 || mese == 9 || mese == 11) && giorno == 31))
    {
      System.out.println("L'input inserito non è una data");
      System.out.print("Reinserisci la data: ");
      giorno = in.nextInt();
      mese = in.nextInt();
    }
    
    if((mese == 3 && giorno >= 21) || (mese == 4 && giorno <= 20))
    {
     System.out.println("ARIETE");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");
    }  
    else if ((mese == 4 && giorno >= 21) || (mese == 5 && giorno <= 20))
    {
     System.out.println("TORO");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");
    }
    else if ((mese == 5 && giorno >= 21) || (mese == 6 && giorno <= 21))
    {
     System.out.println("GEMELLI");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");
    }
    else if ((mese == 6 && giorno >= 22) || (mese == 7 && giorno <= 22))
    {
     System.out.println("CANCRO");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");     
    }
    else if ((mese == 7 && giorno >= 23) || (mese == 8 && giorno <= 22))
    {
     System.out.println("LEONE");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");     
    }
    else if ((mese == 8 && giorno >= 23) || (mese == 9 && giorno <= 22))
    {
     System.out.println("VERGINE");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");     
    }
    else if ((mese == 9 && giorno >= 23) || (mese == 10 && giorno <= 22))
    {
     System.out.println("BILANCIA");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");     
    }
    else if ((mese == 10 && giorno >= 23) || (mese == 11 && giorno <= 22))
    {
     System.out.println("SCORPIONE");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");     
    }
    else if ((mese == 11 && giorno >= 23) || (mese == 12 && giorno <= 21))
    {
     System.out.println("SAGITTARIO");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");     
    }
    else if ((mese == 12 && giorno >= 22) || (mese == 1 && giorno <= 20))
    {
     System.out.println("CAPRICORNO");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");     
    }
    else if ((mese == 1 && giorno >= 21) || (mese == 2 && giorno <= 19))
    {
     System.out.println("AQUARIO");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");     
    }
    else if ((mese == 2 && giorno >= 20) || (mese == 3 && giorno <= 20))
    {
     System.out.println("PESCI");
     System.out.println("Amore:    4/5");
     System.out.println("Amicizia: 3/5");
     System.out.println("Lavoro:   3/5");     
    }    
  }
}

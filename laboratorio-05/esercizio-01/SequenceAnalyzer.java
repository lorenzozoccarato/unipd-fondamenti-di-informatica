import java.util.Scanner;

public class SequenceAnalyzer
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    int counter = 0;
    double sum = 0;
    double sumSquares = 0;
    
    boolean done = false;
    
    while(!done)
    {
      System.out.println("Inserire un numero (S per terminare):");
      String newInput = in.next();
      
      if (newInput.equalsIgnoreCase("S"))
      {
        done = true;
      }
      else
      {
      	 double value = Double.parseDouble(newInput);
	 sum += value;  //oppure sum = sum + value
	 sumSquares += value * value;  //oppure sumSquares = sumSquares + value * value
	 counter++;  //oppure count = count + 1
      }
    }
    
    double average;
    double D;
    
    if (counter == 0)
    {
      average = 0;
      D = 0;
    }
    else
    {
      average = sum / counter;
      D = Math.sqrt((sumSquares - sum*sum/counter) / (counter - 1));
    }
    
    System.out.println("Hai inserito " + counter + " valori");
    System.out.println("La media è: " + average);
    System.out.println("La deviazione standard è: " + D);
  }
}

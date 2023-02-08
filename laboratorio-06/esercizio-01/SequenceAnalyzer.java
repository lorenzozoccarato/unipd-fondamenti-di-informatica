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
      String newInput;

      if (!in.hasNextLine() || (newInput=in.next()).equalsIgnoreCase("S"))
      {
        done = true;
      }
      else
      {
        try
        {
          double value = Double.parseDouble(newInput);
          sum += value;  //oppure sum = sum + value
	        sumSquares += value * value;  //oppure sumSquares = sumSquares + value * value
	        counter++;  //oppure count = count + 1
        }
        catch(NumberFormatException e)
        { 
          System.out.println("No, voglio un numero in virgola mobile");
        }
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

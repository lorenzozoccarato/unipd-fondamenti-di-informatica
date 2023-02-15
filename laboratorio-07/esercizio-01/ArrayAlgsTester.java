import java.util.Scanner;

public class ArrayAlgsTester
{
    public static void main(String[] args)
    {

       Scanner in = new Scanner(System.in);
       System.out.print("Inserisci la dimensione dell'array: " );
       int n = in.nextInt();

       System.out.print("Inserisci il valore massimo: " );
       int max = in.nextInt();

       int[] array = ArrayAlgs.randomIntArray(n, max);

       int aSize = array.length;
       System.out.println("Array creato:\n" + ArrayAlgs.printArray(array,aSize));
       System.out.println("Val. minimo: " + ArrayAlgs.findMin(array,aSize));
       System.out.println("Val. massimo: " + ArrayAlgs.findMax(array,aSize));
       
       boolean done = false;

        while (!done)
        {
            System.out.print("Comando? (Q, P, m, M, r, R, I) ");
            String input = in.nextLine();

            String value="";
            String value2="";
            String action="";

            Scanner command = new Scanner(input);

            if (command.hasNext()) 
            {
                action = command.next();
                if (command.hasNext()) 
                {
                    value = command.next();
                    if (command.hasNext())
                    {
                        value2 = command.next();  
                    }
                }
            }

            //System.out.println(action);
            //System.out.println(value);
            //System.out.println(value2);
            
            if (action.equalsIgnoreCase("Q"))
            {
                System.out.println("Arrivederci");
                done = true;
            }
            else if (action.equalsIgnoreCase("P"))
            {
                System.out.println(ArrayAlgs.printArray(array, aSize));
            }
            else if (action.equals("m"))
            {
                System.out.println(ArrayAlgs.findMin(array, aSize));
            } 
            else if (action.equals("M"))
            {
                System.out.println(ArrayAlgs.findMax(array, aSize));
            }
            else if (action.equals("r"))
            {
                int index = Integer.parseInt(value);
                ArrayAlgs.remove(array, aSize, index);
            }
            else if (action.equals("R"))
            {
                int index = Integer.parseInt(value);
                ArrayAlgs.removeSorted(array, aSize, index);
            }
            else if (action.equalsIgnoreCase("I"))
            {
                int index = Integer.parseInt(value);
                int v = Integer.parseInt(value2);
                ArrayAlgs.insert(array, aSize, index, v);
            }
            else
            {
                System.out.println("Il comando specificato non esiste");
            }
        }
    }
}

//stampa una riga in più all'inizio perchè ha problemi con in.nextInt e in.nextLine
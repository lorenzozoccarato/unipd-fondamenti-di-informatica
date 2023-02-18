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
        System.out.print("Comando? (Q=Quit, S=SelectionSort, I=InsertionSort, M=MergeSort) ");

       boolean done = false;

        while (!done)
        {
            String input = in.nextLine();

            String value="";
            String action="";

            Scanner command = new Scanner(input);

            if (command.hasNext()) 
            {
                action = command.next();
                if (command.hasNext()) 
                {
                    value = command.next();
                }
            }

            if (action.equalsIgnoreCase("Q"))
            {
                System.out.println("Arrivederci");
                done = true;
            }
            else if (action.equalsIgnoreCase("S"))
            {
                ArrayAlgs.selectionSort(array, aSize);
                System.out.println(ArrayAlgs.printArray(array, aSize));
                System.out.print("Comando? (Q=Quit, L=linearSearch, B=binarySearch) ");
            }
            else if (action.equalsIgnoreCase("I"))
            {
                ArrayAlgs.insertionSort(array, aSize);
                System.out.println(ArrayAlgs.printArray(array, aSize));
                System.out.print("Comando? (Q=Quit, L=linearSearch, B=binarySearch) ");
            } 
            else if (action.equalsIgnoreCase("M"))
            {
                ArrayAlgs.mergeSort(array, aSize);
                System.out.println(ArrayAlgs.printArray(array, aSize));
                System.out.print("Comando? (Q=Quit, L=linearSearch, B=binarySearch) ");
            }
            else if (action.equalsIgnoreCase("L"))
            {
                int v = Integer.parseInt(value);
                if (ArrayAlgs.binarySearch(array, aSize, v) < 0)
                  System.out.println("Il valore inserito non è contenuto nell'array");
                else
                  System.out.println("Il numero " + v + " è nella posizione " + (ArrayAlgs.binarySearch(array, aSize, v) + 1));
                  System.out.print("Comando? (Q=Quit, L=linearSearch, B=binarySearch) ");
            }
            else if (action.equalsIgnoreCase("B"))
            {
                int v = Integer.parseInt(value);
                if (ArrayAlgs.linearSearch(array, aSize, v) < 0)
                  System.out.println("Il valore inserito non è contenuto nell'array");
                else
                  System.out.println("Il numero " + v + " è nella posizione " + (ArrayAlgs.linearSearch(array, aSize, v) + 1));
                  System.out.print("Comando? (Q=Quit, L=linearSearch, B=binarySearch) ");
            }
            else
            {
                //System.out.println("Il comando specificato non esiste");
            }
        }
    }
}


//C'è qualche problema strutturale perchè l'array viene generato una sola volta e non c'è ordine tra ordine e ricerca degli elementi... Come il vecchio ArrayAlgs, anche questo è da mettere a posto
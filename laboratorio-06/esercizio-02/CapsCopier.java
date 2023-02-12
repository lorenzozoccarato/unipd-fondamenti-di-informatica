import java.util.Scanner;
import java.io.*;

public class CapsCopier
{
    public static void main(String[] args)
    {
    Scanner console = new Scanner(System.in);

    Scanner in=null;
    boolean done = false;
    while (!done)   
    {
        try
        {
            System.out.print("Inserisci il nome del file di input (senza estensione):");
            String inputfilename = console.nextLine();
            inputfilename += ".txt";
            in = new Scanner(new FileReader(inputfilename));
            done = true;
        }
        catch (FileNotFoundException e)
        {   System.out.println("Il file specificato non esiste!"); }
    }

    System.out.print("Inserisci il nome del file di output (senza estensione):");  
    String outputfilename = console.nextLine();
    outputfilename += ".txt";
    PrintWriter out = null;
    try
    {   
        out = new PrintWriter(outputfilename); 
    }
    catch (FileNotFoundException e)
    {
        System.out.println("Non riesco ad aprire il file in scrittura");
        System.exit(1);
    }

    while (in.hasNextLine())   
        {                          
            out.println(toInitUpCase(in.nextLine()));
        }
    in.close();   
    out.close();
    }


    private static String toInitUpCase(String line)
    {
    Scanner stok = new Scanner(line);  
    String templine = "";
    while(stok.hasNext()) 
        {
        String token = stok.next();
        String neword = token.substring(0,1).toUpperCase();
        if (token.length() > 1)
            neword += token.substring(1).toLowerCase();
        templine += neword + " "; 
        }
    
    templine = templine.substring(0,templine.length()-1);    

    stok = new Scanner(templine);
    
    stok.useDelimiter("'");
    String newline = "";
    while(stok.hasNext())
        {
        String token = stok.next();
        String neword = token.substring(0,1).toUpperCase();
        if (token.length() > 1)
            neword += token.substring(1);
        newline += neword + "'";
        }
    
    newline = newline.substring(0,newline.length()-1);

    return newline;
    }
}
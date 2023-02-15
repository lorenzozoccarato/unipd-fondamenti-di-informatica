public class MaxSubstringFinder
{
    public static void main(String[] args)
    {
        if (args.length != 2)
        { 
            System.out.println("Non hai inserito il numero di parametri giusti...");
            System.exit(1);
        }

        String s1 = args[0];
        String s2 = args[1];
        String max = "";
        int start1= 0;
        int start2 = 0;

        
        for (int i = 0; i < s1.length() - max.length(); i++)
        {  
            for (int j = 0; j < s2.length() - max.length(); j++)
            {
                int lt = 0; 
                boolean isInSubstring = true; 
                while (i+lt < s1.length() && j+lt < s2.length() && isInSubstring)
                {
                    if (s1.charAt(i+lt) != s2.charAt(j+lt))
                        isInSubstring = false; 
                    else
                        lt++;
                }

                //se la lunghezza della sottostringa appena salvata è maggiore di quella temporaneamente maggiore cambia la stringa maggiore e i valori di inizio e fine
                if (lt > max.length())
                {                     
                    max = s1.substring(i, i+lt);
                    start1 = i;
                    start2 = j;
                }
            }
        }

        System.out.println("Massima sottostringa comune: " + max);
    }
}

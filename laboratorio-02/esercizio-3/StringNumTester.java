/*
  Esempi di manipolazioni di stringhe e conversioni tra stringhe e numeri
*/


public class StringNumTester
{

    public static void main(String[] args)
    {

	String teststring= "stringa di test";

	//******** lunghezza di una stringa **************
	int teststringlength = teststring.length();
	System.out.println("lunghezza della stringa: " + teststringlength);


	//******* estrazione di una sottostringa ************

	int first = 3;  // provare varie combinazioni di first e last, in 
        int last = 10;  // particolare esaminare i seguenti casi: 
                        // first<0, last>15, first=last, first>last
	                // Cosa succede? Perche`? Consultare la documentazione
	                // Errore durante la compilazione del codice perchè non riconosce il numero indicato (la stringa, essendo lunga 15, non posso rappresentare il sedicesimo carattere)

	String testsubstring1 = teststring.substring(first,last);
	String testsubstring2 = teststring.substring(first);
	System.out.println("sottostringa1: " + testsubstring1);
	System.out.println("sottostringa2: " + testsubstring2);


	//*********** la stringa vuota ****************
	String stringavuota="";
	String stringaspazio= " ";

	System.out.println("Lungh. stringavuota: " + stringavuota.length());
	System.out.println("Lungh. stringaspazio: " + stringaspazio.length());


	//************* convertire stringhe in numeri ************

	String stringanumerica = "Stringa 122 di test 1.34";

	first = 8; //provare a cambiare i valori di first e last. Si generano
	last = 11; //errori? Di che tipo? Perche`?
	// sì, se per esempio inserisco first<8 o first>11 mi genera un errore perchè non sto più raccogliendo solo una stringa
	String stringaint = stringanumerica.substring(first,last);
	int intdastringa = Integer.parseInt(stringaint);
	System.out.println("Intero da stringa: " + intdastringa);

	first = 20; //provare a cambiare i valori di first e last. Si generano
	last = 24; //errori? Di che tipo? Perche`?
	// uguale al caso precedente
	String stringadouble = stringanumerica.substring(first,last);
	double doubledastringa = Double.parseDouble(stringadouble);
	System.out.println("Double da stringa: " + doubledastringa);


	//************* convertire numeri in stringhe ***************

	int unintero = 122;
	double undouble = 1.34;

	String stringadaint = Integer.toString(unintero);
	System.out.print("Stringadaint: ");
	System.out.println(stringadaint);

	String stringadadouble = Double.toString(undouble);
	System.out.print("Stringadadouble: ");
	System.out.println(stringadadouble);

	//Le variabili sommastringhe e sommanumeri contengono cose diverse.
	//Perche`? Cosa significa l'operatore "+" nei due casi? 
	// nel primo caso si uniscono le due stringhe 122 + 1.34 = 1221.34
	// nel secondo caso si effettua la somma tra i due numeri 122 + 1.34 = 123.34
	String sommastringhe = stringadaint + stringadadouble;
	double sommanumeri   = unintero     + undouble;
	System.out.print("Sommastringhe: ");
	System.out.println(sommastringhe);
	System.out.print("Sommanumeri: "); 
	System.out.println(sommanumeri);
 
	/*
	 */
   }

}

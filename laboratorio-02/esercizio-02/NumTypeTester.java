/*
Esempi di arrotondamenti e conversioni tra tipi numerici
*/

public class NumTypeTester
{
    public static void main(String[] args)
    {

	System.out.println(
        "\n************ overflow in somme di int *********************");

	int verylargeint = 2100000000; // se verylargeint ha un valore vicino a
	                               // 2^31 (ovvero 2147500000) la somma
	                               // verylargeint+verylargeint produce un 
                                       // risultato inaspettato. Perche`?.
                                       // il risultato è negativo perchè avviene il trabocco: il risultato supera i limiti di rappresentazione con i bit disponibil
	System.out.println("verylargeint: " + verylargeint);

	verylargeint = verylargeint + verylargeint;
	System.out.println("verylargeint + verylargeint: " + verylargeint);




	System.out.println(
       "\n************ conversione da double a int ********************");

	double smalldouble =1.93;

	System.out.println("smalldouble: " + smalldouble);

	// int smallint = smalldouble; //cosi` non funziona (provare). Perche`?
	// non funziona perchè una variabile può contenere soltanto valori del suo stesso tipo
	int smallint = (int) smalldouble; //cosi` si tronca la parte decimale 
	System.out.println("smallint con cast: " + smallint);

	// smallint = Math.round(smalldouble); //cosi` non funziona (provare).
	                                       // Perche`?
	                                       // per lo stesso motivo spiegato precendentemente
	smallint = (int) Math.round(smalldouble); //Cosi` si approssima all'int
                                                  //piu` vicino. Notare che
                                                  //Math.round applicato ad un
	                                          //numero double restituisce 
                                                  //un numero in formato long
	System.out.println("smallint con Math.round e cast: " + smallint);



	System.out.println(
       "\n************ conversione da double a long ********************");

	double largedouble =3e9;
	System.out.println("largedouble: " + largedouble);

	int largeint = (int) largedouble; // se largedouble e` piu` grande di
	                                  // 2^31 (ovvero di 2.1475e9) il cast
	                                  // produce un risultato inaspettato.
                                          // Perche`?
                                          // perchè si è vicini al limite degli interi, causando un trabocco e dando un valore inaspettato
	System.out.println("largeint con cast: " + largeint);

	long largelong = (long) largedouble; // in questo caso il cast funziona
                                             // (e tronca alla parte intera).
                                             // Perche`?
                                             // perchè il valore di "largedouble" non supera i limiti di un long (a differenza di prima con l'intero)
	System.out.println("largelong con cast: " + largelong);

	largelong = Math.round(largedouble); // non e` necessario effettuare
                                             // il cast a long. Perche`?
                                             // non è necessario effettuare il cast a long perché il risultato di "Math.round(largedouble)" è già un valore long.
	System.out.println("largelong con cast: " + largelong);




	System.out.println(
       "\n*********** errori di arrotondamento in numeri double *********");

	double periodicdouble = 4.35; // 4.35 ha una rappresentazione periodica
                                      // in base 2 (provare per credere)
	System.out.println("periodicdouble: " + periodicdouble);
	//l'approssimazione introdotta dalla rappresentazione periodica diventa
	//evidente se moltiplico questo numero per cento volte
	System.out.print("100*periodicdouble: ");
	System.out.println(100*periodicdouble);
	//ancora peggio: se converto in formato int il numero double 100*4.35
	//ottengo il numero intero 434 invece che 435!
	int periodicint = (int) (100*periodicdouble);//ci vogliono le par.tonde
	System.out.println("(int) (100*periodicdouble): " + periodicint);



	System.out.println(
        "\n*********** operazioni tra double \"molto grandi\" **************");

	double verylargedouble1 = 1e15;
	double verylargedouble2 = verylargedouble1 +1;
	double result = verylargedouble2-verylargedouble1;
 	System.out.println("verylargedouble1: " + verylargedouble1);
	System.out.println("verylargedouble2: " + verylargedouble2);
	System.out.println("verylargedouble2-verylargedouble1: " + result);
	//Provare con verylargedouble1 piu` grande di 1e16. In questo caso
	//succede che result vale 0 invece che 1. Come e` possibile??
	// la sua rappresentazione binaria approssimata può non essere precisa, il che può causare un errore nella sottrazione


	System.out.println(
        "\n*********** overflow con double \"molto molto grandi\" **********");

	double veryverylargedouble1 = 1e308;
	double veryverylargedouble2 = veryverylargedouble1 * 2;
 	System.out.println("veryverylargedouble1: " + veryverylargedouble1);
	System.out.println("veryverylargedouble * 2: " + veryverylargedouble2);

	//Provare con veryverylargedouble1 = 1e308. Cosa succede e perche'?
	// si verifica un errore di overflow per "veryverylargedouble2", poiché la sua dimensione supera il massimo valore rappresentabile dalla rappresentazione a virgola mobile. In questo caso, "veryverylargedouble2" viene impostato sul valore speciale "Infinity"
	//Poi provare con veryverylargedouble1 = 2e308. Cosa succede e perche'?
	// si verifica un errore di compilazione perchè veryverylargedouble1 = 2e308 supera il massimo valore rappresentabile dalla rappresentazione a virgola mobile



	/*
	 */
    }

}

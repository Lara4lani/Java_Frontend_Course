
public class Esercizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab eserc;
		eserc = new Lab();
		
		//eserc.contatoreVerticale();
		//eserc.contatoreOrizzontale();
		//eserc.contaPari();
		//int num1=eserc.leggiNumero();
		//int num2=eserc.leggiNumero();
        //eserc.somma(num1, num2);
		
	    boolean flag = true;
	    
	    do
	    {
	    	int scelta=eserc.menu();
	    	switch(scelta)
			{
			case 1: eserc.contatoreVerticale(); 
			break;
			case 2: eserc.contatoreOrizzontale();	
			break;
			case 3: eserc.contaPari();	
			break;
			case 4: eserc.somma(eserc.leggiNumero("scegli un numero"),eserc.leggiNumero("scegli un altro numero"));	
			break;
			        //versione con piu passaggi
				   	/*int num1=eserc.leggiNumero("scegli un numero");
			        int num2=eserc.leggiNumero("scegli un altro numero");
				    eserc.somma(num1, num2);
					IL METODO eserc.leggiNumero(String s) RAPPRESENTA UNA STAMPA DI STRINGA + UN INPUT*/
			case 5: eserc.totalizzatore();
			break;
			case 6: eserc.semaforo(eserc.leggiStringa("scegli un colore tra verde, giallo e rosso."));
			break;
			case 7: eserc.minMax();
			break;
			case 8: eserc.array();
			break;
			case 9: eserc.menuVet();
			break;
			case 10:String sceltaNome = eserc.leggiStringa("Scegli il nome da cercare");
				  	int occorrenza = eserc.trovaNome( eserc.inizVetString(eserc.leggiNumero("Scegli quanti nomi vuoi inserire")), sceltaNome);
					eserc.stampaInfo("Il nominativo " + sceltaNome + " e' stato trovato "+ occorrenza + " volte.");
			break;
			case 11:eserc.contaConsVoc(eserc.leggiStringa("scrivi una frase").replaceAll("\\s","")); // \\s significa carattere vuoto, "" dice di eliminarlo
			break;
			case 12:eserc.palindromo(eserc.leggiStringa("scegli una parola"));
			break;
			case 0: System.out.println("ARRIVEDERCI");
			 		flag = false;
			 break;
			}
	    }while(flag);
	  
		
	}

}

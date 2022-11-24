package VIEW.LinkedList;


import java.util.LinkedList;
import java.util.Scanner;

import MODEL.LinkedList.Persona;



public class View 
{

	private Scanner input=new Scanner(System.in);

	
	public String leggiStringa(String s)
	{
		System.out.println(s);
		return input.nextLine();

	}

	
	

	public int leggiNumero(String s)
	{
		int num=0;
		boolean flag;
		do
		{
			flag= false;
			System.out.println(s);
			try 
			{
				num= Integer.parseInt(input.nextLine());
			} 
			catch (NumberFormatException e)
			{
				//System.out.println(e);
				System.out.println("non hai inserito un numero");
				flag=true;
			}
		}while(flag);

		return num;
		
	}
	
	

	//metodo per far scegliere a utente le info di persona
	public void mascheraInserimento(Persona p)
	{
		p.setNome(leggiStringa("Inserisci il nome:"));
		p.setCognome(leggiStringa("Inserisci il cognome:"));
		p.setEta(leggiNumero("Inserisci l'eta':"));
		p.setCf(leggiStringa("Inserisci il codice fiscale:"));
	}
	
	public Persona mascheraModifica(Persona pold, Persona pnew)
	{
		String nome = leggiStringa("nome[" + pold.getNome()+ "]:");
		if (!nome.isEmpty()) //isEmpty metodo string, significa che l'input e' invio
		{
			pnew.setNome(nome);
		}
		else
		{
			pnew.setNome(pold.getNome());
		}
		
		String cognome = leggiStringa("cognome[" + pold.getCognome()+ "]:");
		if (!cognome.isEmpty())
		{
			pnew.setCognome(cognome);
		}
		else
		{
			pnew.setCognome(pold.getCognome());
		}
		
		String eta = leggiStringa("eta'[" + pold.getEta()+ "]:");
		if (!eta.isEmpty())
		{
			pnew.setEta(Integer.parseInt(eta));
		}
		else
		{
			pnew.setEta(pold.getEta());
		}
		
		String cf = leggiStringa("codice fiscale[" + pold.getCf()+ "]:");
		if (!cf.isEmpty())
		{
			pnew.setCf(cf);
		}
		else
		{
			pnew.setCf(pold.getCf());
		}
		
		
		if(leggiStringa("sei sicuro di voler apportare le modifiche?").equalsIgnoreCase("si"))
		{
			return pnew;
		}
		return pold;
	}
	
	
	
	//metodo per stampare le info di persona
	public void stampaPersona(Persona p)
	{
		System.out.println(p);  
		/*System.out.println("nome: "+p.getNome());
		System.out.println("cognome: "+p.getCognome());
		System.out.println("eta': "+p.getEta());
		System.out.println("codice fiscale: "+p.getCf());*/
		
	}
	
	
	
	
	//metodo per far stampare array 
	public void stampaPersona(LinkedList<Persona> linked)
	{
		//per ogni persona p all'interno di array verra' stampato il menu sotto
		for (Persona p : linked) 
		{
			System.out.println(p);  
		}	
	}
	
	
	
	public void stampaStringa(String s)
	{
		System.out.println(s);
	}
	
	
	
	public void stampaSpazio()
	{
		System.out.println("\n");
	}
	
	
	
	public  int stampaMenu()
	{
		System.out.println("***GESTIONE PERSONA***");
		System.out.println("1. Inserisci");
		System.out.println("2. Ricerca");
		System.out.println("3. Elimina");
		System.out.println("4. Modifica");
		System.out.println("5. Stampa");
		System.out.println("0. ESCI");
		return leggiNumero("Sceli l'operazione da eseguire");
	}
	
	
	
	public void stampaUscita()
	{
		System.out.println("ARRIVEDERCI");
	}

}
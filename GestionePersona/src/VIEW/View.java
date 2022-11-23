package VIEW;

import java.util.ArrayList;
import java.util.Scanner;

import MODEL.Persona;

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
	
	public void mascheraModifica(Persona pold, Persona pnew)
	{
		String nome = leggiStringa("nome[" + pold.getNome()+ "]:");
		if (!nome.isEmpty())
		{
			pnew.setNome(nome);
		}
		else
		{
			pnew.setNome(pold.getNome());
		}
		
	}
	
	
	
	//metodo per stampare le info di persona
	public void stampaPersona(Persona p)
	{
		//System.out.println(p);  NO!
		System.out.println("nome: "+p.getNome());
		System.out.println("cognome: "+p.getCognome());
		System.out.println("eta': "+p.getEta());
		System.out.println("codice fiscale: "+p.getCf());
		System.out.println("\n");
		
	}
	
	
	
	
	//metodo per far stampare array 
	public void stampaPersona(ArrayList<Persona> array)
	{
		//per ogni persona p all'interno di array verra' stampato il menu sotto
		for (Persona p : array) 
		{
			System.out.println("nome: "+p.getNome());
			System.out.println("cognome:" +p.getCognome());
			System.out.println("eta': "+p.getEta());
			System.out.println("codice fiscale: "+p.getCf());
			System.out.println("\n");
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
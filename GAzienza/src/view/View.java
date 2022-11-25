package view;

import java.util.Collection;
import java.util.Scanner;

import model.Persona;

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

	public void macheraInserimento(Persona p)
	{
		p.setNome(leggiStringa("inserisci il nome"));
		p.setCognome(leggiStringa("inserisci il cosgnome"));
		p.setEta(leggiNumero("inserisci l'eta'"));
		p.setCf(leggiStringa("inserisci il codice fiscale"));	
	}
	
	public void stampaPersona(Persona p)
	{
		System.out.println(p);
	}
	
	public void stampaDatabase(Collection<Persona> database)
	{
		for(Persona p : database)
			System.out.println(p);
	}
	
}
	

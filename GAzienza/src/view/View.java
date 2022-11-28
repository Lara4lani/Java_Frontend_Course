package view;

import java.util.Collection;
import java.util.Scanner;

import model.Dipendente;
import model.Manager;
import model.Persona;

public class View {


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
	
	public Double leggiDouble(String s)
	{
		Double num=0.0;
		boolean flag;
		do
		{
			flag= false;
			System.out.println(s);
			try 
			{
				num= Double.parseDouble(input.nextLine());
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
	
	public void stampaUscita()
	{
		System.out.println("ARRIVEDERCI");
	}
	
	public int stampaMenu()
	{
		System.out.println("***GESTIONE AZIENDA***");
		System.out.println("1. Inserisci");
		System.out.println("2. Ricerca");
		System.out.println("3. Elimina");
		System.out.println("4. Modifica");
		System.out.println("5. Stampa");
		System.out.println("0. ESCI");
		return leggiNumero("Scegli l'operazione da eseguire");
	}
	
	public void mascheraInserimento(Persona p)
	{
		if(p instanceof Manager)
		{
			p.setNome(leggiStringa("Inserisci il nome"));
			p.setCognome(leggiStringa("Inserisci il cognome"));
			p.setEta(leggiNumero("Inserisci l'eta'"));
			p.setCf(leggiStringa("Inserisci il codice fiscale"));
			Dipendente d = (Dipendente) p;
			d.setStipendio(leggiDouble("Inserisci lo stipendio"));
			Manager m = (Manager) p;
			m.setRuolo(leggiStringa("Inserisci il ruolo"));
		}
		else if(p instanceof Dipendente)
		{
			p.setNome(leggiStringa("Inserisci il nome"));
			p.setCognome(leggiStringa("Inserisci il cognome"));
			p.setEta(leggiNumero("Inserisci l'eta'"));
			p.setCf(leggiStringa("Inserisci il codice fiscale"));
			Dipendente d = (Dipendente) p;
			d.setStipendio(leggiDouble("Inserisci lo stipendio"));
		}
	}
	
	public void stampa(Persona p)
	{
		System.out.println(p);
	}
	
	public void stampa(Collection<Persona> hmap)
	{
		for(Persona p : hmap)
			System.out.println(p);
	}
}

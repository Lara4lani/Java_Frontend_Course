package view;

import java.util.Collection;
import java.util.HashMap;
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
	
	public void mascheraInserimento(Dipendente d)
	{
		if(d instanceof Manager)
		{
			d.setNome(leggiStringa("Inserisci il nome"));
			d.setCognome(leggiStringa("Inserisci il cognome"));
			d.setEta(leggiNumero("Inserisci l'eta'"));
			d.setCf(leggiStringa("Inserisci il codice fiscale"));
			d.setStipendio(leggiDouble("Inserisci lo stipendio"));
			//cast breve per poter vedere i metodi del "figlio"
			((Manager)d).setRuolo(leggiStringa("Inserisci il ruolo")); 
		}
		else
		{
			d.setNome(leggiStringa("Inserisci il nome"));
			d.setCognome(leggiStringa("Inserisci il cognome"));
			d.setEta(leggiNumero("Inserisci l'eta'"));
			d.setCf(leggiStringa("Inserisci il codice fiscale"));
			d.setStipendio(leggiDouble("Inserisci lo stipendio"));
		}
	}
	
	public Dipendente mascheraModifica(Dipendente dold, Dipendente dnew)
	{
		
		if (dold instanceof Manager) 
		{
			String nome = leggiStringa("nome ["+dold.getNome()+"]");
			if(!nome.isEmpty())
				dnew.setNome(nome);
			else
				dold.setNome(dold.getCognome());

			String cognome = leggiStringa("cognome ["+dold.getCognome()+"]");
			if(!cognome.isEmpty())
				dnew.setCognome(cognome);
			else
				dold.setCognome(dold.getCognome());
			
			String eta = leggiStringa("eta' ["+dold.getEta()+"]");
			if(!eta.isEmpty())
				dnew.setEta(Integer.parseInt(eta));
			else
				dold.setEta(dold.getEta());
			
			String cf = leggiStringa("codice fiscale ["+dold.getCf()+"]");
			if(!cf.isEmpty())
				dnew.setCf(cf);
			else
				dold.setCf(dold.getCf());
			 
			String stipendio = leggiStringa("stipendio ["+dold.getStipendio()+"]");
			if(!stipendio.isEmpty())
				dnew.setStipendio(Double.parseDouble(stipendio));
			else
				dold.setStipendio(dold.getStipendio());
			
			String ruolo = leggiStringa("ruolo ["+((Manager)dold).getRuolo()+"]");
			if(!ruolo.isEmpty())
				((Manager)dnew).setRuolo(ruolo);
			else
				((Manager)dold).setRuolo(((Manager)dold).getRuolo());
		}
		else
		{
			String nome = leggiStringa("nome ["+dold.getNome()+"]");
			if(!nome.isEmpty())
				dnew.setNome(nome);
			else
				dold.setNome(dold.getCognome());

			String cognome = leggiStringa("cognome ["+dold.getCognome()+"]");
			if(!cognome.isEmpty())
				dnew.setCognome(cognome);
			else
				dold.setCognome(dold.getCognome());
			
			String eta = leggiStringa("eta' ["+dold.getEta()+"]");
			if(!eta.isEmpty())
				dnew.setEta(Integer.parseInt(eta));
			else
				dold.setEta(dold.getEta());
			
			String cf = leggiStringa("codice fiscale ["+dold.getCf()+"]");
			if(!cf.isEmpty())
				dnew.setCf(cf);
			else
				dold.setCf(dold.getCf());
			 
			String stipendio = leggiStringa("stipendio ["+dold.getStipendio()+"]");
			if(!stipendio.isEmpty())
				dnew.setStipendio(Double.parseDouble(stipendio));
			else
				dold.setStipendio(dold.getStipendio());
		}
		
		if(leggiStringa("Confermi le modifiche?").equalsIgnoreCase("si"))
		{
			return dnew;
		}
		else
			stampaStringa("Nessuna modifica e' stata apportata");
			return dold;	
	}
	
	public void stampaDipendente(Dipendente d)
	{
		System.out.println(d);
	}
	
	public void stampaDipendente(HashMap<Integer, Dipendente> hmap)
	{
		for(Dipendente d : hmap.values())
			System.out.println(d);
	}
}

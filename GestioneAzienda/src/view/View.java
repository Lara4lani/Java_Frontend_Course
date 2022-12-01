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
		System.out.println("6. Promuovi");
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

		String nome = leggiStringa("nome ["+dold.getNome()+"]");
		if(!nome.isEmpty())
			dnew.setNome(nome);
		else
			dnew.setNome(dold.getCognome());

		String cognome = leggiStringa("cognome ["+dold.getCognome()+"]");
		if(!cognome.isEmpty())
			dnew.setCognome(cognome);
		else
			dnew.setCognome(dold.getCognome());

		String eta = leggiStringa("eta' ["+dold.getEta()+"]");
		if(!eta.isEmpty())
			dnew.setEta(Integer.parseInt(eta));
		else
			dnew.setEta(dold.getEta());

		String cf = leggiStringa("codice fiscale ["+dold.getCf()+"]");
		if(!cf.isEmpty())
			dnew.setCf(cf);
		else
			dnew.setCf(dold.getCf());

		String stipendio = leggiStringa("stipendio ["+dold.getStipendio()+"]");
		if(!stipendio.isEmpty())
			dnew.setStipendio(Double.parseDouble(stipendio));
		else
			dnew.setStipendio(dold.getStipendio());

		if (dold instanceof Manager) 
		{
			String ruolo = leggiStringa("ruolo ["+((Manager)dold).getRuolo()+"]");
			if(!ruolo.isEmpty())
				((Manager)dnew).setRuolo(ruolo);
			else
				((Manager)dnew).setRuolo(((Manager)dold).getRuolo());
		}
		System.out.println(dnew);

		if(leggiStringa("Confermi le modifiche?").equalsIgnoreCase("si"))
			return dnew;
		return dold;
	}

	public Dipendente mascheraPromozione(Dipendente d, Manager m)
	{
		if(m instanceof Manager)
		{
			m.setNome(d.getCognome());
			m.setCognome(d.getCognome());
			m.setEta(d.getEta());
			m.setCf(d.getCf());
			String stipendio = leggiStringa("stipendio ["+m.getStipendio()+"]");
				m.setStipendio(Double.parseDouble(stipendio));
			
			String ruolo = leggiStringa("ruolo ["+((Manager)m).getRuolo()+"]");
			((Manager)m).setRuolo(ruolo);
		}
		return m;
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

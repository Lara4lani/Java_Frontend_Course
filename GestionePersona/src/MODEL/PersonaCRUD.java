package MODEL;

import java.util.ArrayList;

import VIEW.View;

import MODEL.Persona;



public class PersonaCRUD 
{

	//creiamo arraylist
	private ArrayList<Persona> array=new ArrayList<Persona>();
	View view = new View();
	Persona p = new Persona();

	//CRUD


	public void inserimentoPersona(Persona p)
	{
		array.add(p); //metoodo per inserire la persona creata dentro l'array

		//array.indexOf(p) ritorna l'indice dove l'oggetto � posizionato nell'ArrayList 
		//array.remove(p) elimina l'oggetto presente nell'ArrayList
		//array.get(0) ritorna l'oggetto in quella specifica posizione (0)
		//array.set(0, p) modifica l'oggetto in quella specifica posizione sostituendolo con il nuovo (secondo parametro)	
	}

	public void ricercaPersona()
	{
		String cf=view.leggiStringa("inserisci il codice fiscale da ricercare");
		Persona findp =null;
		for (Persona p : array) 
		{
			if(p.getCf().equalsIgnoreCase(cf))
			{
				findp = p;
			}
		}	
		if(findp!=null)
		{
			view.stampaPersona(findp);
		}
		else
		{
			view.stampaStringa("la persona inserita non e' presente nell'elenco");
		}
	}

	public void eliminaPersona()
	{
		String cf=view.leggiStringa("inserisci il codice fiscale da ricercare");
		Persona findp =null;
		for (Persona p : array) 
		{
			if(p.getCf().equalsIgnoreCase(cf))
			{
				findp = p;
			}
		}	
		if(findp!=null)
		{
			view.stampaPersona(findp);
			String scelta = view.leggiStringa("vuoi davvero eliminare questa persona dall'elenco?");
			if(scelta.equalsIgnoreCase("si"))
			{
				array.remove(findp);
				view.stampaStringa("la persona selezionata e' stata rimossa dall'elenco");
			}
			else
			{
				view.stampaStringa("nessuna persona e' stata eliminata dall'elenco");
			}
		}
		else
		{
			view.stampaStringa("la persona inserita non e' presente nell'elenco");
		}
	}


	//metodo per ritornare l'array con all'interno le persone e poterlo stampare
	public ArrayList<Persona> getArray()
	{
		return array;
	}




}
package MODEL.HashSet;

import java.util.HashSet;

public class PersonaCRUD 
{

	//creiamo arraylist
	private HashSet<Persona> hset = new HashSet<Persona>();

	//CRUD


	public void inserimentoPersona(Persona p)
	{
		hset.add(p); //metoodo per inserire la persona creata dentro l'array

		//array.indexOf(p) ritorna l'indice dove l'oggetto � posizionato nell'ArrayList 
		//array.remove(p) elimina l'oggetto presente nell'ArrayList
		//array.get(0) ritorna l'oggetto in quella specifica posizione (0)
		//array.set(0, p) modifica l'oggetto in quella specifica posizione sostituendolo con il nuovo (secondo parametro)	
	}
	
	

	public Persona ricercaPersona(String cf)
	{
		Persona findp =null;
		for (Persona p : hset) 
		{
			if(cf.equalsIgnoreCase(p.getCf()))
			{
				findp = p;
			}
		}	
		
		return findp;
	}

	
	
	public void eliminaPersona(Persona findp)
	{
		hset.remove(findp);	
	}
	
	
	
	public void modificaPersona(Persona findp, Persona modp)
	{
		hset.remove(findp);
		hset.add(modp);
	}


	//metodo per ritornare l'array con all'interno le persone e poterlo stampare
	public HashSet<Persona> getHSet()
	{
		return hset;
	}




}
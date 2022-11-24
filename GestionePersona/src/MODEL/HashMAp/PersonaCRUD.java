package MODEL.HashMAp;

import java.util.HashMap;

public class PersonaCRUD 
{

	//creiamo arraylist
	
	private HashMap<String, Persona> hmap= new HashMap<String, Persona>();
	//CRUD


	public void inserimentoPersona(String s, Persona p)
	{
		hmap.put(s, p);
	}
	
	

	public Persona ricercaPersona(String cf)
	{
		Persona findp =null;
		for (Persona p : hmap.values()) 
		{
			if(p.getCf().equalsIgnoreCase(cf))
			{
				findp = p;
			}
		}	
		
		return findp;
	}

	
	
	public void eliminaPersona(String s,Persona findp)
	{
		hmap.remove(s, findp);	
	}
	
	
	
	public void modificaPersona(String s,Persona findp, Persona modp)
	{
		hmap.put(s, modp);
		hmap.remove(s, findp);
	}


	//metodo per ritornare l'array con all'interno le persone e poterlo stampare
	public HashMap<String, Persona> getHashMap()
	{
		return hmap;
	}




}
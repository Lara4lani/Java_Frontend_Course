package model;

import java.util.Collection;
import java.util.HashMap;

public class PersonaCRUD {

	HashMap<Integer, Persona> databasePersone = new HashMap<Integer, Persona>();
	
	public void inserimentoPersona(Persona p)
	{
		Integer key = databasePersone.size();
		databasePersone.put(key, p);
	}
	
	public Collection<Persona> getValori()
	{
		return databasePersone.values();
	}
	
	public Persona cercaPersona(String cf)
	{
		Persona findp =null;
		for(Persona p : getValori())
			if(p.getCf().equalsIgnoreCase(cf))
				findp=p;
		return findp;
	}
	
}

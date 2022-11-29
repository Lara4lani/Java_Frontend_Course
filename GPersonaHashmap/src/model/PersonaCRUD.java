package model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

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

	public void eliminaPersona(Persona p)
	{
		//va a verificare se il valore successivo e' uguale a d
		//soluzione per il fatto che nn eliminava mai il primo elemento di hashmap
		Iterator<Entry<Integer, Persona>> iterator = databasePersone.entrySet().iterator();
		while(iterator.hasNext())
		{
			if(iterator.next().getValue().equals(p))
				iterator.remove();
		}
	}

	public void modificaPersona(Persona findp, Persona mod)
	{
		for(Integer key1 : databasePersone.keySet())
			if(databasePersone.get(key1).equals(findp))
				databasePersone.replace(key1, findp, mod);
	}

}

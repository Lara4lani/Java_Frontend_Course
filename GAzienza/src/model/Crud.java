package model;

import java.util.Collection;
import java.util.HashMap;

import util.Icrud;

public class Crud implements Icrud{

	HashMap <Integer, Persona> hmap = new HashMap<Integer, Persona>();
	
	@Override
	public void inserisci(Persona p)
	{
		Integer key = hmap.size()+1;
		hmap.put(key, p);
	}	
	
	@Override
	public Collection<Persona> getValues()
	{
		return hmap.values();
	}
	
}

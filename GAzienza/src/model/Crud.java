package model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import util.Icrud;

public class Crud implements Icrud{

	private HashMap <Integer, Dipendente> hmap =  new HashMap<Integer, Dipendente>();
	int key = 0;
	
	//sovrascrivo i metodi astratti creati nell'interfaccia
	public void inserisci(Dipendente d)
	{
		key++; //chiave che aumenta di 1 ad ogni inserimento
		hmap.put(key, d);
	}	
	
	public Dipendente cerca(String cf)
	{
		Dipendente dfind = null;
		for(Dipendente d : hmap.values())
			if(d.getCf().equalsIgnoreCase(cf))
				dfind = d;
		
		return dfind;
	}
	
	public void elimina(Dipendente d)
	{
		//va a verificare se il valore successivo e' uguale a d
		//soluzione per il fatto che nn eliminava mai il primo elemento di hashmap
		//entry=abbinamento chiave-valore
		Iterator<Entry<Integer, Dipendente>>iterator = hmap.entrySet().iterator();
		while(iterator.hasNext())
		{
			if(iterator.next().getValue().equals(d))
				iterator.remove();
		}
	}
	
	public void modifica(Dipendente dold, Dipendente dnew)
	{
		for(Integer k : hmap.keySet())
			if(hmap.get(k).equals(dold))
				hmap.replace(k, dold, dnew);
	}
	
	public HashMap<Integer, Dipendente> getMap()
	{
		return hmap;
	}
	
}

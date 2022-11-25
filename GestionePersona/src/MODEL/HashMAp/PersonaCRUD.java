package MODEL.HashMAp;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonaCRUD 
{
//creo collection hashmap
//metto map perche tanto essendo piu  generico va bene lo stesso
private Map<Integer,Persona> dataBasePersone = new HashMap<Integer,Persona>();
	
	public void inserimentoPersona(Persona p)
	{
		//integer n sarebbe la chiave 
		Integer n = dataBasePersone.size()+1; // ritorna il numero tot di chiavi presenti nella map
		dataBasePersone.put(n, p); //put inserisce la chiave n associata al valore p dentro la map
	}
	
	
	//questo perche hashmap e' una struttura di key+value quindi per
	//avere solo i valori dobbiamo usare un metodo di tipo collection (ha dentro solo values)
	public Collection<Persona> getValori()
	{
		return dataBasePersone.values();//ritorna solo i valori del hashmap
	}
	
	public Persona ricercaPersona(String cf)
	{
		Persona personaCercata = null;
		for(Persona p: getValori())
			if(p.getCf().equals(cf))
				personaCercata = p;
		return personaCercata;
	}
	
	
	//Con questo metodo scorro con un for each tutti gli abbinamenti tra chiave e valori dell'HashMap
	// per trovare la chiave associata al valore da eliminare.
	//Trovata la chiave la posso usare per rimuovare il valore
	public void eliminaPersona(Persona p)
	{
		for(Integer key: dataBasePersone.keySet()) //va a controllare ogni chiave presente nel set di chiavi	
			if(dataBasePersone.get(key).equals(p))//get key ritorna il valore della chiave 
				dataBasePersone.remove(p);
	}
	
	public void rimpiazzaPersona(Persona pModificata, Persona p1)
	{
		for(Integer key1: dataBasePersone.keySet())
			if(dataBasePersone.get(key1).equals(p1))
				dataBasePersone.replace(key1, pModificata, p1);
	}

//	public void sostiusciPersona(Persona pModificata, Persona p1)
//	{		
//		p1.setNome(pModificata.getNome());		
//		p1.setCognome(pModificata.getCognome());	
//		p1.setCf(pModificata.getCf());	
//		p1.setEta(pModificata.getEta());
//	}
	

	
//	public void rimuoviPersona(Persona p)
//	{
//		Integer key = null;
//		for(Entry<Integer, Persona> entry:dataBasePersone.entrySet())
//		{
//			if(p.equals(entry.getValue()))
//				key = entry.getKey();
//		}
//		dataBasePersone.remove(key, p);
//		
//	}
}
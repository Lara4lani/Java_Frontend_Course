package util;

import java.util.Collection;

import model.Persona;

public interface Icrud {

	//creo i metodi che verranno sovrascritti nel crud
	public void inserisci(Persona p);
	public Collection<Persona> getValues();
	//public void cerca();
	//public void elimina();
	//public void modifica();	
}

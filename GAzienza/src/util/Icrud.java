package util;


import java.util.HashMap;

import model.Dipendente;


public interface Icrud { //le variabili dichiarate qui sono tutte costanti (final) di default

	//creo i metodi che verranno sovrascritti nel crud
	public void inserisci(Dipendente d);
	public HashMap<Integer, Dipendente> getMap();
	public Dipendente cerca(String cf);
	public void elimina(Dipendente d);
	public void modifica(Dipendente dold, Dipendente dnew);
}

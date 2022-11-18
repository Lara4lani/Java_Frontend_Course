package MODEL;

import java.util.ArrayList;

public class PersonaCRUD 
{

	//creiamo arraylist
	private ArrayList<Persona> array=new ArrayList<Persona>();
    
	//CRUD
	
	
	public void inserimentoPersona(Persona p)
	{
		array.add(p); //metoodo per inserire la persona creata dentro l'array
		
		//array.indexOf(p) ritorna l'indice dove l'oggetto � posizionato nell'ArrayList 
	    //array.remove(p) elimina l'oggetto presente nell'ArrayList
		//array.get(0) ritorna l'oggetto in quella specifica posizione (0)
		//array.set(0, p) modifica l'oggetto in quella specifica posizione sostituendolo con il nuovo (secondo parametro)
		
		
	}
	
	
	
	//metodo per ritornare l'array con all'interno le persone e poterlo stampare
	public ArrayList<Persona> getArray()
	{
		return array;
	}
	
	
	
	
}
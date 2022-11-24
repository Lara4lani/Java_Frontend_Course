package MODEL.LinkedList;

import java.util.LinkedList;



public class PersonaCRUD 
{

	LinkedList <Persona> linked = new LinkedList();

	//CRUD


	public void inserimentoPersona(Persona p)
	{
		linked.add(p);
	}
	
	

	public Persona ricercaPersona(String cf)
	{
		Persona findp =null;
		for (Persona p : linked) 
		{
			if(p.getCf().equalsIgnoreCase(cf))
			{
				findp = p;
			}
		}	
		
		return findp;
	}

	
	
	public void eliminaPersona(Persona findp)
	{
		linked.remove(findp);	
	}
	
	
	
	public void modificaPersona(Persona findp, Persona modp)
	{
		int index = linked.indexOf(findp);
		linked.set(index, modp);
	}


	//metodo per ritornare l'array con all'interno le persone e poterlo stampare
	public LinkedList<Persona> getLinked()
	{
		return linked;
	}




}
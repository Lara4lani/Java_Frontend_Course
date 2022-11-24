package MODEL.HashMAp;





public class PersonaCRUD 
{

	//creiamo arraylist
	
	HashMap<int, Persona> hmap= new HashMap<int, persona>();
	//CRUD


	public void inserimentoPersona(Persona p)
	{
			
	}
	
	

	public Persona ricercaPersona(String cf)
	{
		Persona findp =null;
		for (Persona p : array) 
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
		array.remove(findp);	
	}
	
	
	
	public void modificaPersona(Persona findp, Persona modp)
	{
		int index = array.indexOf(findp);
		array.set(index, modp);
	}


	//metodo per ritornare l'array con all'interno le persone e poterlo stampare
	public ArrayList<Persona> getArray()
	{
		return array;
	}




}
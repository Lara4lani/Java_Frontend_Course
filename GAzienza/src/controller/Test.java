package controller;

import model.Persona;
import model.PersonaCRUD;
import view.View;

public class Test {

	public static void main(String[] args) 
	{

		View view=new View();
		PersonaCRUD crud=new PersonaCRUD();
		boolean flag = true;
		Persona findp=null;


		do
		{
			Persona p =new Persona();
			switch(view.stampaMenu())
			{
			case 1:
				view.macheraInserimento(p);
				crud.inserimentoPersona(p);
				break;
			case 2:
				findp=crud.cercaPersona(view.leggiStringa("inserisci il codice fiscale da ricercare"));
				if(findp!=null)
					view.stampaPersona(p);
				else
					view.stampaStringa("La persona cercata non e' presente nell'elenco");
				break;
			case 3: 
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				view.stampaUscita();
				flag = false;
				break;
			}
		}while(flag);


		//view.stampaPersona(p);





	}
}

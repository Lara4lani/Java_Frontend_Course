package CONTROLLER;

import java.util.ArrayList;

import MODEL.Persona;
import MODEL.PersonaCRUD;
import VIEW.View;

public class Test {

	public static void main(String[] args) 
	{

		View view=new View();
		PersonaCRUD crud=new PersonaCRUD();
		boolean flag = true;
		ArrayList<Persona> array=new ArrayList<Persona>();
		
		

		do
		{
			Persona p =new Persona();
			switch(view.stampaMenu())
			{
			case 1:
				view.mascheraInserimento(p);
				crud.inserimentoPersona(p);
				break;
			case 2:
				crud.ricercaPersona();
				break;
			case 3: 
				crud.eliminaPersona();
				break;
			case 4:
				break;
			case 5:
				view.stampaPersona(crud.getArray());
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
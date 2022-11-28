package controller;

import model.Crud;
import model.Dipendente;
import model.Manager;
import model.Persona;
import view.View;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creo gli oggetti 
		Persona d = new Dipendente();
		Persona m = new Manager();
		View view = new View();
		Crud crud = new Crud();
		Boolean flag = true;
		int profilo;
		
		do
		{
			Persona p = new Persona();
			switch(view.stampaMenu())
			{
			case 1:
				profilo = view.leggiNumero("Specifica il tipo di profilo che vuoi inserire:" + "\n" + "1. Dipendente" + "\n" + "2. Manager");
				if(profilo==1)
				{
					view.mascheraInserimento(d);
					crud.inserisci(d);
					view.stampaStringa("Il profilo e' stato aggiunto");
				}
				else if(profilo==2)
				{
					view.mascheraInserimento(m);
					crud.inserisci(m);
					view.stampaStringa("Il profilo e' stato aggiunto");
				}
				break;
			case 2:
				break;
			case 3: 
				break;
			case 4:
				break;
			case 5:
				view.stampa(crud.getValues());
				break;
			case 0:
				flag = false;
				break;
			}
		}while(flag);
		
	}

}

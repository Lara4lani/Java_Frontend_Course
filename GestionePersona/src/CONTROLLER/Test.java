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
		Persona findp =null;
		String scelta;
		Persona modp = null;
		

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
				String cf = view.leggiStringa("inserisci il codice fiscale da ricercare");
				findp = crud.ricercaPersona(cf);
				if(findp!=null)
				{
					view.stampaPersona(findp);
				}
				else
				{
					view.stampaStringa("la persona inserita non e' presente nell'elenco");
				}
				break;
			case 3: 
				cf = view.leggiStringa("inserisci il codice fiscale da ricercare");
				findp = crud.ricercaPersona(cf);
				if(findp!=null)
				{
					view.stampaPersona(findp);
					scelta = view.leggiStringa("vuoi davvero eliminare questa persona dall'elenco?");
					if(scelta.equalsIgnoreCase("si"))
					{
						crud.eliminaPersona(findp);
						view.stampaStringa("la persona selezionata e' stata rimossa dall'elenco");
					}
					else
					{
						view.stampaStringa("nessuna persona e' stata eliminata dall'elenco");
					}
				}
				else
				{
					view.stampaStringa("la persona inserita non e' presente nell'elenco");
				}
				break;
			case 4:
				cf = view.leggiStringa("inserisci il codice fiscale da modificare");
				findp = crud.ricercaPersona(cf);
				if(findp!=null)
				{
					view.stampaPersona(findp);
					//scelta = view.leggiStringa("vuoi modificare i dati di questa persona?");
					view.mascheraModifica(findp, new Persona());
				}
				else
				{
					view.stampaStringa("la persona inserita non e' presente nell'elenco");
				}
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
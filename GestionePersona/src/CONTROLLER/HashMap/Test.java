package CONTROLLER.HashMap;

import MODEL.HashMAp.Persona;
import MODEL.HashMAp.PersonaCRUD;
import VIEW.HashMap.View;

public class Test {

	public static void main(String[] args) 
	{

		View view=new View();
		PersonaCRUD crud=new PersonaCRUD();
		boolean flag = true;
		Persona findp =null;
		String scelta;
		

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
					Persona pm = view.mascheraModifica(findp, new Persona());
					if(pm.equals(findp))
					{
						view.stampaStringa("la modifica e' stata annullata");
					}
					else
					{
						crud.modificaPersona(findp, pm);
						view.stampaStringa("la modifica e' stata eseguita");
					}
					
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
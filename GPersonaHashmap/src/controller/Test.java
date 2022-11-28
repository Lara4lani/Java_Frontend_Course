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
		String scelta;
		Persona mod = new Persona();


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
					view.stampaPersona(findp);
				else
					view.stampaStringa("La persona cercata non e' presente nell'elenco");
				break;
			case 3: 
				findp=crud.cercaPersona(view.leggiStringa("inserisci il codice fiscale della persona da rimuovere dall'elenco"));
				if(findp!=null)
				{
					view.stampaPersona(findp);
					scelta = view.leggiStringa("vuoi davvero rimuovere questa persona dall'elenco?");
					if(scelta.equalsIgnoreCase("si"))
					{
						crud.eliminaPersona(findp);
						view.stampaStringa("La persona selezionata e' stata rimossa dall'elenco");
					}
					else
					{
						view.stampaStringa("Nessuna persona e' stata rimossa dall'elenco");
					}	
				}
				else
				{
					view.stampaStringa("La persona cercata non e' presente nell'elenco");
				}
				break;
			case 4:
				findp=crud.cercaPersona(view.leggiStringa("inserisci il codice fiscale della persona da modificare"));
				if(findp!=null)
				{
					view.stampaPersona(findp);
					String scelta1 = view.leggiStringa("vuoi modificare i dati di questa persona?");
					if(scelta1.equalsIgnoreCase("si"))
					{
						view.mascheraModifica(findp, mod);
						String scelta2 = view.leggiStringa("confdermi le modifiche?");
						if(scelta2.equalsIgnoreCase("si"))
						{
							crud.modificaPersona(findp, mod);
							view.stampaStringa("i dati della persona selezionata sono stati modificati");
						}
					}
					else
					{
						view.stampaStringa("nessuna persona e' stata modificata");
					}
				}
				else
				{
					view.stampaStringa("La persona cercata non e' presente nell'elenco");
				}	
				break;
			case 5:
				view.stampaDatabase(crud.getValori());
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

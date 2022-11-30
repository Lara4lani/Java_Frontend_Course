package controller;

import model.Crud;
import model.Dipendente;
import model.Manager;
import model.Persona;
import view.View;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanzio gli oggetti 
		View view = new View();
		Crud crud = new Crud();
		Boolean flag = true;
		int profilo;
		Dipendente dfind;


		do
		{
			Dipendente d = new Dipendente();
			Manager m = new Manager();
			switch(view.stampaMenu())
			{
			case 1:
				profilo = view.leggiNumero("Specifica il tipo di profilo che vuoi inserire: \n 1. Dipendente \n 2. Manager");
				if(profilo==1)
				{
					view.mascheraInserimento(d);
					crud.inserisci(d);
					view.stampaStringa("Il profilo dipendente e' stato aggiunto");
					view.stampaDipendente(d);
				}
				else if(profilo==2)
				{
					view.mascheraInserimento(m);
					crud.inserisci(m);
					view.stampaStringa("Il profilo manager e' stato aggiunto");
					view.stampaDipendente(m);
				}
				else
					view.stampaStringa("Scelta non valida");
				break;
			case 2:
				dfind = crud.cerca(view.leggiStringa("Scrivi il codice fiscale della persona da rimuovere dall'elenco"));
				if(dfind!=null)
				{
					view.stampaDipendente(dfind);
				}
				else
					view.stampaStringa("Codice fiscale non valido");
				break;
			case 3: 
				dfind = crud.cerca(view.leggiStringa("Scrivi il codice fiscale della persona da rimuovere dall'elenco"));
				if(dfind!=null)
				{
					view.stampaDipendente(dfind);
					String scelta = view.leggiStringa("Vuoi davvero rimuovere questa persona dall'elenco?");
					if(scelta.equalsIgnoreCase("si"))
					{
						crud.elimina(dfind);
						view.stampaStringa("La peersona selezionata e' stata rimossa dall'elenco");
					}
					else
						view.stampaStringa("Nessuna persona e' stata rimossa dall'elenco");	
				}
				else
					view.stampaStringa("Codice fiscale non valido");
				break;
			case 4:
				dfind = crud.cerca(view.leggiStringa("Scrivi il codice fiscale della persona da modificare"));
				if(dfind!=null)
				{
					view.stampaDipendente(dfind);
					Dipendente dmod;
					if(dfind instanceof Manager)
						dmod = view.mascheraModifica(dfind, new Manager());
					else
						dmod = view.mascheraModifica(dfind, new Dipendente());

					if(!dfind.equals(dmod))
						crud.modifica(dfind, dmod);
					else 
						view.stampaStringa("Nessuna modifica e' stata apportata");
				}
				else
					view.stampaStringa("Codice fiscale non valido");
				break;
			case 5:
				view.stampaDipendente(crud.getMap());
				break;
			case 0:
				flag = false;
				break;
			default :
				view.stampaStringa("Scelta non valida");
				break;
			}
		}while(flag);

	}

}

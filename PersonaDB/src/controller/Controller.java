package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Crud;
import model.Persona;
import view.View;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Crud crud = new Crud();
		View view = new View();
		boolean flag= true;
		ResultSet rs;
		ResultSet rs2 = null;
		String findp=null;
		Persona pnew =new Persona();




		do
		{
			int scelta = view.stampaMenu();
			Persona p = new Persona();
			switch(scelta)
			{
			case 1:
				view.macheraInserimento(p);
				crud.inserimentoPersona(p);
				break;
			case 2:
				findp =	view.leggiStringa("Inserisci il cf della persona da ricercare");
				if(findp!=null)
				{
					rs = crud.ricercaPersona(findp);
					try {
						if(rs.isBeforeFirst())
							view.stampaPersone(rs);
						else
							view.stampaStringa("La persona cercata non e' presente nel database");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
				else
					view.stampaStringa("La persona non e' presente nel databse");
				break;
			case 3:
				findp =	view.leggiStringa("Inserisci il cf della persona da eliminare");
				if(findp!=null)
				{
					rs = crud.ricercaPersona(findp);
					try {
						if(rs.isBeforeFirst())
						{
							view.stampaPersone(rs);
							if(view.leggiStringa("Vuoi eliminare questa persona?").equalsIgnoreCase("si"))
							{
								crud.eliminaPersona(findp);
								view.stampaStringa("La persona e' stata eliminata dal database");
							}
							else
								view.stampaStringa("Nessuna persona e' stata eliminata dal database");
						}
						else
							view.stampaStringa("La persona cercata non e' presente nel database");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
				else
					view.stampaStringa("La persona non e' presente nel databse");
				break;
			case 4:
				findp =	view.leggiStringa("Inserisci il cf della persona da modificare");
				if(findp!=null)
				{
					rs = crud.ricercaPersona(findp);
					try {
						if(rs.isBeforeFirst())
						{
							Persona pNew = new Persona();
							view.mascheraModificaPersona(rs, pNew);
							//TODO - verificare se non ci sono stati cambi, in modo da non far partire l'UPDATE a vuoto
							if (view.leggiStringa("Sei sicuro di voler apportare le modifiche?").equalsIgnoreCase("si")) {
								crud.modificaPersona(findp, pNew);
								view.stampaStringa("La persona è stata modificata con successo");
								view.stampaPersona(pNew);
							} else
								view.stampaStringa("Modifica annullata.");
						}
						else
							view.stampaStringa("La persona cercata non e' presente nel database");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
				else
					view.stampaStringa("La persona non e' presente nel database");
				break;
			case 5:
				view.stampaPersone(crud.getPersone());
				break;
			case 0:
				view.stampaUscita();
				flag=false;
				break;
			}
		}while(flag);

	}

}

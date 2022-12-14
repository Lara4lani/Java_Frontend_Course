package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.crud;
import model.persona;
import view.view;

public class controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		crud crud = new crud();
		view view = new view();
		boolean flag= true;
		String findp=null;



		do
		{
			int scelta = view.stampaMenu();
			persona p = new persona();
			switch(scelta)
			{
			case 1:
				view.macheraInserimento(p);
				crud.inserimentoPersona(p);
				break;
			case 2:
				findp=view.leggiStringa("Inserisci il cf della persona da ricercare");
				if(!findp.equals(null))
				try {
					view.stampaPersone(crud.ricercaPersona(findp));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				else
					System.out.println("La persona cercata non esiste");
					break;
			case 3:
				findp=view.leggiStringa("Inserisci il cf della persona da eliminare");
				if(!findp.equals(null))
				try {
					view.stampaPersone(crud.ricercaPersona(findp));
					if(view.leggiStringa("Vuoi eliminare questa persona?").equalsIgnoreCase("si"))
					{
						crud.eliminaPersona(findp);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				else
					System.out.println("La persona cercata non esiste");
				break;
			case 4:
				break;
			case 5:
				try {
					view.stampaPersone(crud.getPersone());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 0:
				view.stampaUscita();
				flag=false;
				break;
			}
		}while(flag);

	}

}

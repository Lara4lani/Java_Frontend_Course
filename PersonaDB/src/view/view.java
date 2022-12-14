package view;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.persona;

public class view {

	private Scanner input=new Scanner(System.in);

	public String leggiStringa(String s)
	{
		System.out.println(s);
		return input.nextLine();
	}

	public int leggiNumero(String s)
	{
		int num=0;
		boolean flag;
		do
		{
			flag= false;
			System.out.println(s);
			try 
			{
				num= Integer.parseInt(input.nextLine());
			} 
			catch (NumberFormatException e)
			{
				//System.out.println(e);
				System.out.println("non hai inserito un numero");
				flag=true;
			}
		}while(flag);

		return num;

	}

	public Date convertiData(String data)
	{
		Date d = null;
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			d=sdf.parse(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String date = simpleDateFormat.format(new Date());
		return d;
	}

	public void stampaStringa(String s)
	{
		System.out.println(s);
	}

	public void stampaUscita()
	{
		System.out.println("ARRIVEDERCI");
	}

	public int stampaMenu()
	{
		System.out.println("***GESTIONE PERSONA***");
		System.out.println("1. Inserisci");
		System.out.println("2. Ricerca");
		System.out.println("3. Elimina");
		System.out.println("4. Modifica");
		System.out.println("5. Stampa");	
		System.out.println("0. ESCI");
		return leggiNumero("Scegli l'operazione da eseguire");
	}

	public void stampaPersone(ResultSet rs) throws SQLException
	{
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
				if (i > 1) System.out.print(",  ");
				String columnValue = rs.getString(i);
				System.out.print(rsmd.getColumnName(i)+ ": " + columnValue );
			}
			System.out.println("");
		}
	}

	public void macheraInserimento(persona p)
	{
		p.setNome(leggiStringa("inserisci il nome"));
		p.setCognome(leggiStringa("inserisci il cognome"));
		p.setDataDiNascita(convertiData(leggiStringa("inserisci la data di nascita nel seguente formato: yyyy-mm-dd")));
		p.setCf(leggiStringa("inserisci il codice fiscale"));	
	}

}

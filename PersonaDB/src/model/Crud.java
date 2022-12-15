package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Crud {

	//JDBC driver and db url
	//connessione al db
	static final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
	static final String DB_URL ="jdbc:mysql://localhost:3306/gestione_persona";
	static final String UserDB ="root";
	static final String PasswordDB ="root";


	private static Connection conn = null; //conn serve per manipolare il db

	//blocco statico attivato quando viene instanziato oggetto crud per ativare la connessione
	static {
		try {
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL, UserDB, PasswordDB);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void inserimentoPersona(Persona p) {
		String sql = "INSERT INTO persone(nome, cognome, datadinascita, cf) VALUES (?,?,?,?)";//preparo la query
		PreparedStatement ps = null;//oggetto prepared statement per gestire i oaramentri dellaquery (?)

		try {

			ps = conn.prepareStatement(sql);

			ps.setString(1, p.getNome());
			ps.setString(2, p.getCognome());
			ps.setDate(3, p.getDataDiNascita());
			ps.setString(4, p.getCf());

			ps.executeUpdate();
			ps.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}


	public ResultSet ricercaPersona(String s)
	{
		String sql = "SELECT * FROM persone WHERE CF= '" + s + "'";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	public void eliminaPersona(String s)
	{
		String sql = "DELETE  FROM persone WHERE CF='"+s+"'";//preparo la query
		PreparedStatement ps = null;//oggetto prepared statement per gestire i oaramentri dellaquery (?)

		try {

			ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();

		}catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}

	public void modificaPersona(String cf, Persona p) {
		String sql = "UPDATE persone SET nome = ?, cognome = ?, datadinascita = ?, cf = ? WHERE Cf='" + cf + "'";
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, p.getNome());
			ps.setString(2, p.getCognome());
			ps.setDate(3, (Date) p.getDataDiNascita());
			ps.setString(4, p.getCf());
			ps.executeUpdate();
			ps.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public ResultSet getPersone() {
		String sql = "SELECT * FROM persone";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}

package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud {
	
	//JDBC driver and db url
		static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
		static final String DB_URL ="jdbc:mysql://localhost:3306/gestione_persona";
		static final String UserDB ="root";
		 //@NOTE--> dont delete MAMP 
		 static final String PasswordDB ="root";
		// xampp
		//static final String PasswordDB =""; 
		
		
		private static Connection conn = null;
		
		
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
		
		
		public int inserimentoPersona(Persona p) {
			String sql = "INSERT INTO persone (nome, cognome, datadinascita, cf) VALUES (?,?,?,?)";
			PreparedStatement ps = null;
			int num = 0;
			
			try {
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, p.getNome());
				ps.setString(2, p.getCognome());
				ps.setDate(3, p.getDatadinascita() );
				ps.setString(4, p.getCf());
				
				num = ps.executeUpdate(); //ogni volta che esegue la query aumenta di uno
				ps.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return num;
		}
		

		public int eliminaPersona(String s)
		{
			String sql = "DELETE  FROM persone WHERE CF='"+s+"'";//preparo la query
			PreparedStatement ps = null;//oggetto prepared statement per gestire i oaramentri dellaquery (?)
			int num = 0;
			try {

				ps = conn.prepareStatement(sql);
				
				num = ps.executeUpdate();
				ps.close();

			}catch(SQLException e) 
			{
				e.printStackTrace();
			}
			return num;
		}
		public ResultSet CercaCf(String s)
		{
			String sql = "SELECT *  FROM persone WHERE CF='"+s+"'";//preparo la query
			PreparedStatement ps = null;//oggetto prepared statement per gestire i oaramentri dellaquery (?)
			ResultSet rs = null;
			try {

				ps = conn.prepareStatement(sql);
				
				rs = ps.executeQuery();
			

			}catch(SQLException e) 
			{
				e.printStackTrace();
			}
			return rs;
		}


		public int modificaPersona(Persona p, String cf) {
			String sql = "UPDATE persone SET nome = ?, cognome = ?, datadinascita = ?, cf = ? WHERE Cf='"+cf+"'";
			PreparedStatement ps = null;
			int num=0;
			try {
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, p.getNome());
				ps.setString(2, p.getCognome());
				ps.setDate(3, p.getDatadinascita() );
				ps.setString(4, p.getCf());
				num = ps.executeUpdate();
				ps.close();
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
			return num;
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

package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud {
	
	//JDBC driver and db url
		static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
		static final String DB_URL ="jdbc:mysql://localhost:3306/gestione_persona";
		static final String UserDB ="root";
		static final String PasswordDB ="root";
		
		
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
		
		
		public void inserimentoPersona(Persona p) {
			String sql = "INSERT INTO persone (nome, cognome, datadinascita, cf) VALUES (?,?,?,?)";
			PreparedStatement ps = null;
			
			try {
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, p.getNome());
				ps.setString(2, p.getCognome());
				ps.setDate(3, p.getDatadinascita());
				ps.setString(4, p.getCf());
				
				ps.executeUpdate();
				ps.close();
			}catch(SQLException e) {
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

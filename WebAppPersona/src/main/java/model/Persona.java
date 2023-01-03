package model;

import java.util.Date;

public class Persona {
	
	private String nome;
	private String cognome;
	private Date datadinascita;
	private String cf;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public java.sql.Date getDatadinascita() {
		return new java.sql.Date(datadinascita.getTime());
	}
	public void setDatadinascita(Date datadinascita) {
		this.datadinascita = datadinascita;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	
	public Persona(String nome2, String cognome2, String datadinascita2, String cf2) {
		// TODO Auto-generated constructor stub
	}
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	

}

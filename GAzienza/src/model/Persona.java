package model;

import java.util.Objects;

public class Persona {

	//dichiaro gli attributi privati
	private String nome;
	private String cognome;
	private int eta;
	private String cf;
	
	//metodi get e set degli attributi
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
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	//permette di stampare direttamente tutti i campi dell'oggetto senza doverlo fare uno alla volta
	@Override
	public String toString() {
		return "nome: " + nome + "\n" + "cognome: " + cognome + "\n" + "eta: " + eta + "\n" + "codice fiscale: " + cf + "\n";
	}
	
	//questo e quello sotto sovrascrivono il metodo di object .equals e fanno in modo che vengano 
	//messi a confronto tutti i campi di un oggetto per controllare se due oggetti sono uguali
	@Override
	public int hashCode() {
		return Objects.hash(cf, cognome, eta, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(cf, other.cf) && Objects.equals(cognome, other.cognome) && eta == other.eta
				&& Objects.equals(nome, other.nome);
	}
	
	//costruttore parametrizzato
	public Persona(String nome, String cognome, int eta, String cf) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.cf = cf;
	}
	
	//costruttore senza parametri
	public Persona() {
		
	}
	
}

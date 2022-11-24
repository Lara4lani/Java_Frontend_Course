package MODEL.HashMAp;

import java.util.Objects;

public class Persona //creiamo classe con entita'
{

	//attributi privati di entita'
	private String nome;
	private String cognome;
	private int eta;
	private String cf;
	
	
	//usiamo dei metodi pubblici per poter accedere agli attributi e far si che vengano scelti da utente
	public void setNome(String nome)
	{
	   	this.nome=nome;
	}
	
	
	
	
	public void setCognome(String cognome)
	{
	   	this.cognome=cognome;
	}
	
	
	
	
	public void setEta(int eta)
	{
	   	this.eta=eta;
	}
	
	
	
	
	public void setCf(String cf)
	{
	   	this.cf=cf;
	}
	
	
	
	
	//usiamo metodi pubblici per ritornare gli attributi scegli e poterli stampare
	public String getNome()
	{
		return nome;
	}
	
	
	
	public String getCognome()
	{
		return cognome;
	}
	
	
	
	public int getEta()
	{
		return eta;
	}
	
	
	
	public String getCf()
	{
		return cf;
	}



	//permette di stampare direttamente tutti i campi dell'oggetto senza doverlo fare uno alla volta
	@Override 
	public String toString() {
		return "nome: " + nome + ", cognome: " + cognome + ", eta: " + eta + ", cf: " + cf ;
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
	
	
	
	
	
}
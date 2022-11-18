package MODEL;

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
	
	
	
	
	
}

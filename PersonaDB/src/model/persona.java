package model;



import java.util.Date;
import java.util.Objects;

public class persona {

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
	public java.sql.Date getDataDiNascita() {
		return  new java.sql.Date(datadinascita.getTime());
	}
	public void setDataDiNascita(Date data) {
		this.datadinascita = data;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cf, cognome, datadinascita, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		persona other = (persona) obj;
		return Objects.equals(cf, other.cf) && Objects.equals(cognome, other.cognome) && datadinascita == other.datadinascita
				&& Objects.equals(nome, other.nome);
	}
	
	
	
	
}


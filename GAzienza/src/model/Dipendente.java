package model;

import java.util.Objects;

public class Dipendente extends Persona {

	private Double stipendio;

	public Double getStipendio() {
		return stipendio;
	}

	public void setStipendio(Double stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return super.toString()+ "stipendio: " + stipendio + "$" + "\n";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(stipendio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dipendente other = (Dipendente) obj;
		return Objects.equals(stipendio, other.stipendio);
	}

	public Dipendente(String nome, String cognome, int eta, String cf, Double stipendio) {
		super(nome, cognome, eta, cf);
		this.stipendio = stipendio;
	}
	
	public Dipendente()
	{
		
	}
}

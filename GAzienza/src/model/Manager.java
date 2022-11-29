package model;

import java.util.Objects;

public class Manager extends Dipendente {

	private String ruolo;

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	@Override
	public String toString() {
		return super.toString()+"ruolo: " + ruolo + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(ruolo);
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
		Manager other = (Manager) obj;
		return Objects.equals(ruolo, other.ruolo);
	}

	public Manager(String nome, String cognome, int eta, String cf, Double stipendio, String ruolo) {
		super(nome, cognome, eta, cf, stipendio);
		this.ruolo = ruolo;
	}
	
	public Manager()
	{
		
	}
	
}

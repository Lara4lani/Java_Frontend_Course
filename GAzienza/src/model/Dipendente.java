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
		return Objects.hash(stipendio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dipendente other = (Dipendente) obj;
		return Objects.equals(stipendio, other.stipendio);
	}
	
	
	
}

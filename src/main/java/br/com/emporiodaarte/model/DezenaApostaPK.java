package br.com.emporiodaarte.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the dezena_aposta database table.
 * 
 */
@Embeddable
public class DezenaApostaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_aposta")
	private int idAposta;

	private int dezena;

    public DezenaApostaPK() {
    }
	public int getIdAposta() {
		return this.idAposta;
	}
	public void setIdAposta(int idAposta) {
		this.idAposta = idAposta;
	}
	public int getDezena() {
		return this.dezena;
	}
	public void setDezena(int dezena) {
		this.dezena = dezena;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DezenaApostaPK)) {
			return false;
		}
		DezenaApostaPK castOther = (DezenaApostaPK)other;
		return 
			(this.idAposta == castOther.idAposta)
			&& (this.dezena == castOther.dezena);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAposta;
		hash = hash * prime + this.dezena;
		
		return hash;
    }
}
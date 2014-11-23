package br.com.emporiodaarte.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dezena_aposta database table.
 * 
 */
@Entity
@Table(name="dezena_aposta")
public class DezenaAposta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DezenaApostaPK id;

	//bi-directional many-to-one association to Aposta
    @ManyToOne
	@JoinColumn(name="id_aposta")
	private Aposta aposta;

    public DezenaAposta() {
    }

	public DezenaApostaPK getId() {
		return this.id;
	}

	public void setId(DezenaApostaPK id) {
		this.id = id;
	}
	
	public Aposta getAposta() {
		return this.aposta;
	}

	public void setAposta(Aposta aposta) {
		this.aposta = aposta;
	}
	
}
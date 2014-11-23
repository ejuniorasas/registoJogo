package br.com.emporiodaarte.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the jogo database table.
 * 
 */
@Entity
public class Jogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_jogo")
	private int idJogo;

	@Column(name="nome_jogo")
	private String nomeJogo;

	private int numeros;

    @Lob()
	@Column(name="sorteio_atual")
	private String sorteioAtual;

	@Column(name="status_jogo")
	private String statusJogo;

	//bi-directional many-to-one association to Modalidade
	@OneToMany(mappedBy="jogo")
	private List<Modalidade> modalidades;

    public Jogo() {
    }

	public int getIdJogo() {
		return this.idJogo;
	}

	public void setIdJogo(int idJogo) {
		this.idJogo = idJogo;
	}

	public String getNomeJogo() {
		return this.nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public int getNumeros() {
		return this.numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	public String getSorteioAtual() {
		return this.sorteioAtual;
	}

	public void setSorteioAtual(String sorteioAtual) {
		this.sorteioAtual = sorteioAtual;
	}

	public String getStatusJogo() {
		return this.statusJogo;
	}

	public void setStatusJogo(String statusJogo) {
		this.statusJogo = statusJogo;
	}

	public List<Modalidade> getModalidades() {
		return this.modalidades;
	}

	public void setModalidades(List<Modalidade> modalidades) {
		this.modalidades = modalidades;
	}
	
}
package br.com.emporiodaarte.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the modalidade database table.
 * 
 */
@Entity
public class Modalidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_modalidade")
	private int idModalidade;

	@Column(name="descricao_modalidade")
	private String descricaoModalidade;

	@Column(name="nome_modalidade")
	private String nomeModalidade;

	@Column(name="status_modalidade")
	private String statusModalidade;

	//bi-directional many-to-one association to ConfiguracaoModalidade
	@OneToMany(mappedBy="modalidade")
	private List<ConfiguracaoModalidade> configuracaoModalidades;

	//bi-directional many-to-one association to Jogo
    @ManyToOne
	@JoinColumn(name="id_jogo")
	private Jogo jogo;

    public Modalidade() {
    }

	public int getIdModalidade() {
		return this.idModalidade;
	}

	public void setIdModalidade(int idModalidade) {
		this.idModalidade = idModalidade;
	}

	public String getDescricaoModalidade() {
		return this.descricaoModalidade;
	}

	public void setDescricaoModalidade(String descricaoModalidade) {
		this.descricaoModalidade = descricaoModalidade;
	}

	public String getNomeModalidade() {
		return this.nomeModalidade;
	}

	public void setNomeModalidade(String nomeModalidade) {
		this.nomeModalidade = nomeModalidade;
	}

	public String getStatusModalidade() {
		return this.statusModalidade;
	}

	public void setStatusModalidade(String statusModalidade) {
		this.statusModalidade = statusModalidade;
	}

	public List<ConfiguracaoModalidade> getConfiguracaoModalidades() {
		return this.configuracaoModalidades;
	}

	public void setConfiguracaoModalidades(List<ConfiguracaoModalidade> configuracaoModalidades) {
		this.configuracaoModalidades = configuracaoModalidades;
	}
	
	public Jogo getJogo() {
		return this.jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	
}
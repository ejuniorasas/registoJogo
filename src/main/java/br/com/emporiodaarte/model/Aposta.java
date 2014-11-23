package br.com.emporiodaarte.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the aposta database table.
 * 
 */
@Entity
public class Aposta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_aposta")
	private int idAposta;

	@Column(name="aposta_paga")
	private String apostaPaga;

	@Column(name="aposta_realizada")
	private String apostaRealizada;

	private String apostacol;

	@Column(name="status_aposta")
	private String statusAposta;

	//bi-directional many-to-one association to ConfiguracaoModalidade
    @ManyToOne
	@JoinColumn(name="id_configuracao")
	private ConfiguracaoModalidade configuracaoModalidade;

	//bi-directional many-to-one association to GrupoAposta
    @ManyToOne
	@JoinColumn(name="id_apostador")
	private GrupoAposta grupoAposta;

	//bi-directional many-to-one association to DezenaAposta
	@OneToMany(mappedBy="aposta")
	private List<DezenaAposta> dezenaApostas;

    public Aposta() {
    }

	public int getIdAposta() {
		return this.idAposta;
	}

	public void setIdAposta(int idAposta) {
		this.idAposta = idAposta;
	}

	public String getApostaPaga() {
		return this.apostaPaga;
	}

	public void setApostaPaga(String apostaPaga) {
		this.apostaPaga = apostaPaga;
	}

	public String getApostaRealizada() {
		return this.apostaRealizada;
	}

	public void setApostaRealizada(String apostaRealizada) {
		this.apostaRealizada = apostaRealizada;
	}

	public String getApostacol() {
		return this.apostacol;
	}

	public void setApostacol(String apostacol) {
		this.apostacol = apostacol;
	}

	public String getStatusAposta() {
		return this.statusAposta;
	}

	public void setStatusAposta(String statusAposta) {
		this.statusAposta = statusAposta;
	}

	public ConfiguracaoModalidade getConfiguracaoModalidade() {
		return this.configuracaoModalidade;
	}

	public void setConfiguracaoModalidade(ConfiguracaoModalidade configuracaoModalidade) {
		this.configuracaoModalidade = configuracaoModalidade;
	}
	
	public GrupoAposta getGrupoAposta() {
		return this.grupoAposta;
	}

	public void setGrupoAposta(GrupoAposta grupoAposta) {
		this.grupoAposta = grupoAposta;
	}
	
	public List<DezenaAposta> getDezenaApostas() {
		return this.dezenaApostas;
	}

	public void setDezenaApostas(List<DezenaAposta> dezenaApostas) {
		this.dezenaApostas = dezenaApostas;
	}
	
}
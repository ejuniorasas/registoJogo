package br.com.emporiodaarte.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the configuracao_modalidade database table.
 * 
 */
@Entity
@Table(name="configuracao_modalidade")
public class ConfiguracaoModalidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_configuracao")
	private int idConfiguracao;

	@Column(name="custo_aposta")
	private BigDecimal custoAposta;

	@Column(name="quantidade_dezenas")
	private int quantidadeDezenas;

	@Column(name="status_configuraco")
	private String statusConfiguraco;

	@Column(name="valor_aposta")
	private BigDecimal valorAposta;

	//bi-directional many-to-one association to Aposta
	@OneToMany(mappedBy="configuracaoModalidade")
	private List<Aposta> apostas;

	//bi-directional many-to-one association to Modalidade
    @ManyToOne
	@JoinColumn(name="id_modalidade")
	private Modalidade modalidade;

    public ConfiguracaoModalidade() {
    }

	public int getIdConfiguracao() {
		return this.idConfiguracao;
	}

	public void setIdConfiguracao(int idConfiguracao) {
		this.idConfiguracao = idConfiguracao;
	}

	public BigDecimal getCustoAposta() {
		return this.custoAposta;
	}

	public void setCustoAposta(BigDecimal custoAposta) {
		this.custoAposta = custoAposta;
	}

	public int getQuantidadeDezenas() {
		return this.quantidadeDezenas;
	}

	public void setQuantidadeDezenas(int quantidadeDezenas) {
		this.quantidadeDezenas = quantidadeDezenas;
	}

	public String getStatusConfiguraco() {
		return this.statusConfiguraco;
	}

	public void setStatusConfiguraco(String statusConfiguraco) {
		this.statusConfiguraco = statusConfiguraco;
	}

	public BigDecimal getValorAposta() {
		return this.valorAposta;
	}

	public void setValorAposta(BigDecimal valorAposta) {
		this.valorAposta = valorAposta;
	}

	public List<Aposta> getApostas() {
		return this.apostas;
	}

	public void setApostas(List<Aposta> apostas) {
		this.apostas = apostas;
	}
	
	public Modalidade getModalidade() {
		return this.modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	
}
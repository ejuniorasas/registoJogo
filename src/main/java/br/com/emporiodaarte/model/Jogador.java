package br.com.emporiodaarte.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the jogador database table.
 * 
 */
@Entity
public class Jogador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_jogador")
	private int idJogador;

	@Column(name="apelido_jogador")
	private String apelidoJogador;

	@Column(name="email_jogador")
	private String emailJogador;

	@Column(name="nome_jogador")
	private String nomeJogador;

	private BigDecimal saldo;

	@Column(name="senha_jogador")
	private String senhaJogador;

	@Column(name="status_jogador")
	private String statusJogador;

	@Column(name="perfil")
	private String perfil;

	//bi-directional many-to-one association to Grupo
	@OneToMany(mappedBy="jogador")
	private List<Grupo> grupos;

	//bi-directional many-to-one association to GrupoAposta
	@OneToMany(mappedBy="jogador")
	private List<GrupoAposta> grupoApostas;

    public Jogador() {
    }

	public int getIdJogador() {
		return this.idJogador;
	}

	public void setIdJogador(int idJogador) {
		this.idJogador = idJogador;
	}

	public String getApelidoJogador() {
		return this.apelidoJogador;
	}

	public void setApelidoJogador(String apelidoJogador) {
		this.apelidoJogador = apelidoJogador;
	}

	public String getEmailJogador() {
		return this.emailJogador;
	}

	public void setEmailJogador(String emailJogador) {
		this.emailJogador = emailJogador;
	}

	public String getNomeJogador() {
		return this.nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public BigDecimal getSaldo() {
		return this.saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getSenhaJogador() {
		return this.senhaJogador;
	}

	public void setSenhaJogador(String senhaJogador) {
		this.senhaJogador = senhaJogador;
	}

	public String getStatusJogador() {
		return this.statusJogador;
	}

	public void setStatusJogador(String statusJogador) {
		this.statusJogador = statusJogador;
	}

	
	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public List<Grupo> getGrupos() {
		return this.grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public List<GrupoAposta> getGrupoApostas() {
		return this.grupoApostas;
	}

	public void setGrupoApostas(List<GrupoAposta> grupoApostas) {
		this.grupoApostas = grupoApostas;
	}
	
}
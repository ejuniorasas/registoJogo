package br.com.emporiodaarte.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the grupo_aposta database table.
 * 
 */
@Entity
@Table(name="grupo_aposta")
public class GrupoAposta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_apostador")
	private int idApostador;

	private String status;

	//bi-directional many-to-one association to Aposta
	@OneToMany(mappedBy="grupoAposta")
	private List<Aposta> apostas;

	//bi-directional many-to-one association to Grupo
    @ManyToOne
	@JoinColumn(name="id_grupo")
	private Grupo grupo;

	//bi-directional many-to-one association to Jogador
    @ManyToOne
	@JoinColumn(name="id_jogador")
	private Jogador jogador;

    public GrupoAposta() {
    }

	public int getIdApostador() {
		return this.idApostador;
	}

	public void setIdApostador(int idApostador) {
		this.idApostador = idApostador;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Aposta> getApostas() {
		return this.apostas;
	}

	public void setApostas(List<Aposta> apostas) {
		this.apostas = apostas;
	}
	
	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	public Jogador getJogador() {
		return this.jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
}
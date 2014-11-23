package br.com.emporiodaarte.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the grupo database table.
 * 
 */
@Entity
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_grupo")
	private int idGrupo;

	@Column(name="identificador_grupo")
	private String identificadorGrupo;

	@Column(name="nome_grupo")
	private String nomeGrupo;

	@Column(name="status_grupo")
	private String statusGrupo;

	//bi-directional many-to-one association to Jogador
    @ManyToOne
	@JoinColumn(name="id_jogador")
	private Jogador jogador;

	//bi-directional many-to-one association to GrupoAposta
	@OneToMany(mappedBy="grupo")
	private List<GrupoAposta> grupoApostas;

    public Grupo() {
    }

	public int getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getIdentificadorGrupo() {
		return this.identificadorGrupo;
	}

	public void setIdentificadorGrupo(String identificadorGrupo) {
		this.identificadorGrupo = identificadorGrupo;
	}

	public String getNomeGrupo() {
		return this.nomeGrupo;
	}

	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}

	public String getStatusGrupo() {
		return this.statusGrupo;
	}

	public void setStatusGrupo(String statusGrupo) {
		this.statusGrupo = statusGrupo;
	}

	public Jogador getJogador() {
		return this.jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	public List<GrupoAposta> getGrupoApostas() {
		return this.grupoApostas;
	}

	public void setGrupoApostas(List<GrupoAposta> grupoApostas) {
		this.grupoApostas = grupoApostas;
	}
	
}
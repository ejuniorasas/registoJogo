package br.com.emporiodaarte.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.emporiodaarte.model.Grupo;

public interface IGrupoRepositorio extends PagingAndSortingRepository<Grupo, Integer>{
	@Query(value="select g from Grupo g where g.Jogador.idJogador = ?1")
	public Page<Grupo> findAllGroupByJogador(Integer idJogador);
}

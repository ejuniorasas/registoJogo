package br.com.emporiodaarte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.emporiodaarte.model.Jogador;
import br.com.emporiodaarte.repository.JogadorRepositoy;

@Service
public class JogadorService {
	
	@Autowired
	private JogadorRepositoy jogador;
	
	public Iterable<Jogador> findAll() {
		return jogador.findAll();
	}

}

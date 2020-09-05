package br.com.sistema.gerenciador.estoque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistema.gerenciador.estoque.domain.Estoque;
import br.com.sistema.gerenciador.estoque.repositories.EstoqueRepository;

@Service
public class EstoqueService {
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	public List<Estoque> findAll(){
		return estoqueRepository.findAll();
	}
	
}

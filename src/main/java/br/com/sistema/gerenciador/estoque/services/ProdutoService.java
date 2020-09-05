package br.com.sistema.gerenciador.estoque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistema.gerenciador.estoque.domain.Produto;
import br.com.sistema.gerenciador.estoque.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> findAll(){
		return produtoRepository.findAll();
	}
	
}

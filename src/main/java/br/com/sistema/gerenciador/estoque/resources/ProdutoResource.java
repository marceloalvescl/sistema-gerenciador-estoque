package br.com.sistema.gerenciador.estoque.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistema.gerenciador.estoque.domain.Produto;
import br.com.sistema.gerenciador.estoque.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Produto> findAll(){
		return produtoService.findAll();
	}
	
}

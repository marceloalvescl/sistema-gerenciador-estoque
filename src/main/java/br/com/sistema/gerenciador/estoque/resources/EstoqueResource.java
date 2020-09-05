package br.com.sistema.gerenciador.estoque.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistema.gerenciador.estoque.domain.Estoque;
import br.com.sistema.gerenciador.estoque.services.EstoqueService;

@RestController
@RequestMapping(value = "/estoque")
public class EstoqueResource {
	
	@Autowired
	private EstoqueService estoqueService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Estoque> findAll(){
		return estoqueService.findAll();
	}
	

}

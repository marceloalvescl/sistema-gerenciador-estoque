package br.com.sistema.gerenciador.estoque;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.sistema.gerenciador.estoque.domain.Categoria;
import br.com.sistema.gerenciador.estoque.domain.Estoque;
import br.com.sistema.gerenciador.estoque.domain.Produto;
import br.com.sistema.gerenciador.estoque.repositories.CategoriaRepository;
import br.com.sistema.gerenciador.estoque.repositories.EstoqueRepository;
import br.com.sistema.gerenciador.estoque.repositories.ProdutoRepository;

@SpringBootApplication
public class SistemaGerenciadorEstoqueApplication implements CommandLineRunner{

	private CategoriaRepository categoriaRepository;
	
	private ProdutoRepository produtoRepository;
	
	private EstoqueRepository estoqueRepository;
	
	public SistemaGerenciadorEstoqueApplication(CategoriaRepository categoriaRepository,
			ProdutoRepository produtoRepository, EstoqueRepository estoqueRepository) {
		this.categoriaRepository = categoriaRepository;
		this.produtoRepository = produtoRepository;
		this.estoqueRepository = estoqueRepository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaGerenciadorEstoqueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria1 = new Categoria(null, "Eletrodoméstico");
		Categoria categoria2 = new Categoria(null, "Cama, mesa e banho");
		
		Produto produto1 = new Produto(null, categoria1, "Fogão 6 bocas", 700.0);
		Produto produto2 = new Produto(null, categoria2, "Cama master", 3000.0);
		
		Estoque estoque = new Estoque(null, produto1, 50);
		Estoque estoque1 = new Estoque(null, produto2, 35);
		
		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2));
		produtoRepository.saveAll(Arrays.asList(produto1, produto2));
		estoqueRepository.saveAll(Arrays.asList(estoque, estoque1));
		
	}

}

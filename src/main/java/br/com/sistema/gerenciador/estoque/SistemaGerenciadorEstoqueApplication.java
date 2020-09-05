package br.com.sistema.gerenciador.estoque;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.sistema.gerenciador.estoque.domain.Categoria;
import br.com.sistema.gerenciador.estoque.repositories.CategoriaRepository;

@SpringBootApplication
public class SistemaGerenciadorEstoqueApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SistemaGerenciadorEstoqueApplication.class, args);
	}

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Categoria categoria1 = new Categoria(null, "Eletrodoméstico");
		Categoria categoria2 = new Categoria(null, "Cama, mesa e banho");
		
		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2));
		
	}

}

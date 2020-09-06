package br.com.sistema.gerenciador.estoque;

import br.com.sistema.gerenciador.estoque.domain.Categoria;
import br.com.sistema.gerenciador.estoque.domain.Estoque;
import br.com.sistema.gerenciador.estoque.domain.Produto;
import br.com.sistema.gerenciador.estoque.repositories.CategoriaRepository;
import br.com.sistema.gerenciador.estoque.repositories.EstoqueRepository;
import br.com.sistema.gerenciador.estoque.repositories.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class SgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SgeApplication.class, args);
    }

    @Bean
    @Profile("dev")
    CommandLineRunner commandLineRunner(CategoriaRepository categoriaRepository,
                                        ProdutoRepository produtoRepository,
                                        EstoqueRepository estoqueRepository) {
        return args -> {
            Categoria categoria1 = new Categoria(null, "Eletrodoméstico");
            Categoria categoria2 = new Categoria(null, "Cama, mesa e banho");

            Produto produto1 = new Produto(null, categoria1, "Fogão 6 bocas", 700.0);
            Produto produto2 = new Produto(null, categoria2, "Cama master", 3000.0);

            Estoque estoque = new Estoque(null, produto1, 50);
            Estoque estoque1 = new Estoque(null, produto2, 35);

            categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2));
            produtoRepository.saveAll(Arrays.asList(produto1, produto2));
            estoqueRepository.saveAll(Arrays.asList(estoque, estoque1));
        };
    }

}

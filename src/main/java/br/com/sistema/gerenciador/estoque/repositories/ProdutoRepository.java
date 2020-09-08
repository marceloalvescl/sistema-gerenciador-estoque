package br.com.sistema.gerenciador.estoque.repositories;

import br.com.sistema.gerenciador.estoque.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}

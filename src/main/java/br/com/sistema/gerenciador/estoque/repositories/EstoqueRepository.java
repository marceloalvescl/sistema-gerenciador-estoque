package br.com.sistema.gerenciador.estoque.repositories;

import br.com.sistema.gerenciador.estoque.domain.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Integer> {
}

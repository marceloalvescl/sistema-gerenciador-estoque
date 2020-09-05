package br.com.sistema.gerenciador.estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sistema.gerenciador.estoque.domain.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Integer> {

}

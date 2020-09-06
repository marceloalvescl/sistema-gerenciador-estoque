package br.com.sistema.gerenciador.estoque.repositories;

import br.com.sistema.gerenciador.estoque.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}

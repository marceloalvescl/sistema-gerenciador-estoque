package br.com.sistema.gerenciador.estoque.services;

import br.com.sistema.gerenciador.estoque.repositories.CategoriaRepository;
import br.com.sistema.gerenciador.estoque.services.dto.CategoriaDTO;
import br.com.sistema.gerenciador.estoque.services.mapper.CategoriaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;
    private final CategoriaMapper categoriaMapper;

    public Page<CategoriaDTO> findAll(Pageable pageable) {
        return categoriaRepository.findAll(pageable).map(categoriaMapper::toDTO);
    }

}

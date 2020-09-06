package br.com.sistema.gerenciador.estoque.services;

import br.com.sistema.gerenciador.estoque.repositories.EstoqueRepository;
import br.com.sistema.gerenciador.estoque.services.dto.EstoqueDTO;
import br.com.sistema.gerenciador.estoque.services.mapper.EstoqueMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EstoqueService {

    private final EstoqueRepository estoqueRepository;
    private final EstoqueMapper estoqueMapper;

    public Page<EstoqueDTO> findAll(Pageable pageable) {
        return estoqueRepository.findAll(pageable).map(estoqueMapper::toDTO);
    }

}

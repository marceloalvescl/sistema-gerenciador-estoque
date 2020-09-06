package br.com.sistema.gerenciador.estoque.services;

import br.com.sistema.gerenciador.estoque.repositories.ProdutoRepository;
import br.com.sistema.gerenciador.estoque.services.dto.ProdutoDTO;
import br.com.sistema.gerenciador.estoque.services.mapper.ProdutoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final ProdutoMapper produtoMapper;

    public Page<ProdutoDTO> findAll(Pageable pageable) {
        return produtoRepository.findAll(pageable).map(produtoMapper::toDTO);
    }

}

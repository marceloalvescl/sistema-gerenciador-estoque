package br.com.sistema.gerenciador.estoque.resources;

import br.com.sistema.gerenciador.estoque.services.ProdutoService;
import br.com.sistema.gerenciador.estoque.services.dto.ProdutoDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProdutoResource {

    private final ProdutoService produtoService;

    @GetMapping("/produtos")
    public ResponseEntity<List<ProdutoDTO>> findAll(Pageable pageable) {
        log.debug("REST request para recuperar todos os produtos, pageable = {}", pageable);

        return ok(produtoService.findAll(pageable).getContent());
    }

}

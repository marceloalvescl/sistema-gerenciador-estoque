package br.com.sistema.gerenciador.estoque.resources;

import br.com.sistema.gerenciador.estoque.domain.Estoque;
import br.com.sistema.gerenciador.estoque.services.EstoqueService;
import br.com.sistema.gerenciador.estoque.services.dto.EstoqueDTO;
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
public class EstoqueResource {

    private final EstoqueService estoqueService;

    @GetMapping("/estoques")
    public ResponseEntity<List<EstoqueDTO>> findAll(Pageable pageable) {
        log.debug("REST request para recuperar todos os estoques, pageable = {}", pageable);

        return ok(estoqueService.findAll(pageable).getContent());
    }


}

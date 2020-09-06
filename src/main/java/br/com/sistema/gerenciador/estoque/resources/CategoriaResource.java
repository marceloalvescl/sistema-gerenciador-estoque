package br.com.sistema.gerenciador.estoque.resources;

import br.com.sistema.gerenciador.estoque.services.CategoriaService;
import br.com.sistema.gerenciador.estoque.services.dto.CategoriaDTO;
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
public class CategoriaResource {

    private final CategoriaService categoriaService;

    @GetMapping("/categorias")
    public ResponseEntity<List<CategoriaDTO>> findAll(Pageable pageable) {
        log.debug("REST request para recuperar todas categorias, pageable = {}", pageable);

        return ok(categoriaService.findAll(pageable).getContent());
    }

}

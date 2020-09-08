package br.com.sistema.gerenciador.estoque.services.mapper;

import br.com.sistema.gerenciador.estoque.domain.Categoria;
import br.com.sistema.gerenciador.estoque.services.dto.CategoriaDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

class CategoriaMapperTest {

    @MockBean
    CategoriaMapper categoriaMapper;

    @Test
    void deveConverterUmDTOParaEntidade() {
        categoriaMapper.toDTO(new Categoria());
    }

}
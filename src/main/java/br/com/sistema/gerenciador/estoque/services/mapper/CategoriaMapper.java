package br.com.sistema.gerenciador.estoque.services.mapper;

import br.com.sistema.gerenciador.estoque.domain.Categoria;
import br.com.sistema.gerenciador.estoque.services.dto.CategoriaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper extends EntityMapper<Categoria, CategoriaDTO> {

    @Override
    Categoria toEntity(CategoriaDTO categoriaDTO);

    @Override
    CategoriaDTO toDTO(Categoria categoria);

}

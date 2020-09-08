package br.com.sistema.gerenciador.estoque.services.mapper;

import br.com.sistema.gerenciador.estoque.domain.Produto;
import br.com.sistema.gerenciador.estoque.services.dto.ProdutoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = CategoriaMapper.class)
public interface ProdutoMapper extends EntityMapper<Produto, ProdutoDTO> {

    @Override
    @Mapping(source = "categoriaId", target = "categoria.id")
    Produto toEntity(ProdutoDTO produtoDTO);

    @Override
    @Mapping(source = "categoria.id", target = "categoriaId")
    ProdutoDTO toDTO(Produto produto);

}

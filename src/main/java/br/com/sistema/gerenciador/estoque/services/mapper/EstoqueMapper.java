package br.com.sistema.gerenciador.estoque.services.mapper;

import br.com.sistema.gerenciador.estoque.domain.Estoque;
import br.com.sistema.gerenciador.estoque.services.dto.EstoqueDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = ProdutoMapper.class)
public interface EstoqueMapper extends EntityMapper<Estoque, EstoqueDTO> {

    @Override
    @Mapping(source = "produto.id", target = "produtoId")
    EstoqueDTO toDTO(Estoque estoque);

    @Override
    @Mapping(source = "produtoId", target = "produto")
    Estoque toEntity(EstoqueDTO estoqueDTO);

}

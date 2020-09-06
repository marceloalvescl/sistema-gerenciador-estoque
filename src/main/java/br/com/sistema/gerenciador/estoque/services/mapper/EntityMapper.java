package br.com.sistema.gerenciador.estoque.services.mapper;

public interface EntityMapper<E, DTO> {

    E toEntity(DTO dto);

    DTO toDTO(E entity);

}

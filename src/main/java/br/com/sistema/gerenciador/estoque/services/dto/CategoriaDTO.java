package br.com.sistema.gerenciador.estoque.services.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoriaDTO implements Serializable {

    private Integer id;

    private String descricao;

}

package br.com.sistema.gerenciador.estoque.services.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EstoqueDTO implements Serializable {

    private Integer id;

    private Integer produtoId;

    private Integer quantidadeProduto;

}

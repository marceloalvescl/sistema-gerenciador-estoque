package br.com.sistema.gerenciador.estoque.services.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProdutoDTO implements Serializable {

    private Integer id;

    private Integer categoriaId;

    private String nome;

    private Double preco;

}

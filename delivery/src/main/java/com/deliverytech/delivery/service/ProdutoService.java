package com.deliverytech.delivery.service;

import java.util.List;
import java.util.Optional;

import com.deliverytech.delivery.model.Produto;

public interface ProdutoService {
    Produto cadastrar(Produto produto);
    Produto atualizar(Long id, Produto produtoAtuzalizado);
    Optional<Produto> buscarPorId(Long id);
    void alterarDisponibilidade(Long id, boolean disponivel);

    List<Produto> buscarPorRestaurante(Long restaurante);
}

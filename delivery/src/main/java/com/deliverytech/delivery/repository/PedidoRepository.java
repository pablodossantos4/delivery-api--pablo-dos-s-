package com.deliverytech.delivery.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverytech.delivery.model.Pedido;
import com.deliverytech.delivery.model.StatusPedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    List<Pedido> findByClienteId(Long clienteId);
    List<Pedido> findByRestauranteId(Long restauranteId);
    List<Pedido> findByStatus(StatusPedido status);
    List<Pedido> findByDataPedidoBetween(LocalDateTime inicio, LocalDateTime fim);
}

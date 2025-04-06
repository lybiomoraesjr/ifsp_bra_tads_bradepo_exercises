package com.ifsp.lybio.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProcessadorPedido implements IRProcessadorPedido {
    private int quantidadeSolicitada;

    public ProcessadorPedido(int quantidadeSolicitada) {
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    public void connect(IValidadorEstoque componente) {
        componente.update(quantidadeSolicitada);
    }

}

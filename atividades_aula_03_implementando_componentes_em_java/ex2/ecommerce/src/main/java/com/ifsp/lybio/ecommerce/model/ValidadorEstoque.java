package com.ifsp.lybio.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidadorEstoque implements IValidadorEstoque {
    private int quantidadeDisponivel;

    public ValidadorEstoque(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public boolean validar(int quantidadeSolicitada) {
        return quantidadeDisponivel >= quantidadeSolicitada;
    }

    public void update(int quantidadeSolicitada) {
        if (validar(quantidadeSolicitada)) {
            System.out.println("Pedido processado com sucesso!");
        } else {
            System.out.println("Erro: Estoque insuficiente.");
        }
    }
}

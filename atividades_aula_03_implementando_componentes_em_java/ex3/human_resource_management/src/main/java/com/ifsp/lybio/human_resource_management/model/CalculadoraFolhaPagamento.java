package com.ifsp.lybio.human_resource_management.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculadoraFolhaPagamento implements IRCalculadoraFolhaPagamento {
    private int valorHora;
    private int diasTrabalhados;
    private int horasPorDia;
    private double horasTrabalhadas;

    public CalculadoraFolhaPagamento(int valorHora, int diasTrabalhados, int horasPorDia) {
        this.valorHora = valorHora;
        this.diasTrabalhados = diasTrabalhados;
        this.horasPorDia = horasPorDia;
    }

    public double connect(ICalculadoraHorasTrabalhadas componente) {
        double horasTrabalhadas = componente.update(this.diasTrabalhados, this.horasPorDia);
        return horasTrabalhadas * this.valorHora;
    }

}

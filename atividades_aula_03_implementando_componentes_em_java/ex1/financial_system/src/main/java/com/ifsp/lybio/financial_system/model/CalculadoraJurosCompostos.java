package com.ifsp.lybio.financial_system.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculadoraJurosCompostos implements IRCalculadoraJurosCompostos {
    private double valorInicial;
    private double taxaJuros;
    private int periodo;

    public CalculadoraJurosCompostos(double valorInicial, double taxaJuros, int periodo) {
        this.valorInicial = valorInicial;
        this.taxaJuros = taxaJuros;
        this.periodo = periodo;
    }

    public double calcularValorFinal() {
        return this.valorInicial * Math.pow(1 + this.taxaJuros, this.periodo);
    }

    public void connect(IGeradorPlanoAmortizacao componente) {
        componente.update(this.calcularValorFinal(), this.taxaJuros, this.periodo);
    }
}

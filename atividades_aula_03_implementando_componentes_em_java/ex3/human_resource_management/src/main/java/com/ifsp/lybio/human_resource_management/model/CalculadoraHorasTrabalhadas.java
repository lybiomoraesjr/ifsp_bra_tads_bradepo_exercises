package com.ifsp.lybio.human_resource_management.model;

public class CalculadoraHorasTrabalhadas implements ICalculadoraHorasTrabalhadas {

    public double update(int diasTrabalhados, int horasPorDia) {
        return diasTrabalhados * horasPorDia;
    }
}

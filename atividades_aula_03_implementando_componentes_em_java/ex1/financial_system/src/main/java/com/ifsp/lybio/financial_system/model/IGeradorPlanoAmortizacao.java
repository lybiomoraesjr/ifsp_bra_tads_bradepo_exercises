package com.ifsp.lybio.financial_system.model;

public interface IGeradorPlanoAmortizacao {
    public void update(double valorFinal, double taxa, int periodo);
}

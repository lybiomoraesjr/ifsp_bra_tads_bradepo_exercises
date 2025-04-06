package com.ifsp.lybio.financial_system.model;

public class GeradorPlanoAmortizacao implements IGeradorPlanoAmortizacao {

    public void update(double valorFinal, double taxa, int periodo) {
        double valorParcela = valorFinal / periodo;
        System.out.println("Valor total com juros: " + valorFinal);

        for (int i = periodo; i > 0; i--) {
            double valorComDesconto = valorParcela / Math.pow(1 + taxa, i);
            System.out.println("--------------------------------");
            System.out.println("Antecipação da parcela " + i);
            System.out.printf("Valor com desconto: %.2f\n", valorComDesconto);
            System.out.printf("Economia: %.2f\n", valorParcela - valorComDesconto);
            System.out.println("--------------------------------");
        }
    }
}

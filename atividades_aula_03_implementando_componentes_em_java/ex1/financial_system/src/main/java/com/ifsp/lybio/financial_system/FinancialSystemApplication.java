package com.ifsp.lybio.financial_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ifsp.lybio.financial_system.model.CalculadoraJurosCompostos;
import com.ifsp.lybio.financial_system.model.GeradorPlanoAmortizacao;
import com.ifsp.lybio.financial_system.model.IGeradorPlanoAmortizacao;
import com.ifsp.lybio.financial_system.model.IRCalculadoraJurosCompostos;

@SpringBootApplication
public class FinancialSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialSystemApplication.class, args);

		IRCalculadoraJurosCompostos calculadora = new CalculadoraJurosCompostos(1000, 0.05, 12);
		IGeradorPlanoAmortizacao gerador = new GeradorPlanoAmortizacao();

		calculadora.connect(gerador);
	}
}

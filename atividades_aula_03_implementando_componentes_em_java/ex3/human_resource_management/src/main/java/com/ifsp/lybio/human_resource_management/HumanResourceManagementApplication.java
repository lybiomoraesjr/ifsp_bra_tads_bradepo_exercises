package com.ifsp.lybio.human_resource_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ifsp.lybio.human_resource_management.model.CalculadoraFolhaPagamento;
import com.ifsp.lybio.human_resource_management.model.CalculadoraHorasTrabalhadas;
import com.ifsp.lybio.human_resource_management.model.ICalculadoraHorasTrabalhadas;
import com.ifsp.lybio.human_resource_management.model.IRCalculadoraFolhaPagamento;

@SpringBootApplication
public class HumanResourceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanResourceManagementApplication.class, args);

		IRCalculadoraFolhaPagamento calculadoraFolhaPagamento = new CalculadoraFolhaPagamento(10, 20, 8);
		ICalculadoraHorasTrabalhadas calculadoraHorasTrabalhadas = new CalculadoraHorasTrabalhadas();
		double salario = calculadoraFolhaPagamento.connect(calculadoraHorasTrabalhadas);

		System.out.println("Salário: " + salario);

	}

}

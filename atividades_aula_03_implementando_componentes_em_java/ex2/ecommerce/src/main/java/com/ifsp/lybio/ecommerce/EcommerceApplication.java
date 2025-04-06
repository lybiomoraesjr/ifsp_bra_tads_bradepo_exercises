package com.ifsp.lybio.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ifsp.lybio.ecommerce.model.IRProcessadorPedido;
import com.ifsp.lybio.ecommerce.model.IValidadorEstoque;
import com.ifsp.lybio.ecommerce.model.ProcessadorPedido;
import com.ifsp.lybio.ecommerce.model.ValidadorEstoque;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
		IValidadorEstoque validador = new ValidadorEstoque(10);
		IRProcessadorPedido pedido = new ProcessadorPedido(5);

		pedido.connect(validador);
	}

}

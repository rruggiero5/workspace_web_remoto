package br.com.turma11corp.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Teste {
	
		@GetMapping("/boasvindas")
		public String sayboasVindas() {
			return "Bem vindo ao meu Ecommerce";
		}	

		@GetMapping("/teste")
		public String sayTeste() {
			return "Outro teste";
		}	

}

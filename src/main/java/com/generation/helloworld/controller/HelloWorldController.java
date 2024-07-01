package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "MENTALIDADES:\n1-Orientação ao futuro\n2-Responsabilidade Pessoal\n3-Mentalidade de Crescimento\n4-Persistência\n\nHABILIDADES:\n1-Trabalho em Equipe\n2-Atenção aos Detalhes\n3-Proatividade\n4-Comunicação";
	
	}
	@GetMapping("obj")
	public String objetivo() {
		return "Aprender com maestria tudo sobre SpringBoot!!";
	}
}
package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSMController {
	
	@GetMapping
	public String helloWorld() {
		return "MENTALIDADES:\n1-Orientação ao futuro\n2-Responsabilidade Pessoal\n3-Mentalidade de Crescimento\n4-Persistência\n\nHABILIDADES:\n1-Trabalho em Equipe\n2-Atenção aos Detalhes\n3-Proatividade\n4-Comunicação";
	}
}
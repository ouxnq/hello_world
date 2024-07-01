package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/obj")
public class ObjetivosController {
	
	@GetMapping
	public String helloWorld() {
		return "Aprender com maestria tudo sobre SpringBoot!!";
	}
}
package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mostrar")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld(){
		return "Hello World!!";
	}	
	
	@GetMapping("/bsm")
	public String bsm(){
		return "Persistência\n"
				+ "Mentalidade Crescimento\n"
				+ "Responsabilidade Pessoal\n"
				+ "Orientação ao Futuro\n"
				+ "Orientação ao Detalhe \n"
				+ "Trabalho em Equipe\n"
				+ "Comunicação\n"
				+ "Proatividade";
	}
	
	@GetMapping("/objetivos")
	public String objetivos(){
		return "Organizar horários baseado na rotina da semana\n"
			+ "Definir metas SMART para aprender e exercitar a responsabilidade pessoal\n "
			+ "Definir alarmes e lembretes para ajudar na organização diaria";
	}
}

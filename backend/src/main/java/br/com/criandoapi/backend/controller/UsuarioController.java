package br.com.criandoapi.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {
	@GetMapping("/usuarios")
	public String texto () {
		return "Acessando rota";
	}
}

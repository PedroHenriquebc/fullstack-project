package br.com.pedrohenrique.fullstackweek.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedrohenrique.fullstackweek.models.GruposPrioritarios;
import br.com.pedrohenrique.fullstackweek.services.GruposPrioritariosService;

@RestController
@RequestMapping("/grupos-prioritarios")
public class GruposPrioritariosController {

	@Autowired
	private GruposPrioritariosService gruposPrioritariosService;
	
	@GetMapping
	public List<GruposPrioritarios> listarTodos(){
		return gruposPrioritariosService.readAll();
	}
	
	@GetMapping("{id}")
	public GruposPrioritarios buscaPeloId(@PathVariable Long id) {
		return gruposPrioritariosService.read(id);
	}
}

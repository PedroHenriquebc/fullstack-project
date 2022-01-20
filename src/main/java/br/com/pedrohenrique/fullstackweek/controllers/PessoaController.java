package br.com.pedrohenrique.fullstackweek.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedrohenrique.fullstackweek.models.Pessoa;
import br.com.pedrohenrique.fullstackweek.services.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	public List<Pessoa> listarTodos(){
		return pessoaService.readAll();
	}
	
	@PostMapping
	public Pessoa cadastrarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.create(pessoa);
	}
	
	@PutMapping("{id}")
	public Pessoa atualizar(@PathVariable("id") Long id, @RequestBody Pessoa pessoa) {
		return pessoaService.update(id, pessoa);
	}
	
	@GetMapping("{id}")
	public Pessoa buscarPeloCodigo(@PathVariable Long id) {
		return pessoaService.read(id);
	}
	
	
}

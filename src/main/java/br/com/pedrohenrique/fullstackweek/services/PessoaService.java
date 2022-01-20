package br.com.pedrohenrique.fullstackweek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedrohenrique.fullstackweek.models.Pessoa;
import br.com.pedrohenrique.fullstackweek.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public List<Pessoa> readAll() {
		return pessoaRepository.findAll();
	}

	public Pessoa read(Long id) {
		return pessoaRepository.findById(id).orElse(null);
	}

	public Pessoa create(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	public Pessoa update(Long id, Pessoa pessoa) {
		return pessoaRepository.findById(id).map(record -> {
			record.setCpf(pessoa.getCpf());
			record.setDataNascimento(pessoa.getDataNascimento());
			record.setEmail(pessoa.getEmail());
			record.setIdade(pessoa.getIdade());
			record.setNome(pessoa.getNome());
			record.setTelefone(pessoa.getTelefone());
			return pessoaRepository.save(record);
		}).orElse(null);
	}
}

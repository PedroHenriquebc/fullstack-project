package br.com.pedrohenrique.fullstackweek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedrohenrique.fullstackweek.models.GruposPrioritarios;
import br.com.pedrohenrique.fullstackweek.repositories.GruposPrioritariosRepository;

@Service
public class GruposPrioritariosService {
	
	@Autowired
	private GruposPrioritariosRepository gruposPrioritariosRepository;
	
	public List<GruposPrioritarios> readAll(){
		return gruposPrioritariosRepository.findAll();
	}
	
	public GruposPrioritarios read(Long id) {
		return gruposPrioritariosRepository.findById(id).orElse(null);
	}
}

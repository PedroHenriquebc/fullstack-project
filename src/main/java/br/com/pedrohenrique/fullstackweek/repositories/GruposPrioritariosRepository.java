package br.com.pedrohenrique.fullstackweek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pedrohenrique.fullstackweek.models.GruposPrioritarios;

@Repository
public interface GruposPrioritariosRepository extends JpaRepository<GruposPrioritarios, Long>{

}

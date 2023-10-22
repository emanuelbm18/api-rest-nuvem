package br.com.ebm.sommelierapi.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ebm.sommelierapi.model.Vinho;

public interface VinhoRepository extends JpaRepository<Vinho, Long>{

}

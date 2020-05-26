package com.projetofinal.VMPerUse.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.projetofinal.VMPerUse.model.Solicitacao;
import com.projetofinal.VMPerUse.model.Usuario;

public interface SolicitacaoDAO extends JpaRepository<Solicitacao, Long> {
	
	@Query(value = "SELECT * FROM TBL_SOLICITACAO WHERE SOLICITANTE_ID = ?1", nativeQuery = true)
	ArrayList<Solicitacao> findBySolicitante(int solicitante);
	 

}

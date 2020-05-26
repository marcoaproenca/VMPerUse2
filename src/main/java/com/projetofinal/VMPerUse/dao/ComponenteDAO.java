package com.projetofinal.VMPerUse.dao;

import org.springframework.data.repository.CrudRepository;
import com.projetofinal.VMPerUse.model.Componente;
import com.projetofinal.VMPerUse.model.Solicitacao;

public interface ComponenteDAO extends CrudRepository<Componente, Integer> {

}

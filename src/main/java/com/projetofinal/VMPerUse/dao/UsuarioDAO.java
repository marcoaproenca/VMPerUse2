package com.projetofinal.VMPerUse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetofinal.VMPerUse.model.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {
	
	Usuario findByRacfAndSenha(String racf, String senha);
	Usuario findByEmailAndSenha(String email, String senha);

}

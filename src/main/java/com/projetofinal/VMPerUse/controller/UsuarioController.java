package com.projetofinal.VMPerUse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetofinal.VMPerUse.dao.UsuarioDAO;
import com.projetofinal.VMPerUse.model.Usuario;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final UsuarioDAO UsuarioDAO;
	
	public UsuarioController(com.projetofinal.VMPerUse.dao.UsuarioDAO usuarioDAO) {
		super();
		UsuarioDAO = usuarioDAO;
	}
	/*
	@GetMapping("/usuarios")
	public ResponseEntity< ArrayList<Usuario> > BuscarTodos(){
		ArrayList<Usuario> lista = (ArrayList<Usuario>)UsuarioDAO.findAll();
		return ResponseEntity.ok(lista);
	}
	*/
	@PostMapping("/login")
	public ResponseEntity<Usuario> RecuperarUser(@RequestBody Usuario incompleto){
		
		Usuario userRacf = UsuarioDAO.findByRacfAndSenha(incompleto.getRacf(), incompleto.getSenha());
		
		if(userRacf != null) {
			userRacf.setSenha("**********");
			return ResponseEntity.ok(userRacf);
			
		}
		else {
			Usuario userEmail = UsuarioDAO.findByEmailAndSenha(incompleto.getEmail(), incompleto.getSenha());
			if(userEmail != null) {
				userEmail.setSenha("**********");
				return ResponseEntity.ok(userEmail);
				
			}
			else{
				return ResponseEntity.notFound().build();
			}
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> RecuperarPorId(@PathVariable int id){
		Usuario user = UsuarioDAO.findById(id).orElse(null);
		if (user != null) {
			return ResponseEntity.ok(user);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
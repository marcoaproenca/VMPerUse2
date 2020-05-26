package com.projetofinal.VMPerUse.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetofinal.VMPerUse.dao.ComponenteDAO;
import com.projetofinal.VMPerUse.model.Componente;


@RestController
@CrossOrigin("*")
@RequestMapping("/componente")
public class ComponenteController {
	
	ComponenteDAO cpDAO;
	
	public ComponenteController(ComponenteDAO cpDAO) {
		super();
		this.cpDAO = cpDAO;
	}

	@GetMapping("/")
	public ResponseEntity< ArrayList<Componente> > BuscarTodos(){
		ArrayList<Componente> lista = (ArrayList<Componente>)cpDAO.findAll();
		return ResponseEntity.ok(lista);	
	}

}

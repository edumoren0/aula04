package com.sesi.tarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sesi.tarefas.repository.TarefaCategoriaRepository;

@Controller
public class TarefaCategoriaController {
	
	@Autowired
	TarefaCategoriaRepository tarefaCategoriaRepository;
	
	
    @GetMapping("/listarCategoria")
	public String listarCategoria(Model modelo) {
    	modelo.addAttribute("categorias", tarefaCategoriaRepository.findAll());
		return "listarTarefaCategoria";

}

}
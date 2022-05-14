package com.skilldistillery.jpapokemon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.jpapokemon.data.PokemonDAO;

@Controller
public class PokemonController {

	@Autowired
	private PokemonDAO dao;
	
	@RequestMapping(path = {'/', 'home.do'})
	public String index(Model model) {
		model.addAttribute('DEBUG', dao.findById(1));
		return 'index';
	}
	
	
}
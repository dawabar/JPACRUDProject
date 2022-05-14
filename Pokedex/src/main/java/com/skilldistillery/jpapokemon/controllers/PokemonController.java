package com.skilldistillery.jpapokemon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.jpapokemon.data.PokemonDAO;
import com.skilldistillery.jpapokemon.entities.Pokemon;

@Controller
public class PokemonController {

	@Autowired
	private PokemonDAO dao;

	@RequestMapping(path={'/','home.do'})

	public String index() {
		return "index";
	}

	@RequestMapping("getPokemonById.do")
	public String getPokemonById(@RequestParam Integer idSearch, Model model) {

		Pokemon pokemon = dao.findById(idSearch);
		model.addAttribute("pokemon", pokemon);
		return "displayPokemon.jsp";
	}

	@RequestMapping("getPokemonByNdex.do")
	public String getPokemonByNdex(@RequestParam Integer ndexSearch, Model model) {
		Pokemon pokemon = dao.findByNdex(ndexSearch);
		model.addAttribute("pokemon", pokemon);
		return "displayPokemon.jsp";

	}

	@RequestMapping("getPokemonByName.do")
	public String getPokemonByName(@RequestParam String nameSearch, Model model) {
		List<Pokemon> pokelist = dao.findByName(nameSearch);
		model.addAllAttributes(pokelist);
		return "pokedex.jsp";

	}

	@RequestMapping("getAllPokemon.do")
	public String getAllPokemon(Model model) {

		List<Pokemon> pokedex = dao.findAll();
		model.addAllAttributes(pokedex);
		return "pokedex.jsp";
	}

}

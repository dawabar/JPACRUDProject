package com.skilldistillery.jpapokemon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.jpapokemon.data.PokemonDAO;
import com.skilldistillery.jpapokemon.entities.Pokemon;

@Controller
public class PokemonController {

	@Autowired
	private PokemonDAO dao;

	@RequestMapping(path={"/","home.do"})

	public String index() {
		return "index";
	}

	@RequestMapping("getPokemonById.do")
	public String getPokemonById(@RequestParam Integer idSearch, Model model) {

		Pokemon pokemon = dao.findById(idSearch);
		model.addAttribute("pokemon", pokemon);
		return "displayPokemon";
	}

	@RequestMapping("getPokemonByNdex.do")
	public String getPokemonByNdex(@RequestParam Integer ndexSearch, Model model) {
		Pokemon pokemon = dao.findByNdex(ndexSearch);
		model.addAttribute("pokemon", pokemon);
		return "displayPokemon";

	}

	@RequestMapping("getPokemonByName.do")
	public String getPokemonByName(@RequestParam String nameSearch, Model model) {
		List<Pokemon> pokedex = dao.findByName(nameSearch);
		model.addAllAttributes(pokedex);
		return "pokedex";

	}

	@RequestMapping("getAllPokemon.do")
	public String getAllPokemon(Model model) {

		List<Pokemon> pokedex = dao.findAll();
		model.addAllAttributes(pokedex);
		return "pokedex";
	}

	@RequestMapping(path="newPokemon.do")

	public String newPokemon() {
		return "createPokemon";
	}
	
	@RequestMapping(path="createPokemon.do", method=RequestMethod.POST)
	public String createPokemon(Pokemon pokemon, RedirectAttributes redir) {
		Pokemon success = dao.createPokemon(pokemon);
		if (success.getName() != null) {
		redir.addFlashAttribute("pokemon", success);
		return "redirect:displayPokemon";
		} else {
			return "redirect:validation";
		}
	}
	
	@RequestMapping(path="deletePokemon.do")
	public String deletePokemon() {
		
		
		return "validation";
	}
	
	@RequestMapping(path="updatePokemon.do")
	public String updatePokemon() {
		
		return "validation";
	}

}

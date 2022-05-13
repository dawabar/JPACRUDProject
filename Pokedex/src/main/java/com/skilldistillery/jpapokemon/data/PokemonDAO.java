package com.skilldistillery.jpapokemon.data;

import java.util.List;

import com.skilldistillery.jpapokemon.entities.Pokemon;

public interface PokemonDAO {

	Pokemon findById(int pokemonId);
	List<Pokemon> findAll();
	
}

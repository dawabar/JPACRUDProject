package com.skilldistillery.jpapokemon.data;

import java.util.List;

import com.skilldistillery.jpapokemon.entities.Pokemon;

public interface PokemonDAO {

	Pokemon findById(int pokemonId);

	Pokemon findByNdex(Integer ndex);

	List<Pokemon> findByName(String substring);

	List<Pokemon> findAll();

}

package com.skilldistillery.jpapokemon.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpapokemon.entities.Pokemon;

@Service
@Transactional
public class PokemonDaoJpaImpl implements PokemonDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Pokemon findById(int pokemonId) {
		return em.find(Pokemon.class, pokemonId);
	}

	@Override
	public List<Pokemon> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.skilldistillery.jpapokemon.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.skilldistillery.jpapokemon.entities.Pokemon;

@Service
@Transactional
public class PokemonDaoJpaImpl implements PokemonDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Pokemon findById(int id) {
		return em.find(Pokemon.class, id);
	}

	@Override
	public Pokemon findByNdex(Integer ndex) {
		return em.find(Pokemon.class, ndex);
	}

	@Override
	public List<Pokemon> findByName(String substring) {
		String jpql = "SELECT pokemon FROM Pokemon pokemon WHERE name LIKE '%" + substring + "%'";
		List<Pokemon> pokelist = em.createQuery(jpql, Pokemon.class).getResultList();

		return pokelist;
	}

	@Override
	public List<Pokemon> findAll() {
		String jpql = "SELECT pokemon FROM Pokemon pokemon";
		List<Pokemon> pokedex = em.createQuery(jpql, Pokemon.class).getResultList();

		return pokedex;
	}

}

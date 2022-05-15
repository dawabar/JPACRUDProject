package com.skilldistillery.jpapokemon.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PokemonTest {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	private Pokemon pokemon;
	private List<Pokemon> pokedex;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAPokemon");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		pokemon = null;
		pokedex = null;
	}

	@Test
	@DisplayName("test basic pokemon mappings")
	void test_Pokemon_enumerated_mapping() {
		pokemon = em.find(Pokemon.class, 1);
		assertNotNull(pokemon);
		assertNotNull(pokemon.getName());
		assertEquals(1, pokemon.getNdex());
		assertEquals("Grass", pokemon.getType1());
		assertEquals("Poison", pokemon.getType2());
		assertEquals("Overgrow", pokemon.getAbility1());
		assertEquals(45, pokemon.getHp());
		assertEquals(49, pokemon.getAttack());
		assertEquals(49, pokemon.getDefense());
		assertEquals(65, pokemon.getSpecAttack());
		assertEquals(65, pokemon.getSpecDefense());
		assertEquals(45, pokemon.getSpeed());
		assertEquals(15.2, pokemon.getWeight());
		assertEquals(28, pokemon.getHeight());
		assertEquals("Seed Pokemon", pokemon.getClasstype());
		assertEquals("Monster", pokemon.getEgg1());
		assertEquals("Grass", pokemon.getEgg2());

	}

	@Test
	@DisplayName("test full pokemon database pull")
	void test_Pokedex_full_database_pull() {
		String jpql = "SELECT p FROM Pokemon p ORDER BY p.id";
		pokedex = em.createQuery(jpql, Pokemon.class).getResultList();
		assertNotNull(pokedex);
		assertEquals(50, pokedex.size());

	}
}

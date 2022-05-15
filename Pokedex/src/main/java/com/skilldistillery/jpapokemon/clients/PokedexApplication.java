package com.skilldistillery.jpapokemon.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.skilldistillery.jpapokemon.data.PokemonDaoJpaImpl;
import com.skilldistillery.jpapokemon.entities.Pokemon;

@SpringBootApplication
public class PokedexApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
		PokemonCreate pc = new PokemonCreate();
		
	}
	
	@Component
	class PokemonCreate {

		@Autowired
		private PokemonDaoJpaImpl dao;

		@Override
		public void run() throws Exception {

			Pokemon pokemon = new Pokemon();
			pokemon.setName("Dugtrio");
			pokemon.setNdex(51);
			pokemon.setType1("Ground");
			pokemon.setAbility1("Sand Veil");
			pokemon.setAbility2("Arena Trap");
			pokemon.setSpecAbility("Sand Force");
			pokemon.setHp(35);
			pokemon.setAttack(100);
			pokemon.setDefense(50);
			pokemon.setSpecAttack(50);
			pokemon.setSpecDefense(70);
			pokemon.setSpeed(120);
			pokemon.setWeight(73.4);
			pokemon.setHeight(28);
			pokemon.setClasstype("Mole Pokemon");
			pokemon.setPreEvolution("Diglett");
			
			dao.createPokemon(pokemon);

//			Vehicle tesla = new Vehicle();
//			tesla.setId(UUID.randomUUID());
//			tesla.setVehicleIdentityNumber("Reg#6789");
//			tesla.setMake("Tesla");
//			tesla.setModel("Model S");
//
//			vehicleRepository.save(tesla);
		}
	}


}

package com.skilldistillery.jpapokemon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Integer ndex;
	private String name;
	private String type1;
	private String type2;
	private String ability1;
	private String ability2;

	@Column(name = "spec_ability")
	private String specAbility;

	private Integer hp;
	private Integer attack;
	private Integer defense;

	@Column(name = "spec_attack")
	private Integer specAttack;

	@Column(name = "spec_defense")
	private Integer specDefense;

	private Integer speed;
	private Double weight;
	private Integer height;
	private String dex1;
	private String dex2;
	@Column(name = "class")
	private String classtype;
	@Column(name = "pre_evolution")
	private String preEvolution;
	private String egg1;
	private String egg2;

	public Pokemon() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getNdex() {
		return ndex;
	}

	public void setNdex(Integer ndex) {
		this.ndex = ndex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public String getAbility1() {
		return ability1;
	}

	public void setAbility1(String ability1) {
		this.ability1 = ability1;
	}

	public String getAbility2() {
		return ability2;
	}

	public void setAbility2(String ability2) {
		this.ability2 = ability2;
	}

	public String getSpecAbility() {
		return specAbility;
	}

	public void setSpecAbility(String specAbility) {
		this.specAbility = specAbility;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getSpecAttack() {
		return specAttack;
	}

	public void setSpecAttack(Integer specAttack) {
		this.specAttack = specAttack;
	}

	public Integer getSpecDefense() {
		return specDefense;
	}

	public void setSpecDefense(Integer specDefense) {
		this.specDefense = specDefense;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getDex1() {
		return dex1;
	}

	public void setDex1(String dex1) {
		this.dex1 = dex1;
	}

	public String getDex2() {
		return dex2;
	}

	public void setDex2(String dex2) {
		this.dex2 = dex2;
	}

	public String getClasstype() {
		return classtype;
	}

	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}

	public String getPreEvolution() {
		return preEvolution;
	}

	public void setPreEvolution(String preEvolution) {
		this.preEvolution = preEvolution;
	}

	public String getEgg1() {
		return egg1;
	}

	public void setEgg1(String egg1) {
		this.egg1 = egg1;
	}

	public String getEgg2() {
		return egg2;
	}

	public void setEgg2(String egg2) {
		this.egg2 = egg2;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", ndex=" + ndex + ", name=" + name + ", type1=" + type1 + ", type2=" + type2
				+ ", ability1=" + ability1 + ", ability2=" + ability2 + ", specAbility=" + specAbility + ", hp=" + hp
				+ ", attack=" + attack + ", defense=" + defense + ", specAttack=" + specAttack + ", specDefense="
				+ specDefense + ", speed=" + speed + ", weight=" + weight + ", height=" + height + ", dex1=" + dex1
				+ ", dex2=" + dex2 + ", classtype=" + classtype + ", preEvolution=" + preEvolution + ", egg1=" + egg1
				+ ", egg2=" + egg2 + "]";
	}

}

package com.model.vo;

public class Pokemon {
	private String pokemonName;
	private int pokemonLevel;
	private int pokemonHp;
	private int exp;
	private int	maxExp;
	private int pokemonAtk;
	private int pokemonSpeed;
	private int pokemonGrade;
	public Pokemon(String pokemonName, int pokemonLevel, int pokemonHp, int exp, int maxExp, int pokemonAtk,
			int pokemonSpeed, int pokemonGrade) {
		super();
		this.pokemonName = pokemonName;
		this.pokemonLevel = pokemonLevel;
		this.pokemonHp = pokemonHp;
		this.exp = exp;
		this.maxExp = maxExp;
		this.pokemonAtk = pokemonAtk;
		this.pokemonSpeed = pokemonSpeed;
		this.pokemonGrade = pokemonGrade;
	}
	public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	public int getPokemonLevel() {
		return pokemonLevel;
	}
	public void setPokemonLevel(int pokemonLevel) {
		this.pokemonLevel = pokemonLevel;
	}
	public int getPokemonHp() {
		return pokemonHp;
	}
	public void setPokemonHp(int pokemonHp) {
		this.pokemonHp = pokemonHp;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getMaxExp() {
		return maxExp;
	}
	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}
	public int getPokemonAtk() {
		return pokemonAtk;
	}
	public void setPokemonAtk(int pokemonAtk) {
		this.pokemonAtk = pokemonAtk;
	}
	public int getPokemonSpeed() {
		return pokemonSpeed;
	}
	public void setPokemonSpeed(int pokemonSpeed) {
		this.pokemonSpeed = pokemonSpeed;
	}
	public int getPokemonGrade() {
		return pokemonGrade;
	}
	public void setPokemonGrade(int pokemonGrade) {
		this.pokemonGrade = pokemonGrade;
	}
	@Override
	public String toString() {
		return "Pokemon [pokemonName=" + pokemonName + ", pokemonLevel=" + pokemonLevel + ", pokemonHp=" + pokemonHp
				+ ", exp=" + exp + ", maxExp=" + maxExp + ", pokemonAtk=" + pokemonAtk + ", pokemonSpeed="
				+ pokemonSpeed + ", pokemonGrade=" + pokemonGrade + "]";
	}
	
	
	
}

package com.planets.StarWarsClientApplication.dtos;

public class PlanetDTO {
	
	private String nome;
	
	private String clima;
	
	private String terreno;
	
	private Long qtdAparicoes;
	
	public PlanetDTO() {
		
	}
	
	public PlanetDTO(String nome, String clima, String terreno, Long qtdAparicoes) {
		super();
		this.nome = nome;
		this.clima = clima;
		this.terreno = terreno;
		this.qtdAparicoes = qtdAparicoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	public Long getQtdAparicoes() {
		return qtdAparicoes;
	}

	public void setQtdAparicoes(Long qtdAparicoes) {
		this.qtdAparicoes = qtdAparicoes;
	}
	
	

}

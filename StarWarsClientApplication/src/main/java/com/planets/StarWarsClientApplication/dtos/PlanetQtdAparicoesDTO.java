package com.planets.StarWarsClientApplication.dtos;

public class PlanetQtdAparicoesDTO {
	
	private Long qtdAparicoes;

	public Long getQtdAparicoes() {
		return qtdAparicoes;
	}

	public void setQtdAparicoes(Long qtdAparicoes) {
		this.qtdAparicoes = qtdAparicoes;
	}

	public PlanetQtdAparicoesDTO(Long qtdAparicoes) {
		super();
		this.qtdAparicoes = qtdAparicoes;
	}
	
	public PlanetQtdAparicoesDTO() {
		
	}

}

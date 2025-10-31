package com.senai.musicapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_musicas")
public class Musica {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Size(min = 1, max = 100)
	@Column (name = "titulo")
	private String titulo;
	@NotBlank
	@Column (name = "genero")
	private String genero;
	@Positive
	@NotBlank
	@Column (name = "duracao")
	private double duracao;
	@NotBlank
	@Max (value = 2025, message = "o ano de lançamento não pode ser mais que 2025")
	@Column (name = "ano_lancamento")
	private int anoLancamento;
	
	public Musica() {
		
	}
	public Musica (long id, String titulo, String genero, double duracao, int anoLancamento) {
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.duracao = duracao;
		this.anoLancamento = anoLancamento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	

}

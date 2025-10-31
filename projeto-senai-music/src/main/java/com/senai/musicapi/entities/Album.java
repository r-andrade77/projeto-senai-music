package com.senai.musicapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_album")
public class Album {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@NotBlank
	@Size (min = 3, max = 100, message = "O nome do artista deve ter entre 3 e 100 caracteres")
	@Column (name = "titulo_album", unique = true)
	private String titulo;
	@NotBlank
	@Size (min = 3, max = 100)
	@Column (name = "genero")
	private String genero;
	@Column (name = "qtd_musica")
	private int qtdMusica;
	@Max(value = 2025, message = "o ano de lancamento não pode ser mais que 2025")
	@Column (name = "ano_lancamento")
	private int anoLancamento;
	
	
	public Album() {
		
	}
	public Album (long id, String titulo, String genero, int qtdMusica, int anoLancamento) {
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.qtdMusica = qtdMusica;
		this.anoLancamento = anoLancamento;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public int getQtdMusica() {
		return qtdMusica;
	}
	public void setQtdMusica(int qtdMusica) {
		this.qtdMusica = qtdMusica;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	
	

}

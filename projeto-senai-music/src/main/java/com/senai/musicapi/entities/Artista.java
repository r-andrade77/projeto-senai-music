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
@Table(name = "tb_artistas")
public class Artista {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@NotBlank
	@Size (min = 2, max = 100, message = "O nome do artista deve ter entre 3 e 100 caracteres")
	@Column (name = "nome_artista", unique = true)
	private String nome;
	@NotBlank
	@Size (min = 3, max = 100)
	@Column (name = "genero_musical")
	private String generoMusical;
	@Column (name = "nacionalidade")
	private String nacionalidade;
	@Max(value = 2025, message = "o ano de estreia não pode ser mais que 2025")
	@Column (name = "ano_estreia")
	private int anoEstreia;
	
	public Artista() {
		
	}
	public Artista(long id, String nome, String generoMusical, String nacionalidade, int anoEstreia) {
		this.id = id;
		this.nome = nome;
		this.generoMusical = generoMusical;
		this.nacionalidade = nacionalidade;
		this.anoEstreia = anoEstreia;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGeneroMusical() {
		return generoMusical;
	}
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getAnoEstreia() {
		return anoEstreia;
	}
	public void setAnoEstreia(int anoEstreia) {
		this.anoEstreia = anoEstreia;
	}
	
	
	

}

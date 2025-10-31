package com.senai.musicapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.musicapi.entities.Artista;
import com.senai.musicapi.repositories.ArtistaRepository;

@Service
public class ArtistaService {
	
	@Autowired
	private ArtistaRepository repository;
	
	public Artista salvarArtista(Artista artista) {
		return repository.save(artista);
	}
	
	public List<Artista> listarTodos(){
		return repository.findAll();
	}
	
	public Artista buscarPorId(Long id) {
		Artista artista = repository.findById(id).orElse(null);
		return artista;
	}
	
	public void deletarArtista(Long id) {
		Artista artista = buscarPorId(id);
		repository.delete(artista);
	}
	public Artista atualizarArtista(Long id, Artista novosDados) {
		Artista existente = repository.findById(id).get();
		existente.setNome(novosDados.getNome());
		existente.setAnoEstreia(novosDados.getAnoEstreia());
		existente.setGeneroMusical(novosDados.getGeneroMusical());
		existente.setNacionalidade(novosDados.getNacionalidade());
		return repository.save(existente);
		
		
	}

}

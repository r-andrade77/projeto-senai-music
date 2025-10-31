package com.senai.musicapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.musicapi.entities.Album;
import com.senai.musicapi.repositories.AlbumRepository;

@Service
public class AlbumService {
	
	@Autowired
	private AlbumRepository repository;
	
	public Album salvarAlbum(Album album) {
		return repository.save(album);
	}
	
	public List<Album> listarTodos(){
		return repository.findAll();
	}
	
	public Album buscarPorId(Long id) {
		Album album = repository.findById(id).orElse(null);
		return album;
	}
	
	public void deletarAlbum(Long id) {
		Album album = buscarPorId(id);
		repository.delete(album);
	}
	public Album atualizarAlbum(Long id, Album novosDados) {
		Album existente = repository.findById(id).get();
		existente.setTitulo(novosDados.getTitulo());
		existente.setGenero(novosDados.getGenero());
		existente.setAnoLancamento(novosDados.getAnoLancamento());
		existente.setQtdMusica(novosDados.getQtdMusica());
		return repository.save(existente);
		
		
	}

}

package com.senai.musicapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.musicapi.entities.Musica;
import com.senai.musicapi.repositories.MusicaRepository;

@Service
public class MusicaService {
	
	@Autowired
	private MusicaRepository repository;
	
	public Musica salvarMusica(Musica musica) {
		return repository.save(musica);
	}
	
	public List<Musica> listarTodos(){
		return repository.findAll();
	}
	
	public Musica buscarPorId(Long id) {
		Musica musica = repository.findById(id).orElse(null);
		return musica;
	}
	
	public void deletarMusica(Long id) {
		Musica musica = buscarPorId(id);
		repository.delete(musica);
	}
	public Musica atualizarMusica(Long id, Musica novosDados) {
		Musica existente = repository.findById(id).get();
		existente.setTitulo(novosDados.getTitulo());
		existente.setAnoLancamento(novosDados.getAnoLancamento());
		existente.setGenero(novosDados.getGenero());
		existente.setDuracao(novosDados.getDuracao());
		return repository.save(existente);
		
		
	}

}
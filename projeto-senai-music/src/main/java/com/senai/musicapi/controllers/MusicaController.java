package com.senai.musicapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.musicapi.entities.Musica;
import com.senai.musicapi.services.MusicaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/musicas")
public class MusicaController {
		
			@Autowired
			private MusicaService service;
			
			@PostMapping
			public Musica cadastrar(@Valid @RequestBody Musica musica) {
				return service.salvarMusica(musica);
			}
			@GetMapping
			public List<Musica> listarTodos(){
				return service.listarTodos();
			}
			@GetMapping("/{id}")
			public Musica buscarPorId(@PathVariable Long id) {
				return service.buscarPorId(id);
			}
			
			@DeleteMapping("/{id}")
			public void deletarMusica(@PathVariable Long id) {
				service.deletarMusica(id);
			}
		
		

}



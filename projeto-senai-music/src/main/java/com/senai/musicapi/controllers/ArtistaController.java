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

import com.senai.musicapi.entities.Artista;
import com.senai.musicapi.services.ArtistaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {
		
			@Autowired
			private ArtistaService service;
			
			@PostMapping
			public Artista cadastrar(@Valid @RequestBody Artista artista) {
				return service.salvarArtista(artista);
			}
			@GetMapping
			public List<Artista> listarTodos(){
				return service.listarTodos();
			}
			@GetMapping("/{id}")
			public Artista buscarPorId(@PathVariable Long id) {
				return service.buscarPorId(id);
			}
			
			@DeleteMapping("/{id}")
			public void deletarArtista(@PathVariable Long id) {
				service.deletarArtista(id);
			}
		
		

}



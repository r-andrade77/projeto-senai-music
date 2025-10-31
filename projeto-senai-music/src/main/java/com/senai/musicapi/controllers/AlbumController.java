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

import com.senai.musicapi.entities.Album;
import com.senai.musicapi.services.AlbumService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/album")
public class AlbumController {
		
			@Autowired
			private AlbumService service;
			
			@PostMapping
			public Album album(@Valid @RequestBody Album album) {
				return service.salvarAlbum(album);
			}
			@GetMapping
			public List<Album> listarTodos(){
				return service.listarTodos();
			}
			@GetMapping("/{id}")
			public Album buscarPorId(@PathVariable Long id) {
				return service.buscarPorId(id);
			}
			
			@DeleteMapping("/{id}")
			public void deletarAlbum(@PathVariable Long id) {
				service.deletarAlbum(id);
			}
		
		

}
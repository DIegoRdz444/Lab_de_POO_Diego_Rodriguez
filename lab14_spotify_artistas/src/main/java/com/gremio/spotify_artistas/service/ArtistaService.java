package com.gremio.spotify_artistas.service;

import com.gremio.spotify_artistas.model.Artista;
import com.gremio.spotify_artistas.repository.ArtistaRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaService {

    private final ArtistaRepository repo;

    public ArtistaService(ArtistaRepository repo) {
        this.repo = repo;
    }

    public List<Artista> listarTodos() {
        return repo.findAll();
    }

    public void guardar(Artista artista) {
        repo.save(artista);
    }

    public Artista buscarPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Artista no encontrado"));
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
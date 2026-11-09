package com.gremio.spotify_artistas.repository;

import com.gremio.spotify_artistas.model.Artista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository
        extends JpaRepository<Artista, Long> {
}
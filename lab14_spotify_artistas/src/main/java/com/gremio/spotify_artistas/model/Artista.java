package com.gremio.spotify_artistas.model;

import jakarta.persistence.*;

@Entity
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String genero;

    private String pais;

    private Integer oyentesMensuales;

    public Artista() {
    }

    public Artista(String nombre,
                   String genero,
                   String pais,
                   Integer oyentesMensuales) {

        this.nombre = nombre;
        this.genero = genero;
        this.pais = pais;
        this.oyentesMensuales = oyentesMensuales;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getPais() {
        return pais;
    }

    public Integer getOyentesMensuales() {
        return oyentesMensuales;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setOyentesMensuales(Integer oyentesMensuales) {
        this.oyentesMensuales = oyentesMensuales;
    }
}
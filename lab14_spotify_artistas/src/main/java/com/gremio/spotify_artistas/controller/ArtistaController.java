package com.gremio.spotify_artistas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gremio.spotify_artistas.model.Artista;
import com.gremio.spotify_artistas.service.ArtistaService;

@Controller
public class ArtistaController {

    private final ArtistaService service;

    public ArtistaController(
            ArtistaService service) {

        this.service = service;
    }

    @GetMapping("/artistas")
    public String listar(
            Model model) {

        model.addAttribute(
                "artistas",
                service.listarTodos()
        );

        return "artistas";
    }

    @GetMapping("/nuevo")
    public String formulario(
            Model model) {

        model.addAttribute(
                "artista",
                new Artista()
        );

        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(
            @ModelAttribute Artista artista) {

        service.guardar(artista);

        return "redirect:/artistas";
    }

    @GetMapping("/editar/{id}")
    public String editar(
            @PathVariable Long id,
            Model model) {

        model.addAttribute(
                "artista",
                service.buscarPorId(id)
        );

        return "formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(
            @PathVariable Long id) {

        service.eliminar(id);

        return "redirect:/artistas";
    }
}
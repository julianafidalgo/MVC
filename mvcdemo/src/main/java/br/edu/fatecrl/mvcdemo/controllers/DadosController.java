package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Anime;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/anime")
public class DadosController {
    private static final List<Anime> listaAnime = new ArrayList<Anime>();

    public DadosController(){
        listaAnime.add(new Anime("Erased", 12, "Suspense"));
        listaAnime.add(new Anime("Another", 12, "Terror"));
        listaAnime.add(new Anime("Kimi ni Todoke", 25, "Romance"));
    }

    @GetMapping
    public List<Anime> getAnime(){
        return listaAnime;
    }
}

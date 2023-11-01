package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Anime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/anime")
public class AnimeController {

    private static final List<Anime> listaAnime = new ArrayList<Anime>();

    public AnimeController(){
        listaAnime.add(new Anime("Erased", 12, "Suspense"));
        listaAnime.add(new Anime("Another", 12, "Terror"));
        listaAnime.add(new Anime("Kimi ni Todoke", 25, "Romance"));
    }

    @GetMapping
    public String getAnime(Model model){
        model.addAttribute("animes", listaAnime);
        return "Animes";
    }
}

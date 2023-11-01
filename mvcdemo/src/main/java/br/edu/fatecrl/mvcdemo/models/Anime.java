package br.edu.fatecrl.mvcdemo.models;

import java.util.ArrayList;

public class Anime {
    private String Nome;
    private int Episodios;
    private String Genero;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getEpisodios() {
        return Episodios;
    }

    public void setEpisodios(int episodios) {
        Episodios = episodios;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = Genero;
    }

    public Anime(String Nome, int Episodios, String Genero){
        this.Nome = Nome;
        this.Episodios = Episodios;
        this.Genero = Genero;
    }
}

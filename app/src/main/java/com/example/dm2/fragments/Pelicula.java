package com.example.dm2.fragments;

import java.io.Serializable;

/**
 * Created by dm2 on 08/11/2016.
 */
public class Pelicula implements Serializable{

    private String titulo;
    private int ano;
    private String director;

    public Pelicula(String titulo, int ano, String director) {
        this.titulo = titulo;
        this.ano = ano;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getDirector() {
        return director;
    }
}

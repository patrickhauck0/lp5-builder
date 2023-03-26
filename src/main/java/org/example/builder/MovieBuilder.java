package org.example.builder;

import java.util.Date;
public class MovieBuilder {
    private Movie movie;

    public MovieBuilder() {
        movie = new Movie();
    }

    public Movie build() {
        if (movie.getTitulo().equals("")) {
            throw new IllegalArgumentException("Título inválido");
        }
        if (movie.getDuracao() == 0) {
            throw new IllegalArgumentException("Duração inválida");
        }
        return movie;
    }

    public MovieBuilder setDuracao(int duracao) {
        movie.setDuracao(duracao);
        return this;
    }

    public MovieBuilder setTitulo(String titulo) {
        movie.setTitulo(titulo);
        return this;
    }

    public MovieBuilder setDiretor(String diretor) {
        movie.setDiretor(diretor);
        return this;
    }

    public MovieBuilder setGenero(String genero) {
        movie.setGenero(genero);
        return this;
    }

    public MovieBuilder setSinopse(String sinopse) {
        movie.setSinopse(sinopse);
        return this;
    }

    public MovieBuilder setClassIndicativa(int classIndicativa) {
        movie.setClassIndicativa(classIndicativa);
        return this;
    }

    public MovieBuilder setBilheteria(double bilheteria) {
        movie.setBilheteria(bilheteria);
        return this;
    }

    public MovieBuilder setPaisOrigem(String paisOrigem) {
        movie.setPaisOrigem(paisOrigem);
        return this;
    }

    public MovieBuilder setAvaliacao(int avaliacao) {
        movie.setAvaliacao(avaliacao);
        return this;
    }
}

package org.example.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieBuilderTest {
    @Test
    void deveRetornarExcecaoParaMovieSemTitulo() {
        try{
            MovieBuilder movieBuilder = new MovieBuilder();
            Movie movie = movieBuilder
                    .setDuracao(2)
                    .setGenero("Ação")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Título inválido", e.getMessage());
        }
    }

    @Test
    void getDeveRetornarExcecaoParaMovieSemDuracao() {
        try {
            MovieBuilder movieBuilder = new MovieBuilder();
            Movie movie = movieBuilder
                    .setTitulo("Duro de Matar")
                    .setGenero("Ação")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Duração inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarMovieValido() {
        MovieBuilder movieBuilder = new MovieBuilder();
        Movie movie = movieBuilder
                .setTitulo("Duro de Matar")
                .setDuracao(2)
                .setGenero("Ação")
                .build();

        assertNotNull(movie);
    }
}
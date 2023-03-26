package org.example.builder;

import java.util.Date;
public class Movie {
    private String titulo;
    private String diretor;
    private String genero;
    private String sinopse;
    private int classIndicativa;
    private int duracao;
    private double bilheteria;
    private String paisOrigem;
    private int avaliacao;

    public Movie() {
        this.titulo = "";
        this.duracao = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getClassIndicativa() {
        return classIndicativa;
    }

    public void setClassIndicativa(int classIndicativa) {
        this.classIndicativa = classIndicativa;
    }

    public double getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(double bilheteria) {
        this.bilheteria = bilheteria;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}

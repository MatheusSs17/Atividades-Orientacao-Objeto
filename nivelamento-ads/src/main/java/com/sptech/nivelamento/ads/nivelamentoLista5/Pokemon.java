package com.sptech.nivelamento.ads.nivelamentoLista5;


public class Pokemon {

    private String nome;
    private String tipo;
    private Double forca;
    private Integer doces;

    public Pokemon(String nome, String tipo, Double forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doces = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }

    
    
    @Override
    public String toString() {
        String frase = String.format
        ("Informações do Pokemon\n\nNome: %s\t|Tipo: %s\n"
        + "Força: %.1f\t|Doces: %d\n\n", nome, tipo, forca, doces);
        return frase;
    }
    
    
    
}

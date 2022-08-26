
package com.sptech.nivelamento.ads.nivelamentoLista8;


public class Produto {
    
    private String nome;
    private String categoria;
    private Double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto(String nome, String categoria, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public String toString() {
        String frase = String.format("Dados do Produto\n"
                + "-".repeat(40) + "\n"
                + "Nome: %s\n"
                + "Categoria: %s\n"
                + "Preço: %.2f\n"
                + "-".repeat(40) + "\n\n"
                , nome, categoria, preco);
        return frase;
    }
    
    
    
}

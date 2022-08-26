
package com.sptech.nivelamento.ads.nivelamentoLista8;

import java.util.ArrayList;
import java.util.List;


public class Carrinho {
    
    private String cliente;
    private List<Produto> produto;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produto = new ArrayList<>();
    }
    
    
    public Integer getQuantidade(){
        return produto.size();
    }
        
    
    public void adicionar(Produto p){
        produto.add(p);
    }
    
    
    public Boolean existsPorNome(String nome){
        
        //String conteudo;
        
    for (Produto produtoDaVez : produto) {

        if (produtoDaVez.getNome().equalsIgnoreCase(nome)) {
            //conteudo = nome;
            return true;
        }

    }
            
       return false;
       
    }
    
    
    public Integer getQuantidadePorCategoria(String categoria){
        
        Integer qntdCategoria = 0;
        
        for (Produto produtoDaVez : produto) {
            
            if (produtoDaVez.getCategoria().equalsIgnoreCase(categoria)) {
                qntdCategoria++;    
            }
            
        }
            
       return qntdCategoria;
       
    }
    
    
    public void limpar(){
        produto.clear();
    }
    
    
    public void removerPorNome(String nome){
        for (int i = 0; i < produto.size(); i++) {
            
            if (this.produto.get(i).getNome().equalsIgnoreCase(nome)) {
                System.out.println("Excluindo");
                produto.remove(i);
            }
        }
    }
    
    
    public Produto getPorNome(String nome) {
        
        for (Produto produtoDaVez : produto) {
            
            if (produtoDaVez.getNome().equalsIgnoreCase(nome)) {
                return produtoDaVez;
            }
            
        }
            
        return null;
    }
    
    public Double getValorTotal(){
        
        Double valorTotal = 0.0;
        
        for (Produto produtoDaVez : produto) {
            
            valorTotal += produtoDaVez.getPreco();
            
        }
            
       return valorTotal;
       
    }

    @Override
    public String toString() {
        return String.format("Carrinho\n" + "-".repeat(40) + "\n"
                + "Cliente: %s\n"
                + "Quantidade no Carrinho: %d\n\n"
                , this.cliente, this.produto.size());
    }
    
    
}

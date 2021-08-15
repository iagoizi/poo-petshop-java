/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author danny
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private long id;
    
    /**
     * @return the nome
     */

    public Produto(String nome, double preco, int quantidade, long id) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "" + 
                this.id + "|" + this.nome + "|" + 
                this.preco + "|" + this.quantidade;
    }

    @Override
    public Produto clone(){
        return new Produto(this.getNome(), this.getPreco(), this.getQuantidade(), this.getId()); 
    }
    public boolean equals(Produto prod) {
        return (prod.getId() == this.id);
    }
    
    
    
}

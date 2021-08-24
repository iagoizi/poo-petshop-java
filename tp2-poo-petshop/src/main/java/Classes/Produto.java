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

     /*Construtor de Produto*/
    public Produto(String nome, double preco, int quantidade, long id) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id = id;
    }
    /* getters e setters dos atributos de Produto*/
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getPreco() {
        return preco;
    }

    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public int getQuantidade() {
        return quantidade;
    }

    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    public long getId() {
        return id;
    }

    
    public void setId(long id) {
        this.id = id;
    }
    /* sobrecarga de toString para a classe Produto */
    @Override
    public String toString() {
        return "" + 
                this.id + "|" + this.nome + "|" + 
                this.preco + "|" + this.quantidade;
    }
    /*sobrecarga do método clone, para clocar dois objetos da classe Produto*/
    @Override
    public Produto clone(){
        return new Produto(this.getNome(), this.getPreco(), this.getQuantidade(), this.getId()); 
    }
    /*sobrecarga do método equals, em que dois produtos são iguais, se tiverem o mesmo Id */
    public boolean equals(Object obj) {
        if(!(obj instanceof Produto))return false;
        Produto prod = (Produto) obj;
        return (prod.getId() == this.id);
    }
    
    
    
}

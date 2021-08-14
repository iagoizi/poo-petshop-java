/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Classes.Lib;
/**
 *
 * @author danny
 */
public class Servico {
    private String nome;
    private double preco;
    private long id;
    /**
     * @return the nome
     */
    
    public Servico() {
    }

    public Servico(String nome, double preco, long id) {
        this.nome = nome;
        this.preco = preco;
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

    public String toString() {
        return "" + 
                this.id + "|" + this.nome + "|" + 
                this.preco;
    }
    @Override
    public Servico clone(){
        return new Servico(this.getNome(), this.getPreco(), this.getId()); 
    }
    public boolean equals(Servico servico) {
        return (servico.getId() == this.id);
    }
    
}


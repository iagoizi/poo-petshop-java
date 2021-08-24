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
public class Servico {
    private String nome;
    private double preco;
    private long id;
   
    
    public Servico() {
    }
     /*Construtor de Serviço*/
    public Servico(String nome, double preco, long id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }
    
    /* getters e setters de Serviço*/

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

    
    public long getId() {
        return id;
    }

    
    public void setId(long id) {
        this.id = id;
    }
     /* sobrecarga de toString para a classe Servico*/
    public String toString() {
        return "" + 
                this.id + "|" + this.nome + "|" + 
                this.preco;
    }
    /*sobrecarga do método clone, para clocar dois objetos da classe Servico*/
    @Override
    public Servico clone(){
        return new Servico(this.getNome(), this.getPreco(), this.getId()); 
    }
    /*sobrecarga do método equals, em que dois serviços são iguais, se tiverem o mesmo Id */
    @Override
    public boolean equals(Object obj) {
     if (!(obj instanceof Servico)) return false;
     else{
         Servico comp = (Servico) obj;
         return this.id == comp.getId();
     }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author danny
 */
public class Cliente {
    private String nome;
    private String tipoAnimal;
    private String nomePet;
    private String endereco;
    private long telefone;
    private long cpf;
    ArrayList<Compra> compras;
    
    

    public Cliente() {
        this.nome = "Desconhecido";
        this.tipoAnimal = "-";
        this.nomePet = "-";
        this.endereco = "-";
        this.telefone = -1;
        this.cpf = -1;
        this.compras = new ArrayList<>();
    }
    /*Construtor de Cliente*/
    public Cliente(String nome, String tipoAnimal, String nomePet, String endereco, long telefone, long cpf) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.nomePet = nomePet;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.compras = new ArrayList<>();
    }            
    // getters e setters de Cliente
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getTipoAnimal() {
        return tipoAnimal;
    }

   
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    
    public String getNomePet() {
        return nomePet;
    }

    
    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    
    public String getEndereco() {
        return endereco;
    }

    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   
    public long getTelefone() {
        return telefone;
    }

    
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    
    public long getCpf() {
        return cpf;
    }

    
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }
    /* sobrecarga de toString para a classe Cliente*/
    @Override
    public String toString() {
        return "" + this.nome + " " + this.cpf + " " +
                this.telefone + " " + this.endereco + " " + 
                " " + this.nomePet + " " + this.tipoAnimal + " ";
     }
    /* pega a impressão dos dados das compras de um cliente*/
    public String getDadosCompras(){
        for(Compra comp: this.compras)
           return comp.toString();
        
        return " ";
    }
    /*sobrecarga do método clone, para clonar dois objetos da classe Cliente*/
    @Override
    public Cliente clone(){
         return new Cliente(this.nome, this.tipoAnimal, 
                 this.nomePet, this.endereco, this.telefone, this.cpf);
         
    }
    /*Sobrecarga do método equals, onde dois clientes são iguais, se apresentarem o mesmo cpf*/
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Cliente))return false;
        Cliente comp = (Cliente) obj;
        return this.cpf == comp.getCpf();
    }
    
}

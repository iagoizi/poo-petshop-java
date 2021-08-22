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
    
    /**
     * @return the nome
     */

    public Cliente() {
        this.nome = "Desconhecido";
        this.tipoAnimal = "-";
        this.nomePet = "-";
        this.endereco = "-";
        this.telefone = -1;
        this.cpf = -1;
        this.compras = new ArrayList<>();
    }

    public Cliente(String nome, String tipoAnimal, String nomePet, String endereco, long telefone, long cpf) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.nomePet = nomePet;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.compras = new ArrayList<>();
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
     * @return the tipoAnimal
     */
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    /**
     * @param tipoAnimal the tipoAnimal to set
     */
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    /**
     * @return the nomePet
     */
    public String getNomePet() {
        return nomePet;
    }

    /**
     * @param nomePet the nomePet to set
     */
    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public long getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cpf
     */
    public long getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "" + this.nome + " " + this.cpf + " " +
                this.telefone + " " + this.endereco + " " + 
                " " + this.nomePet + " " + this.tipoAnimal + " ";
     }
    public String getDadosCompras(){
        for(Compra comp: this.compras)
           return comp.toString();
        
        return " ";
    }
    @Override
    public Cliente clone(){
         return new Cliente(this.nome, this.tipoAnimal, 
                 this.nomePet, this.endereco, this.telefone, this.cpf);
         
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Cliente))return false;
        Cliente comp = (Cliente) obj;
        return this.cpf == comp.getCpf();
    }
    
}

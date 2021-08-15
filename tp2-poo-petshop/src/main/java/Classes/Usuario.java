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
 * @author vitor
 */
public class Usuario {
    protected PetShop petshop;
    protected String nome;
    protected TipoFuncionario cargo;
    protected String usuario;
    protected String senha;
    protected double salario;
    public Cliente[] Cliente; /*não lembro se inicializa kk*/
    
    public Usuario(PetShop petshop, String nome, TipoFuncionario cargo, String usuario, String senha,double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.usuario = usuario;
        this.senha = senha;
        this.salario = salario;
    }
    
    /**
     * @return the nome
     */
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
     * @return the cargo
     */
    public TipoFuncionario getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(TipoFuncionario cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Cliente buscarCadastro(long cpf, boolean sucess){
        for(Cliente clientes : petshop.getClientes()){
            if(clientes.getCpf() == cpf){
                sucess = true;
                return clientes;
            }
        }
        sucess = false;
        return null;  
    }
    
}    

 

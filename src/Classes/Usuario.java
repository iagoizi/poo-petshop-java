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
    /*criando os atributos que serão usados*/
    protected PetShop petshop;
    protected String nome;
    protected TipoFuncionario cargo;
    protected String usuario;
    protected String senha;
    protected double salario;
    
    /*criando o construtor da classse*/
    public Usuario(PetShop petshop, String nome, TipoFuncionario cargo, String usuario, String senha,double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.usuario = usuario;
        this.senha = senha;
        this.salario = salario;
        this.petshop = petshop;
    }
    
    /* 
        os métodos gets retornam os dados
        os métodos sets fazem as alterações dos dados
    */
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoFuncionario getCargo() {
        return cargo;
    }

    public void setCargo(TipoFuncionario cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    /*método responsável por buscar um cadastro de um determinado cliente*/
    public Cliente buscarCadastro(long cpf){
        //percorre o vetor de clientes contido no petshop
        for(Cliente clientes : petshop.getClientes()){
            //realiza a comparação por meio do cpf. sendo verdadeiro, retorna o cliente. sendo falso, retorna null.
            if(clientes.getCpf() == cpf){
                return clientes;
            }
        }

        return null;  
    }

    @Override
    public String toString() {
        return "Usuario{" + "petshop=" + petshop + ", nome=" + nome + ", cargo=" + cargo + ", usuario=" + usuario + ", senha=" + senha + ", salario=" + salario + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Usuario)) return false;
        Usuario comp = (Usuario) obj;
        return this.usuario.equalsIgnoreCase(comp.getUsuario());
    }
    
    
    
}    

 

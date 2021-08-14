/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author iagoi
 */
public class Compra {
    private String descricao;
    Data data;
    double preco;

    public Compra(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
        this.data = new Data();
    }    
    
    public Compra(String descricao, Data data, double preco) {
        this.descricao = descricao;
        this.data = data;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Compra{" + "descricao=" + descricao + ", data=" + data + ", preco=" + preco + '}';
    }
    
    public void pagar(){
        this.data.now();
    }
    
}

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
public class Conta {
    private String descricao;
    private Data dataVencimento;
    private Data dataPagamento;
    private double valor;

    public Conta(String descricao, Data dataVencimento, double valor) {
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.dataPagamento = new Data();
    }
    
    public Conta(String descricao, Data dataVencimento, Data dataPagamento, double valor) {
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Data getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Data dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Data getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Data dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Conta{" + "descricao=" + descricao + ", dataVencimento=" + dataVencimento + ", dataPagamento=" + dataPagamento + ", valor=" + valor + '}';
    }
    
    public void pagar(){
        this.dataPagamento.now();
    }
    
}

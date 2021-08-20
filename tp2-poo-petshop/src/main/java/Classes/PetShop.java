/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Telas.TelaDeProdutos;
import java.util.ArrayList;
import Telas.TelaMenuVendedor;
import Telas.TelaMenuAdministrador;
import Telas.TelaMenuVeterinario;
import java.util.Stack;
import javax.swing.JFrame;

/**
 *
 * @author iagoi
 */
public class PetShop {

    private String nome;
    private Usuario sessaoAtual;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Cliente> clientes;
    private ArrayList<Conta> contas;
    private ArrayList<Produto> produtos;
    private ArrayList<Servico> servicos;
    private ArrayList<OrdemServico> ordemServicos;
    private ArrayList<OrdemServico> historicoServicos;
    private ArrayList<Compra> compras;
    private ArrayList<Compra> vendas;
    private Stack<JFrame> historicoTelas;

    public PetShop(String nome) {
        this.nome = nome;
        this.usuarios = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.servicos = new ArrayList<>();
        this.ordemServicos = new ArrayList<>();
        this.historicoServicos = new ArrayList<>();
        this.compras = new ArrayList<>();
        this.vendas = new ArrayList<>();
        this.historicoTelas = new Stack<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }

    public ArrayList<OrdemServico> getOrdemServicos() {
        return ordemServicos;
    }

    public void setOrdemServicos(ArrayList<OrdemServico> ordemServicos) {
        this.ordemServicos = ordemServicos;
    }

    public ArrayList<OrdemServico> getHistoricoServicos() {
        return historicoServicos;
    }

    public void setHistoricoServicos(ArrayList<OrdemServico> historicoServicos) {
        this.historicoServicos = historicoServicos;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public ArrayList<Compra> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Compra> vendas) {
        this.vendas = vendas;
    }

    public Usuario getSessaoAtual() {
        return this.sessaoAtual;
    }

    public boolean login(String usuario, String senha) {
        for (Usuario item : this.usuarios) {
            if (item.getUsuario().equals(usuario) && item.getSenha().equals(senha)) {
                this.sessaoAtual = item;

                switch (item.getCargo()) {
                    case VENDEDOR: {
                        irPara(new TelaMenuVendedor(this));
                        break;
                    }
                    case VETERINARIO: {
                        irPara(new TelaMenuVeterinario(this));
                        break;
                    }
                    case ADMINISTRADOR: {
                        irPara(new TelaMenuAdministrador(this));
                        break;
                    }

                }
                return true;
            }
        }
        return false;
    }

    void logOut() {
        //chama método para salvar informações em arquivo
    }

    public void irPara(JFrame destino) {
        if (!this.historicoTelas.empty()) {
            
            this.historicoTelas.lastElement().setVisible(false);
        }
        destino.setVisible(true);
        this.historicoTelas.push(destino);
    }

    public void voltar() {
        this.historicoTelas.pop().setVisible(false);
        if (this.historicoTelas.empty()) {
            return;
        }
        this.historicoTelas.lastElement().setVisible(true);
    }
}

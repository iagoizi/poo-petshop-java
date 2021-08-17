/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.OrdemServico;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author iagoi
 */

public class ModeloTabelaOrdemServico extends AbstractTableModel {

    private ArrayList<OrdemServico> listaOrdens;
    private boolean incluirObservacao;

    public ModeloTabelaOrdemServico(boolean incluirObservacao) {
        this.listaOrdens = new ArrayList<>();
        this.incluirObservacao = incluirObservacao;
    }

    public ArrayList<OrdemServico> getListaOrdens() {
        return listaOrdens;
    }

    public void setListaOrdens(ArrayList<OrdemServico> listaOrdens) {
        this.listaOrdens = listaOrdens;
    }

    public boolean isIncluirObservacao() {
        return incluirObservacao;
    }

    public void setIncluirObservacao(boolean incluirObservacao) {
        this.incluirObservacao = incluirObservacao;
    }
    
    @Override
    public int getRowCount() {
        return this.listaOrdens.size();
    }

    @Override
    public int getColumnCount() {
        return this.incluirObservacao ? 5 : 4;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:{
                return this.listaOrdens.get(linha).getId();
            }
            case 1:{
                return this.listaOrdens.get(linha).getServico();
            }
             case 2:{
                return this.listaOrdens.get(linha).getServico();
            }
             case 3:{
                return this.listaOrdens.get(linha).getData();
            }
             case 4:{
                return this.incluirObservacao? this.listaOrdens.get(linha).getObservacao() : null;
            }
        }
        return null;
    }

    @Override
    public String getColumnName(int coluna){
        switch(coluna){
            case 0:{
                return "Id";
            }
            case 1:{
                return "Id serviço";
            }
             case 2:{
                return "Serviço";
            }
             case 3:{
                return "Data";
            }
             case 4:{
                return this.incluirObservacao ? "Tratamento" : null;
            }
        }
        return null;
    }
    
    
}

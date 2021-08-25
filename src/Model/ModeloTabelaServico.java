/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.Servico;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danny
 */
public class ModeloTabelaServico extends AbstractTableModel{
    private ArrayList<Servico> listaServico;
    /**
     * @return the listaServico
     */
    public ArrayList<Servico> getListaServico() {
        return listaServico;
    }

    /**
     * @param listaServico the listaServico to set
     */
    public void setListaServico(ArrayList<Servico> listaServico) {
        this.listaServico = listaServico;
    }
    

    public ModeloTabelaServico() {
        this.listaServico = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return this.getListaServico().size();
    }
     
    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:{
                return this.getListaServico().get(linha).getId();
            }
            case 1:{
                return this.getListaServico().get(linha).getNome();
            }
             case 2:{
                return this.getListaServico().get(linha).getPreco();
            }
        }
        return null;
    }
     @Override
    public String getColumnName(int coluna) {
        switch(coluna){
            case 0:{
                return "ID";
            }
            case 1:{
                return "Nome";
            }
             case 2:{
                return "Preço";
            }  
        }
        return null;
    }
}

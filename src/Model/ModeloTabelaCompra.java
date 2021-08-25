/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.Compra;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author iagoi
 */
public class ModeloTabelaCompra extends AbstractTableModel {

    private ArrayList<Compra> listaCompras;

    public ModeloTabelaCompra() {
        this.listaCompras = new ArrayList<>();
    }

    public ArrayList<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(ArrayList<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    
    @Override
    public int getRowCount() {
        return this.listaCompras.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:{
                return this.listaCompras.get(linha).getData();
            }
            case 1:{
                return this.listaCompras.get(linha).getDescricao();
            }
             case 2:{
                return this.listaCompras.get(linha).getPreco();
            }
        }
        return null;
    }

    @Override
    public String getColumnName(int coluna) {
        switch(coluna){
            case 0:{
                return "Data";
            }
            case 1:{
                return "Descrição";
            }
            case 2:{
                return "Preço";
            }   
        }
        return null;
    }
    
    
}

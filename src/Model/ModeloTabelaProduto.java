/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.Produto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danny
 */
public class ModeloTabelaProduto extends AbstractTableModel{
    private ArrayList<Produto> listaProduto;
     /**
     * @return the listaProduto
     */
    public ArrayList<Produto> getListaProduto() {
        return listaProduto;
    }

    /**
     * @param listaProduto the listaProduto to set
     */
    public void setListaProduto(ArrayList<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
    @Override
    public int getRowCount() {
        return getListaProduto().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:{
                return this.getListaProduto().get(linha).getId();
            }
            case 1:{
                return this.getListaProduto().get(linha).getNome();
            }
            case 2:{
                return this.getListaProduto().get(linha).getPreco();
            }
            case 3:{
                return this.getListaProduto().get(linha).getQuantidade();
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
             case 3:{
                return "Quantidade";
            }
        }
        return null;
    }
    
}

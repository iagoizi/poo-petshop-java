/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.Conta;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author iagoi
 */
public class ModeloTabelaConta extends AbstractTableModel {

    private ArrayList<Conta> listaContas;

    public ModeloTabelaConta() {
        this.listaContas = new ArrayList<>();
    }

    public ArrayList<Conta> getListaContas() {
        return listaContas;
    }

    public void setListaContas(ArrayList<Conta> listaContas) {
        this.listaContas = listaContas;
    }

    
    @Override
    public int getRowCount() {
        return this.listaContas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:{
                return this.listaContas.get(linha).getDataPagamento();
            }
            case 1:{
                return this.listaContas.get(linha).getDataVencimento();
            }
             case 2:{
                return this.listaContas.get(linha).getDescricao();
            }
            case 3:{
                return this.listaContas.get(linha).getValor();
            }   
        }
        return null;
    }

    @Override
    public String getColumnName(int coluna) {
        switch(coluna){
            case 0:{
                return "Pagamento";
            }
            case 1:{
                return "Vencimento";
            }
             case 2:{
                return "Descrição";
            }
            case 3:{
                return "Preço";
            }   
        }
        return null;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danny
 */
public class ModeloTabelaCliente extends AbstractTableModel{
    private ArrayList<Cliente> listaCliente;

    /**
     * @return the listaCliente
     */
    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    /**
     * @param listaCliente the listaCliente to set
     */
    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
    
    

    @Override
    public int getRowCount() {
        return getListaCliente().size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:{
                return this.getListaCliente().get(linha).getNome();
            }
            case 1:{
                return this.getListaCliente().get(linha).getCpf();
            }
             case 2:{
                return this.getListaCliente().get(linha).getEndereco();
            }
             case 3:{
                return this.getListaCliente().get(linha).getNomePet();
            }
             case 4:{
                return this.getListaCliente().get(linha).getTipoAnimal();
            }
             case 5:{
                return this.getListaCliente().get(linha).getDadosCompras();
            }
        }
        return null;
    }
   @Override
    public String getColumnName(int coluna) {
        switch(coluna){
            case 0:{
                return "Nome";
            }
            case 1:{
                return "CPF";
            }
             case 2:{
                return "Endereço";
            }
             case 3:{
                return "Nome do Pet";
            }
             case 4:{
                return "Tipo do Animal";
            }
             case 5:{
                return "Compras";
            }
        }
        return null;
    }
    
}

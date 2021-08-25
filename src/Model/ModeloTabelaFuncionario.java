/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.Usuario;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danny
 */
public class ModeloTabelaFuncionario  extends AbstractTableModel{
    private ArrayList<Usuario> listaUsuario;

    /**
     * @return the listaUsuario
     */
    public ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    /**
     * @param listaUsuario the listaUsuario to set
     */
    public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    

    /**
     * @return the listaCliente
     */
   

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:{
                return this.getListaUsuario().get(linha).getNome();
            }
            case 1:{
                return this.getListaUsuario().get(linha).getUsuario();
            }
            case 2:{
                return this.getListaUsuario().get(linha).getSalario();
            }
            case 3:{
                return this.getListaUsuario().get(linha).getCargo();
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
                return "Usuário";
            }
            case 2:{
                return "Salário";
            }
            case 3:{
                return "Cargo";
            }
        }
        return null;
    }

    @Override
    public int getRowCount() {
        return listaUsuario.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
}


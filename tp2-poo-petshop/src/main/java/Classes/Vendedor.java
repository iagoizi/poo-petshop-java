/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.InterfaceVendedor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class Vendedor extends Usuario implements InterfaceVendedor{

    public Vendedor(PetShop petshop, String nome, String usuario, String senha, double salario) {
        super(petshop, nome, TipoFuncionario.VENDEDOR, usuario, senha, salario);
    }
   
}

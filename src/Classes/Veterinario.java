/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Interfaces.InterfaceVeterinario;

/**
 *
 * @author danilo
 */

//criação da classe Veterinario, sendo especificado que ela herda da classe usuario
//e suas funcionalidades estão em InterfaceVeterinario
public class Veterinario extends Usuario implements InterfaceVeterinario{
    //construturo de veterinario
    public Veterinario(PetShop petshop, String nome,  String usuario, String senha, double salario) {
        super(petshop, nome, TipoFuncionario.VETERINARIO, usuario, senha, salario);
    }
}


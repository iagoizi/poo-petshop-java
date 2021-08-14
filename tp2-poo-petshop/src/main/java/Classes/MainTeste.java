/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author danny
 */
public class MainTeste {
    private ArrayList<Cliente> cliente;

    public MainTeste(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    public MainTeste() {
    }
    
    /**
     * @return the cliente
     */
    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        String nome, tipoAnimal, nomePet, endereco;
        long telefone, cpf;
        System.out.println("Nome:");
        nome = entrada.nextLine();
        System.out.println("Tipo de animal:");
        tipoAnimal = entrada.nextLine();
        System.out.println("Nome do pet:");
        nomePet = entrada.nextLine();
        System.out.println("Endereço:");
        endereco = entrada.nextLine();
        System.out.println("Telefone:");
        telefone = entrada.nextLong();
        System.out.println("CPF:");
        cpf = entrada.nextLong();
        
        Cliente cliente1 = new Cliente(nome, tipoAnimal, nomePet, endereco, cpf, telefone);
        Cliente cliente2 = new Cliente("Belo", "Gato", "Lorenzinho", "Rua Pioedosa", 2133321, 577415);
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        System.out.println("Dados: ");
        Cliente clone = cliente2.clone();
        clientes.add(clone);
        // teste de clonegem profunda:
        clone.setNome("Nome do clone mudado");
        clone.setNomePet("Pet do clone");
        
        for(Cliente cli:  clientes){
            System.out.println(cli.toString());
        }
    }
}

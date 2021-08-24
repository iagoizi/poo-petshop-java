/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class Lib {
    final int M = 51;
    final int MD10 = 501;
    /**
 * Realiza testes manuais para averiguar o funcionamento
 * @return petshop - Petshop com valores de teste
 */
    public static PetShop testesManuais(){
        PetShop petshop = new PetShop("Puppy cat");
        Administrador admin = new Administrador(petshop, "Lore", "admin", "admin", 5000.0);
        Veterinario veterinario = new Veterinario(petshop, "Julia", "vet", "vet", 3000.0);
        Vendedor vendedor = new Vendedor(petshop, "Patricia", "vend", "vend", 3000.0);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(admin);
        usuarios.add(veterinario);
        usuarios.add(vendedor);
        petshop.setUsuarios(usuarios);
        
        //petshop.login("admin", "admin");
        
        Cliente cliente = new Cliente("Belo", "Gato", "Lorenzinho", "Rua Pioedosa", 2133321, 577415);
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        petshop.setClientes(clientes);
        
        petshop.getContas().add(new Conta("Conta de luz", new Data(11, 12, 2021), new Data(10, 12, 2021), 33.3));
        petshop.getContas().add(new Conta("Conta de água", new Data(25, 12, 2021), new Data(22, 12, 2021), 555));

        petshop.getCompras().add(new Compra("Ferramenta X", new Data(25, 12, 2021), 35.9));
        petshop.getCompras().add(new Compra("Abobrinha ", new Data(12, 12, 2021), 769));

        petshop.getVendas().add(new Compra("Negócio de dog", new Data(25, 12, 2021), 35.9));
        petshop.getVendas().add(new Compra("Ração", new Data(12, 12, 2021), 769));
        petshop.getVendas().add(new Compra("Bala", new Data(12, 12, 2021), 769));
        petshop.getVendas().add(new Compra("Alguma coisa", new Data(12, 12, 2021), 769));
        petshop.getVendas().add(new Compra("Semente", new Data(12, 12, 2021), 769));
        
        petshop.getProdutos().add(new Produto("Ração", 15, 55, 1));
        petshop.getProdutos().add(new Produto("Bala", 5, 56, 2));
        
        petshop.getClientes().add(new Cliente("João", "Cachorro", "Rex", "Rua Viegas", 9999, 111));
        Cliente cliente2 = new Cliente("Maria", "Hamister", "Nino", "Rua Lourdes", 122623, 123);
        petshop.getClientes().add(cliente2); 
                
        ArrayList<Servico> servicos = new ArrayList<>();
        servicos.add(new Servico("Banho", 100, 100));
        servicos.add(new Servico("Consulta", 100, 0));
        petshop.setServicos(servicos);
        
        petshop.getOrdemServicos().add(new OrdemServico(new Servico("Consulta", 50.0, 0), cliente, new Data(12, 12, 2021), 0, ""));
        petshop.getOrdemServicos().add(new OrdemServico(new Servico("Banho", 100.0, 1), cliente2, new Data(13, 7, 2021), 1, ""));
        petshop.getOrdemServicos().add(new OrdemServico(new Servico("Tosa", 150.0, 2), petshop.getClientes().get(1), new Data(20, 8, 2021), 2, ""));
        petshop.getOrdemServicos().add(new OrdemServico(new Servico("Tosa", 150.0, 3), petshop.getClientes().get(2), new Data(30, 11, 2021), 3, ""));

        

        return petshop;
    }
}

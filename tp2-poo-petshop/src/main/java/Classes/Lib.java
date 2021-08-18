/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

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
        PetShop petshop = new PetShop("s");
        Administrador admin = new Administrador(petshop, "samira", "samira", "samira", 1.0);
        Vendedor vend = new Vendedor(petshop, "vend", "vend", "vend", 55.5);
        petshop.getUsuarios().add(admin);
        petshop.getUsuarios().add(vend);
        petshop.login("samira", "samira");
        petshop.getContas().add(new Conta("Conta de luz", new Data(11, 12, 2021), new Data(10, 12, 2021), 33.3));
        petshop.getContas().add(new Conta("Conta de água", new Data(25, 12, 2021), new Data(22, 12, 2021), 555));

        petshop.getCompras().add(new Compra("Ferramenta X", new Data(25, 12, 2021), 35.9));
        petshop.getCompras().add(new Compra("Abobrinha ", new Data(12, 12, 2021), 769));

        petshop.getVendas().add(new Compra("Negócio de dog", new Data(25, 12, 2021), 35.9));
        petshop.getVendas().add(new Compra("Ração", new Data(12, 12, 2021), 769));
        petshop.getVendas().add(new Compra("Bala", new Data(12, 12, 2021), 769));
        petshop.getVendas().add(new Compra("Alguma coisa", new Data(12, 12, 2021), 769));
        petshop.getVendas().add(new Compra("Semente", new Data(12, 12, 2021), 769));
        return petshop;
    }
}

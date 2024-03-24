/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package att7;

import classes.GerenciadorDePedidos;
import entidades.Cliente;
import entidades.Pedidos;
import entidades.Produto;

/**
 *
 * @author igorxf
 */
public class Att7 {
    public static void main(String[] args) {
        GerenciadorDePedidos gerenciador = new GerenciadorDePedidos();
        Cliente cliente1 = new Cliente("João");
        Pedidos pedido1 = new Pedidos("001", cliente1);
        pedido1.addProduto(new Produto("Coca-Cola", 5.0));
        gerenciador.adicionarPedido(pedido1);

        System.out.println("Total de pedidos: " + gerenciador.totalPedidos());
        System.out.println("Faturamento total: " + gerenciador.faturamentoTotal());
        // Implementações dos outros métodos não estáticos...
    }
    
}

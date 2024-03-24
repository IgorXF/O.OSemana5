/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import entidades.Pedidos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class GerenciadorDePedidos {
    private List<Pedidos> todosPedidos = new ArrayList<>();

    public void adicionarPedido(Pedidos pedido) {
        todosPedidos.add(pedido);
    }

    public int totalPedidos() {
        return todosPedidos.size();
    }

    public double faturamentoTotal() {
        double total = 0.0;
        for (Pedidos pedido : todosPedidos) {
            total += pedido.valorTotal();
        }
        return total;
    }
}

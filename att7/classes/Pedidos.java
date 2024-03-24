/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class Pedidos {
    private String codigo;
    private Cliente cliente;
    private List<Produto> compra = new ArrayList<>();

    public Pedidos(String codigo, Cliente cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
    }

    public void addProduto(Produto produto) {
        compra.add(produto);
    }

    public void removerProduto(String nome) {
        for (Produto p : compra) {
            if (p.getNome().equals(nome)) {
                compra.remove(p);
            }
        }
    }

    public double valorTotal() {
        double soma = 0.0;
        for (Produto p : compra) {
            soma = soma + p.getPreco();
        }
        return soma;
    }

}

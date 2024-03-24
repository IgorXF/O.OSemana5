/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package att6;

import classes.ContaB;
import entidade.Cliente;

/**
 *
 * @author igorxf
 */
public class Att6 {
    
    public static void main(String[] args) {
        ContaB conta = new ContaB(0.0, 157, "BB", 01);
        Cliente cliente = new Cliente(conta, "Carlo", "54321-0");
        
        cliente.depositar();
        cliente.depositar();
        
        cliente.exibirSaldo();
    }
    
}

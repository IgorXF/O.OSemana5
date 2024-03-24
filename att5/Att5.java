/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package att5;

import classes.Carro;
import classes.Motorista;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Att5 {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca", 1970, "verde");

        Motorista motorista = new Motorista();
        motorista.setNome("Jose Rui");
        motorista.setCarro(meuCarro);

        motorista.dirigir();
        motorista.imprimir();
        
        Scanner scanner = new Scanner(System.in);
        Motorista motorista2 = criarPreencherMotorista(scanner);
        motorista2.dirigir();
        motorista2.imprimir();
    }
    
    public static Motorista criarPreencherMotorista(Scanner scanner) {
        System.out.println("------ Preenchendo o motorista -----");

        System.out.print("Nome:");
        String nome = scanner.next();
        
        Carro carro = criarPreencherCarro(scanner);
        
        Motorista motorista = new Motorista(nome, carro);
        return motorista;
    }
    
     public static Carro criarPreencherCarro(Scanner scanner) {
        System.out.println("------ Preenchendo os dados do Carro -----");

        System.out.print("Modelo:");
        String modelo = scanner.next();

        System.out.print("Ano de fabricacao:");
        int ano = scanner.nextInt();

        System.out.print("Cor:");
        String cor = scanner.next();
        
        Carro carro = new Carro(modelo, ano, cor);
        return carro;
    }   
}

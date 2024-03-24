/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import classes.ContaB;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */

public class Cliente {
    private ContaB conta;
    private String nome;
    private String cpf;
    
    public Cliente(){
        this.conta = new ContaB();
        this.nome = "";
        this.cpf = "";
    }
    
    public Cliente(ContaB conta, String nome, String cpf){
        this.conta = conta;
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + 
                "conta=" + conta + 
                ", nome=" + nome + 
                ", cpf=" + cpf + 
                '}';
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    public void depositar(){
        Scanner ler = new Scanner(System.in);
        double valorDeposito = 0.0;
        double saldoAtualizado = 0.0;
        System.out.println("Digite o valor que deseja depositar: ");
        valorDeposito = ler.nextDouble();
        saldoAtualizado = valorDeposito + this.conta.getSaldo();
        this.conta.setSaldo(saldoAtualizado);
    }
    
    public void exibirSaldo(){
        System.out.println(this.conta.getSaldo() + "reais");
    }
    

    public ContaB getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setConta(ContaB conta) {
        this.conta = conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.conta);
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.conta, other.conta);
    }
}


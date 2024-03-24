/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import entidade.Carro;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Proprietario {
    private String nome;
    private String cpf;
    private String email;
    private Carro[]  car = new Carro[2];
    
    public Proprietario() {
        this.nome = "";
        this.cpf = "";
        this.email = "";
        
        for(int i = 0; i <2 ; i++){
            this.car[i] = new Carro();
        }
    }

    public Proprietario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        
        for(int i = 0; i <2 ; i++){
            this.car[i] = new Carro();
        }
    }
    
     public void preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.println("--- Informe os dados do proprirtario ---");
        System.out.print("Nome:");
        this.setNome(ler.next());
        System.out.print("CPF:");
        this.setCpf(ler.next());
        System.out.print("Email:");
        this.setEmail(ler.next());


        for (int i = 0; i < 2; i++) {
            this.getCar()[i].preencher();
        }
     }
     
     public void copiar(Proprietario outro) {
        this.nome = outro.nome;
        this.cpf = outro.cpf;
        this.email = outro.email;
        
        for(int i = 0; i <2 ; i++){
          Carro c1 = outro.getCar() [i];
          this.car[i].copiar(c1);
        }
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Carro[] getCar() {
        return car;
    }

    public void setCar(Carro[] car) {
        this.car = car;
    }
    
    @Override
    public String toString(){
        String texto = "Nome: " + this.nome + "\n";
        texto += "CPF: " + this.cpf + "\n";
        texto += "Email: " + this.email + "\n";
        texto += "Carro: " + this.car + "\n";
        return texto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.cpf);
        hash = 41 * hash + Objects.hashCode(this.email);
        hash = 41 * hash + Arrays.deepHashCode(this.car);
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
        final Proprietario other = (Proprietario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Arrays.deepEquals(this.car, other.car);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Objects;

/**
 *
 * @author igorxf
 */
public class Motorista {

    private String nome;
    private Carro carro;

    // construtor
    public Motorista() {
        this.nome = "";
        this.carro = new Carro();
    }

    public Motorista(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }

    public void imprimir() {
        System.out.println(this);
    }                

    @Override
    public String toString() {
        return "Motorista{" + "nome=" + getNome() 
                + ", carro=" + carro 
                + '}';
    }

    public void dirigir() {
        System.out.println("Dirigindo o carro " + carro.getModelo());
        carro.buzinar();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.getNome());
        hash = 97 * hash + Objects.hashCode(this.carro);
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
        final Motorista other = (Motorista) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.carro, other.carro);
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return this.carro;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}



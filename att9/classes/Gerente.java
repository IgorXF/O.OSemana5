/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author igorxf
 */
public class Gerente {
    private String nome;
    private String id;
    private double salario;
    private String areaGerencia;

    // Construtor
    public Gerente(String nome, String id, double salario, String areaGerencia) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.areaGerencia = areaGerencia;
    }
    
    public Gerente() {
        this.nome = "";
        this.id = "";
        this.salario = 0.0;
        this.areaGerencia = "";
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAreaGerencia() {
        return areaGerencia;
    }

    public void setAreaGerencia(String areaGerencia) {
        this.areaGerencia = areaGerencia;
    }
}

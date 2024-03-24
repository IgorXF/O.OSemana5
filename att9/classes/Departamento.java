/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author igorxf
 */
public class Departamento {

    private String nomeDepartamento;
    private Gerente gerente;
    private List<Funcionarios> funcionarios;

    public Departamento() {
        this.nomeDepartamento = "";
        this.gerente = new Gerente();
        this.funcionarios = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            this.funcionarios.add(new Funcionarios());
        }
    }

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }
    
    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

   
    public void adicionarFuncionario(Funcionarios funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionarios funcionario) {
        this.funcionarios.remove(funcionario);
    }
    

    @Override
    public String toString() {
        return "Departamento{" +
                "nomeDepartamento=" + nomeDepartamento +
                ", gerente=" + gerente +
                ", funcionarios=" + funcionarios + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nomeDepartamento);
        hash = 59 * hash + Objects.hashCode(this.gerente);
        hash = 59 * hash + Objects.hashCode(this.funcionarios);
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
        final Departamento other = (Departamento) obj;
        if (!Objects.equals(this.nomeDepartamento, other.nomeDepartamento)) {
            return false;
        }
        if (!Objects.equals(this.gerente, other.gerente)) {
            return false;
        }
        return Objects.equals(this.funcionarios, other.funcionarios);
    }
        
}


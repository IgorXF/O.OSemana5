/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import classes.Disciplina;
import java.util.Objects;

/**
 *
 * @author igorxf
 */
public class Professor {
    private String nome;
    private String sexo;
    private int idade;
    private String cpf;
    private Disciplina disciplina;

    public Professor(String nome, String sexo, int idade, String cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
        this.disciplina = new Disciplina();
    }

    public Professor() {
        this.nome = "";
        this.sexo = "";
        this.idade = 0;
        this.cpf = "";
    }
    
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.sexo);
        hash = 29 * hash + this.idade;
        hash = 29 * hash + Objects.hashCode(this.cpf);
        hash = 29 * hash + Objects.hashCode(this.disciplina);
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
        final Professor other = (Professor) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.disciplina, other.disciplina);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome=" + nome +
                ", sexo=" + sexo +
                ", idade=" + idade +
                ", cpf=" + cpf +
                ", disciplina=" + disciplina + '}';
    }
    
    
}

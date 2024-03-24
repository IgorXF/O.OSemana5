/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author igorxf
 */

public class Aluno {
    private String nome;
    private char sexo;
    private int idade;
    private String cpf;
    private String matricula;
    private int anoIngresso;

    public Aluno() {
    }

    public Aluno(String nome, char sexo, int idade, String cpf, String matricula, int anoIngresso) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }

    public Aluno(Aluno copia){
        this.nome = copia.getNome();
        this.sexo = copia.getSexo();
        this.idade = copia.getIdade();
        this.cpf = copia.getCpf();
        this.matricula = copia.getMatricula();
        this.anoIngresso = copia.getAnoIngresso();
    }
    public int getAnoIngresso() {
        return anoIngresso;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}


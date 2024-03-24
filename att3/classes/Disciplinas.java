/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import entidade.Aluno;
import entidade.Professor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Disciplina {
    private String nome;
    private int semestre;
    private String horario;
    private Professor professor;
    private List<Aluno> alunos;

    public Disciplina(String nome, int semestre, String horario) {
        this.nome = nome;
        this.semestre = semestre;
        this.horario = horario;
        this.alunos = new ArrayList<>();
    }
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public Disciplina() {
        this.nome = "";
        this.semestre = 0;
        this.horario = "";
    }
    public Disciplina(Disciplina copia){
        this.nome = copia.getNome();
        this.semestre = copia.getSemestre();
        this.horario = copia.getHorario();
        this.professor = copia.getProfessor(); // Copia do professor
        this.alunos = new ArrayList<>(copia.getAlunos());
    }  
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe:");
        System.out.println("Nome:");
        this.nome = leitor.next();
        System.out.println("Semestre:");
        this.semestre = leitor.nextInt();
        System.out.println("Horario:");
        this.horario = leitor.next();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public String getHorario() {
        return horario;
    }

    public String getNome() {
        return nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + this.semestre;
        hash = 29 * hash + Objects.hashCode(this.horario);
        hash = 29 * hash + Objects.hashCode(this.professor);
        hash = 29 * hash + Objects.hashCode(this.alunos);
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
        final Disciplina other = (Disciplina) obj;
        if (this.semestre != other.semestre) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        if (!Objects.equals(this.professor, other.professor)) {
            return false;
        }
        return Objects.equals(this.alunos, other.alunos);
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome +
                ", semestre=" + semestre +
                ", horario=" + horario +
                ", professor=" + professor +
                ", alunos=" + alunos + '}';
    }
}

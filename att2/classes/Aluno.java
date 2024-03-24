/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Aluno {
    private String nome;
    private String mat;
    private String email;
    private String curso;
    private ArrayList<Telefone> tel;
    
    public Aluno() {
        this.nome = "";
        this.mat = "";
        this.email = "";
        this.curso = "";
        this.tel = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            this.tel.add(new Telefone()); // Add new Telefone objects to the ArrayList
        }
        
    }

    public Aluno(String nome, String mat, String email, String curso) {
        this.nome = nome;
        this.mat = mat;
        this.email = email;
        this.curso = curso;
        this.tel = new ArrayList<>();
    }
    
    public void addTelefone(Telefone tel) {
        this.tel.add(tel);
    }
    
    public void preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.println("--- Informe os dados do aluno ---");
        System.out.print("nome:");
        this.setNome(ler.next());
        System.out.print("Matricula:");
        this.setMat(ler.next());
        System.out.print("email:");
        this.setEmail(ler.next());
        System.out.print("Curso:");
        this.setCurso(ler.next());

        for (int i = 0; i < this.tel.size(); i++) {
            this.tel.get(i).preencher();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Telefone> getTel() {
        return tel;
    }

    public void setTel(ArrayList<Telefone> tel) {
        this.tel = tel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + Objects.hashCode(this.mat);
        hash = 11 * hash + Objects.hashCode(this.email);
        hash = 11 * hash + Objects.hashCode(this.curso);
        hash = 11 * hash + Objects.hashCode(this.tel);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.mat, other.mat)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        return Objects.equals(this.tel, other.tel);
    }

    

    @Override
    public String toString() {
        return "Aluno{" + "nome=" +
                nome + ", mat=" + mat +
                ", email=" + email +
                ", curso=" + curso +
                ", tel=" + tel + '}';
    }
    
    
}

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
public class Livro {
    private String titulo;
    private List<Autor> autores;
    private int anoPublicacao;

    public Livro(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autores = new ArrayList<>();

    }
    
    public Livro() {
        this.titulo = "";
        this.autores = new ArrayList<>();
        this.anoPublicacao = 0;
    }

    @Override
    public String toString() {
        return "Livro{" + 
                "titulo=" + titulo + 
                ", autores=" + autores + 
                ", anoPublicacao=" + anoPublicacao + 
                '}';
    }

    
    public void imprimir(){
        System.out.println(this);
    }
    
    public void adicionarAutor(Autor autor){
        this.autores.add(autor);        
    }
                                                                                
    public void removerAutor(String nomeAutor){
        Autor autor = this.encontrarAutor(nomeAutor);
        this.autores.remove(autor);
    }
    
    public Autor encontrarAutor(String nomeAutor){
        for(Autor autor: this.autores){
            if(autor.getNome().equals(nomeAutor)){
                return autor;
            }
        }
        return null;
    }
    
    public List<Autor> encontrarAutorPelaCidade(String nomeCidade){
        List<Autor> autoresEncontrados = new ArrayList<>();
        
        for(Autor autor: this.autores){
            if(autor.getCidadeNatal().equals(nomeCidade)){
                autoresEncontrados.add(autor);
            }
        }
        
        return autoresEncontrados;
    
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        hash = 89 * hash + Objects.hashCode(this.autores);
        hash = 89 * hash + this.anoPublicacao;
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
        final Livro other = (Livro) obj;
        if (this.anoPublicacao != other.anoPublicacao) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autores, other.autores);
    }
 
}

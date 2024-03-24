/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import classes.Autor;
import classes.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }
    
    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }
    
    public void removerLivro(String titulo){
        Livro livro = this.encontrarLivroPorTitulo(titulo);
        this.livros.remove(livro);
        System.out.println("Livro removido com sucesso!");
    }
    
    public Livro encontrarLivroPorTitulo(String titulo){
        for (Livro livro: this.livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
    
    public Livro encontrarLivroPorAutor(String nomeAutor){
        for (Livro livro: livros) {
            Autor autor = livro.encontrarAutor(nomeAutor);
            
            if(autor != null)
                return livro;
        }
        return null;
    }
    
    public List<Autor> encontrarAutorPelaCidade(String cidade) {
        List<Autor> lstCompletaAutores = new ArrayList<>();
        
        for (Livro livro: livros) {
            //Busco os autores do livro de acordo com a cidade
            List<Autor> lstAutoresEncontrados = livro.encontrarAutorPelaCidade(cidade);
            
            //Adiciono na lista completa
            lstCompletaAutores.addAll(lstAutoresEncontrados);            
        }
        return lstCompletaAutores;
    }
    
    public List<Livro> encontrarTodosLivros() {        
        return this.livros;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
}

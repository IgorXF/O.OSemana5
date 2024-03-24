/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class Artistas {

    private String Nome;
    private List<Albuns> albuns;

    public Artistas() {
        this.Nome = " ";
        this.albuns = new ArrayList<>();
    }

    public Artistas(String Nome, List<Albuns> albuns) {
        this.Nome = Nome;
        this.albuns = albuns;
    }
    
    //Getters And Setters
    
    public String getNome(){
        return this.Nome;
    }
    
    public List<Albuns> getAlbuns(){
        return this.albuns;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public void setAlbuns(List<Albuns> A1){
        this.albuns = A1;
    }

    @Override
    public String toString() {
        return "Artistas{" +
                "Nome=" + Nome +
                ", albuns=" + albuns + '}';
    }
    
    
}


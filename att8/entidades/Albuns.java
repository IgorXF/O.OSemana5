/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author igorxf
 */
public class Albuns {

    private String Nome;
    private int AnoLancamento;
    private List<Musica> musicas;
    
    public Albuns() {
        this.Nome = " ";
        this.AnoLancamento = 0;
        this.musicas = new ArrayList<>();
    }

    public Albuns(String Nome, int AnoLancamento, List<Musica> musicas) {
        this.Nome = Nome;
        this.AnoLancamento = AnoLancamento;
        this.musicas = musicas;
    }
    
    public void Copia(Albuns A1){
        this.Nome = A1.getNome();
        this.AnoLancamento = A1.getAnoLancamento();
        this.musicas = A1.getMusicas();
    }
    
    public void Imprimir(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Albuns{" +
                "Nome=" +Nome +
                ", AnoLancamento=" +AnoLancamento + 
                ", musicas=" + musicas + '}';
    }

    public String getNome(){
        return this.Nome;
    }
    
    public int getAnoLancamento(){
        return this.AnoLancamento;
    }
    
    public List<Musica> getMusicas(){
        return this.musicas;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public void setAnoLancamento(int Ano){
        this.AnoLancamento = Ano;
    }
    
    public void setMusicas(List<Musica> musicas){
        this.musicas = musicas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.Nome);
        hash = 41 * hash + this.AnoLancamento;
        hash = 41 * hash + Objects.hashCode(this.musicas);
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
        final Albuns other = (Albuns) obj;
        if (this.AnoLancamento != other.AnoLancamento) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        return Objects.equals(this.musicas, other.musicas);
    }
    
}

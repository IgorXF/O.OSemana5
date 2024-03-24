/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.Objects;

/**
 *
 * @author igorxf
 */
public class Musica {
    private double Duracao;
    private String Titulo;

    public Musica() {
        this.Duracao = 0.0;
        this.Titulo = " ";
    }
    
    public Musica(double Duracao, String Titulo) {
        this.Duracao = Duracao;
        this.Titulo = Titulo;
    }

    public void Copiar(Musica M1){
        this.Titulo = M1.getTitulo();
        this.Duracao = M1.getDuracao();
    }

    public void Imprimir(){
        System.out.println(this);
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Titulo);
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
        final Musica other = (Musica) obj;
        if (Double.doubleToLongBits(this.Duracao) != Double.doubleToLongBits(other.Duracao)) {
            return false;
        }
        return Objects.equals(this.Titulo, other.Titulo);
    }
    
    public double getDuracao() {
        return Duracao;
    }

    public void setDuracao(double Duracao) {
        this.Duracao = Duracao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "Duracao=" + Duracao +
                ", Titulo=" + Titulo + '}';
    }
    
    
}

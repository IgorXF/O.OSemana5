/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Objects;

/**
 *
 * @author igorxf
 */
public class ContasAPagar {
    private int id;
    private String CodigoDeBarras;
    private double valor;
    
    public ContasAPagar(){
        this.id = 0;
        this.CodigoDeBarras = " ";
        this.valor = 0.0;
    }

    public ContasAPagar(int id, String CodigoDeBarras, double valor) {
        this.id = id;
        this.CodigoDeBarras = CodigoDeBarras;
        this.valor = valor;
    }
    
    public void Imprimir(){
        System.out.println(this);
    }
    
    public void Copiar(ContasAPagar C1){
        this.id = C1.getId();
        this.CodigoDeBarras = C1.getCodigoDeBarras();
        this.valor = C1.getValor();
    }

    @Override
    public String toString() {
        return "ContasAPagar{" +
                "id=" + id +
                ", CodigoDeBarras=" + CodigoDeBarras +
                ", valor=" + valor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.id;
        hash = 11 * hash + Objects.hashCode(this.CodigoDeBarras);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
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
        final ContasAPagar other = (ContasAPagar) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        return Objects.equals(this.CodigoDeBarras, other.CodigoDeBarras);
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoDeBarras() {
        return CodigoDeBarras;
    }

    public void setCodigoDeBarras(String CodigoDeBarras) {
        this.CodigoDeBarras = CodigoDeBarras;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

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
public class ContaB {
    private double saldo;
    private int numero;
    private String nomeBanco;
    private int id;
    
    public ContaB(){
        this.saldo = 0.0;
        this.numero = 0;
        this.nomeBanco = "";
        this.id = 0;
    }
    
    public ContaB(double saldo, int numero, String nomeBanco, int id){
        this.saldo = saldo;
        this.numero = numero;
        this.nomeBanco = nomeBanco;
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public int getId() {
        return id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + 
                "saldo=" + saldo + 
                ", numero=" + numero + 
                ", nomeBanco=" + nomeBanco + 
                ", id=" + id + 
                '}';
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        hash = 67 * hash + this.numero;
        hash = 67 * hash + Objects.hashCode(this.nomeBanco);
        hash = 67 * hash + this.id;
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
        final ContaB other = (ContaB) obj;
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.nomeBanco, other.nomeBanco);
    }
}

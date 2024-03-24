/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Carro {
    private String fabricante;
    private String modelo;
    private double motor;
    private String cor;
    private Roda[] rodas = new Roda[4];

    public Carro() {
        this.fabricante = "";
        this.modelo = "";
        this.motor = 1.0;
        this.cor = "";
        for (int i = 0; i <= 3; i++) {
            this.rodas[i] = new Roda();
        }
    }

    public void preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.println("--- Informe os dados do carro ---");
        System.out.print("Fabricante:");
        this.setFabricante(ler.next());
        System.out.print("Modelo:");
        this.setModelo(ler.next());
        System.out.print("Motor:");
        this.setMotor(ler.nextDouble());
        System.out.print("Cor:");
        this.setCor(ler.next());

        for (int i = 0; i <= 3; i++) {
            this.getRodas()[i].preencher();
        }
    }
    
    public void imprimir(){
        System.out.println("---------------------------------");
        System.out.println("Fabricante:" + this.getFabricante());
        System.out.println("Modelo:"+ this.getModelo());
        System.out.println("Motor:"+ this.getMotor());
        System.out.println("Cor:"+ this.getCor());   
        
        //imprimir cada uma das rodas
        for(int i=0; i <= 3; i++){
            Roda ri = this.getRodas()[i];
            ri.imprimir();
        }
        
        System.out.println("---------------------------------");
    }
    
    public void copiar(Carro outro){
        this.fabricante = outro.getFabricante();
        this.modelo = outro.getModelo();
        this.motor = outro.getMotor();
        this.cor = outro.getCor();
        
        for(int i=0; i<= 3; i++){
            Roda ri = outro.getRodas()[i];
            
            this.rodas[i].copiar(ri);
        }
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Roda[] getRodas() {
        return rodas;
    }

    public void setRodas(Roda[] rodas) {
        this.rodas = rodas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.fabricante);
        hash = 37 * hash + Objects.hashCode(this.modelo);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.motor) ^ (Double.doubleToLongBits(this.motor) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.cor);
        hash = 37 * hash + Arrays.deepHashCode(this.rodas);
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
        final Carro other = (Carro) obj;
        if (Double.doubleToLongBits(this.motor) != Double.doubleToLongBits(other.motor)) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        return Arrays.deepEquals(this.rodas, other.rodas);
    }
    
}

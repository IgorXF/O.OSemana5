/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Roda {
    private double raio;
    private String material;
    private double peso;
    private double suporteMax;
		
    public Roda() {
        this.raio = 0.0;
        this.material = "";
        this.peso = 0.0;
        this.suporteMax = 0.0;
    }

    public void preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.println(" --- Informe os dados da Roda --- ");
        System.out.print("Raio:");
        this.setRaio(ler.nextDouble());
        System.out.print("Material:");
        this.setMaterial(ler.next());
        System.out.print("Peso:");
        this.setPeso(ler.nextDouble());
        System.out.print("SuporteMax:");
        this.setSuporteMax(ler.nextDouble());        
    }
    
    public void imprimir(){
        System.out.println("---------------------------------");
        System.out.println("Raio:" + this.getRaio());
        System.out.println("Material:"+ this.getMaterial());
        System.out.println("Peso:"+ this.getPeso());
        System.out.println("SuporteMax:"+ this.getSuporteMax());  
        System.out.println("---------------------------------");
    }
    
    public void copiar(Roda outra){
        this.raio = outra.getRaio();
        this.material = outra.getMaterial();
        this.peso = outra.getPeso();
        this.suporteMax = outra.getSuporteMax();    
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getSuporteMax() {
        return suporteMax;
    }

    public void setSuporteMax(double suporteMax) {
        this.suporteMax = suporteMax;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.raio) ^ (Double.doubleToLongBits(this.raio) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.material);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.suporteMax) ^ (Double.doubleToLongBits(this.suporteMax) >>> 32));
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
        final Roda other = (Roda) obj;
        if (Double.doubleToLongBits(this.raio) != Double.doubleToLongBits(other.raio)) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (Double.doubleToLongBits(this.suporteMax) != Double.doubleToLongBits(other.suporteMax)) {
            return false;
        }
        return Objects.equals(this.material, other.material);
    }
    
}

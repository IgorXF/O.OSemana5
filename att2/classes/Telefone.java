/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Telefone {
    private String DDD;
    private String num;
    private String descricao;
    private String operadora;

    public Telefone(String DDD, String num, String descricao, String operadora) {
        this.DDD = DDD;
        this.num = num;
        this.descricao = descricao;
        this.operadora = operadora;
    }
    
    public Telefone() {
        this.DDD = "";
        this.num = "";
        this.descricao = "";
        this.operadora = "";
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public void preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.println("--- Informe os dados do telefone ---");
        System.out.print("Informe o ddd");
        this.setDDD(ler.next());
        System.out.print("Num:");
        this.setNum(ler.next());
        System.out.print("Descricao");
        this.setDescricao(ler.next());
        System.out.print("Operadora:");
        this.setOperadora(ler.next());
    }
    
    @Override
    public String toString() {
        return "Telefone{" + "DDD=" + DDD + ", num=" + num + ", descricao=" + descricao + ", operadora=" + operadora + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.DDD);
        hash = 83 * hash + Objects.hashCode(this.num);
        hash = 83 * hash + Objects.hashCode(this.descricao);
        hash = 83 * hash + Objects.hashCode(this.operadora);
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
        final Telefone other = (Telefone) obj;
        if (!Objects.equals(this.DDD, other.DDD)) {
            return false;
        }
        if (!Objects.equals(this.num, other.num)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.operadora, other.operadora);
    }
    
}

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
public class PessoaFisica {
    private String Nome;
    private String email;
    private String CPF;
    private List<ContasAPagar> contas;

    public PessoaFisica(){
        this.Nome = " ";
        this.email = " ";
        this.CPF = " ";
        this.contas = new ArrayList<>();
    }

    public PessoaFisica(String Nome, String email, String CPF) {
        this.Nome = Nome;
        this.email = email;
        this.CPF = CPF;
    }
    
   public PessoaFisica PegaMaiorValor(){
       double Maior = 0.0;
       
       for (int i = 0; i < contas.size(); i++) {
           if (contas.get(i).getValor() > Maior){
               Maior = contas.get(i).getValor();
           }
       }
       
       return this;
   }
    
    public void Copiar(PessoaFisica P1){
        this.Nome = P1.getNome();
        this.email = P1.getEmail();
        this.CPF = P1.getCPF();
        
        this.contas = new ArrayList<>();
        
        for(ContasAPagar C1 : P1.getContas()){
            contas.add(C1);
        }
    }
    
    public void Imprimir(){
        System.out.println(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.Nome);
        hash = 47 * hash + Objects.hashCode(this.email);
        hash = 47 * hash + Objects.hashCode(this.CPF);
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
        final PessoaFisica other = (PessoaFisica) obj;
        return true;
    }
  
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setContas(List<ContasAPagar> contas) {
        this.contas = contas;
    }

    public List<ContasAPagar> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "Nome=" + Nome +
                ", email=" + email +
                ", CPF=" + CPF +
                ", contas=" + contas + '}';
    }
}

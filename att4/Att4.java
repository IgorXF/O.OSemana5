/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package att4;

import classes.ContasAPagar;
import classes.PessoaFisica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Att4 {
    
    public static ContasAPagar Preencher_Conta(){
        Scanner ler = new Scanner(System.in);
        ContasAPagar C1 = new ContasAPagar();
        
        System.out.println("Preencha os dados da conta abaixo.");
        
        System.out.print("\nID: ");
        C1.setId(ler.nextInt());
        
        System.out.print("\nCodigo de Barras: ");
        C1.setCodigoDeBarras(ler.next());
        
        System.out.print("\nValor: ");
        C1.setValor(ler.nextDouble());
        
        return C1;
    }
    
    public static PessoaFisica Preencher_Pessoa(){
        PessoaFisica P1 = new PessoaFisica();
        Scanner ler = new Scanner(System.in);
        ContasAPagar C1;
        
        
        System.out.println("Preencha os dados da pessoa abaixo.");
        
        System.out.println("Nome: ");
        P1.setNome(ler.next());
        
        System.out.println("Email: ");
        P1.setEmail(ler.next());
        
        System.out.println("CPF: ");
        P1.setCPF(ler.next());
        
        System.out.println("Informe as dados das duas contas abaixo.");
        
        for(int i = 0; i < 2; i++){
            C1 = new ContasAPagar();
            System.out.println("Conta 0" +(i+1) +": ");
            C1 = Preencher_Conta();
            P1.getContas().add(C1);
        }
        
        return P1;
    }

    public static void main(String[] args){
        
        List<PessoaFisica> pessoas = new ArrayList<>();
        PessoaFisica MaiorDevedor = new PessoaFisica();
        double MaiorValor = 0.0;
        double SomaDasContas = 0.0;
        
        for(int i = 0; i < 1; i++){
            pessoas.add(Preencher_Pessoa());
        }
        
        for(int i = 0; i < pessoas.size(); i++){
            for(int j = 0; j < 2; j++){
                SomaDasContas += pessoas.get(i).getContas().get(j).getValor();
                if (pessoas.get(i).getContas().get(j).getValor() > MaiorValor){
                    MaiorValor = pessoas.get(i).getContas().get(j).getValor();
                    MaiorDevedor = pessoas.get(i);
                }
            }
        }
        
        System.out.println("O Maior devedor é: ");
        MaiorDevedor.Imprimir();
        
        System.out.println("O total das somas das dividas é: " + SomaDasContas);
    }
}

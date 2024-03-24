/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package att1;

import classes.Proprietario;

/**
 *
 * @author igorxf
 */
public class Att1 {

    public static void  mesmaMarca(Proprietario p1, Proprietario p2){
        for(int i = 0; i < 2; i++){
            if(p1.getCar()[i].getFabricante().equalsIgnoreCase(p2.getCar()[i].getFabricante()))
                System.out.println("E a Mesma Marca.");
            else
                System.out.println("Nao e a mesma marca.");
        } 
    }

    public static void main(String[] args) {
        Proprietario p1 = new Proprietario();
        Proprietario p2 = new Proprietario();
        
        p1.preencher();
        p2.preencher();
        
        mesmaMarca(p1, p2);
    }
    
}

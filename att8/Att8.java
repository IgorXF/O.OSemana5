/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package att7;

import classes.Spotify;
import entidade.Albuns;
import entidade.Artistas;
import entidade.Musica;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Att7 {
 public static Musica Preencher_Musica(){
        
        Musica M1 = new Musica();
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Preencha os dados da música abaixo.");
        
        System.out.print("\nTítulo: ");
        M1.setTitulo(ler.next());
        ler.nextLine();
        
        System.out.print("\nDuração: ");
        M1.setDuracao(ler.nextDouble());
        
        return M1;
    }
    
    public static Albuns Preencher_Album(){
        
        Albuns A1 = new Albuns();
        Musica M1 = new Musica();
        int Quantidade = 0;
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Preencha os dados do album abaixo.");
        
        System.out.print("\nNome: ");
        A1.setNome(ler.next());
        ler.nextLine();
        
        System.out.print("\nAno Lançamento: ");
        A1.setAnoLancamento(ler.nextInt());
        
        System.out.println("\nMe informe quantas musicas serão adicionadas para este artista.");
        
        do{
            System.out.print("\nQuantidade: ");
            Quantidade = ler.nextInt();
            
            if(Quantidade < 0){
                System.out.println("\n-----------------------");
                System.out.println("\n| Quantidade invalida |");
                System.out.println("-----------------------\n");
            }
        }while(Quantidade < 0);
        
        for (int i = 0; i < Quantidade; i++){
             A1.getMusicas().add(Preencher_Musica());
        }
        
        return A1;
    }
    
    public static Artistas Preencher_Artista(){
        Artistas A1 = new Artistas();
        int Quantidade = 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Preencha os Dados Abaixo.");
        
        System.out.print("\nNome do Artista: ");
        A1.setNome(ler.next());
        ler.nextLine();
        
        System.out.println("Me informe quantos albuns serão adicionados.");
        
        do{
            System.out.print("\nQuantidade: ");
            Quantidade = ler.nextInt();
            
            if(Quantidade < 0){
                System.out.println("\n-----------------------");
                System.out.println("\n| Quantidade invalida |");
                System.out.println("-----------------------\n");
            }
        }while(Quantidade < 0);
        
        for (int i = 0; i < Quantidade; i++){
            A1.getAlbuns().add(Preencher_Album());
        }
        
        return A1;
    }
    
    public static Spotify PreencherSpotify(){
        Spotify Gerente = new Spotify();
        int Quantidade = 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Me informe a quantida de artistas a ser inserido.");
        do{
            System.out.print("Quntidade: ");
            Quantidade = ler.nextInt();
            
            if(Quantidade < 0){
                System.out.println("\n-----------------------");
                System.out.println("\n| Quantidade invalida |");
                System.out.println("-----------------------\n");
            }
        }while(Quantidade < 0);
        
        for (int i = 0; i < Quantidade; i++) {
            Gerente.getArtistas().add(Preencher_Artista());
        }
        
        return Gerente;
    }

    public static void main(String[] args) {
        
        Spotify Gerencia = PreencherSpotify();
        Artistas MaiorNumMusica = new Artistas();
        Artistas MaiorNumAlbuns = new Artistas();
        
        MaiorNumMusica = Gerencia.MaiorNumMusica();
        MaiorNumAlbuns = Gerencia.MaiorNumAlbum();
        
        System.out.println("\nArtista com maior Numero de musicas: " + MaiorNumMusica.getNome()); 
        System.out.println("\nArtista com maior Numero de albuns: " + MaiorNumAlbuns.getNome()); 
       
    }
    
}

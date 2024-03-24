/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import entidade.Artistas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class Spotify {
        
    private List<Artistas> artistas;
{
        this.artistas = new ArrayList<>();    
    }
    
    public void Copiar(List<Artistas> A1){
        this.artistas = A1;
    }
    
    public Artistas MaiorNumAlbum(){
        Artistas Maior = new Artistas();
        int MaiorNumAlbum = 0;
        
        for (Artistas A1 : artistas){
            if (A1.getAlbuns().size() > MaiorNumAlbum){
                MaiorNumAlbum = A1.getAlbuns().size();
                Maior = A1;
            }
        }
        return Maior;
    }
    
    public Artistas MaiorNumMusica(){
        Artistas Maior = new Artistas();
        int MaiorNumMusica = 0;
        int SomaMusicas = 0;
        
        for (int i = 0; i < artistas.size(); i++){
            
            SomaMusicas = 0;
            
            for(int j = 0; j < artistas.get(i).getAlbuns().size(); j++){
                SomaMusicas += artistas.get(i).getAlbuns().get(j).getMusicas().size();
            }
            if(SomaMusicas > MaiorNumMusica){
                MaiorNumMusica = SomaMusicas;
                Maior = artistas.get(i);
            }
        }
        return Maior;
    }
    
    public List<Artistas> getArtistas(){
        return this.artistas;
    }
    
    public void setArtista(List<Artistas> A1){
       this.artistas = A1;
    }
    
}


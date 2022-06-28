/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author rodri
 */
public class Tablero {
    
    
    private Espacio espacioJuego[][];

    public Tablero() {
        this.espacioJuego = new Espacio[10][10];
    }
    
     public void insertarEspacio( Espacio espacio, int i,int j){
     
     
         this.espacioJuego[i][j]=espacio;
     
     
     }
    
  
    
    
    
    
    
    
}

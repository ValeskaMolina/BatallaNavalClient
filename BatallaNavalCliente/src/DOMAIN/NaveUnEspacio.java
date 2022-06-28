/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import Domain.Espacio;
import Domain.Nave;
import java.awt.Graphics;

/**
 *
 * @author rodri
 */
public class NaveUnEspacio extends Nave{
    
    
    Espacio unEspacio;
    
    
    public NaveUnEspacio(int tipo, String rutaImagen,Espacio espacio){
    
        super(tipo, rutaImagen);
        this.unEspacio=espacio;
    
    
    }

    @Override
    public void dibujar(Graphics g) {
        
    }
    
    
       @Override
    public void run() {
        
        
    }
    
}

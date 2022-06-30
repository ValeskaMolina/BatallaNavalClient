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

    public Espacio getUnEspacio() {
        return unEspacio;
    }

    public void setUnEspacio(Espacio unEspacio) {
        this.unEspacio = unEspacio;
    }
    
    
    
    
    
    public NaveUnEspacio(int tipo,Espacio espacio){
    
        super(tipo);
        this.unEspacio=espacio;
    
    
    }

    @Override
    public void dibujar(Graphics g) {
        
    }
    
    
       @Override
    public void run() {
        
        
    }
    
}

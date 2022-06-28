/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author rodri
 */
public abstract class Nave extends Thread{
    
    
     protected int tipo;
     protected String imagenActual;

    public Nave(int tipo, String imagenActual) {
        this.tipo = tipo;
        this.imagenActual = imagenActual;
    }
     
    public abstract void dibujar(Graphics g);
    
    
     


     
    
    
    
}

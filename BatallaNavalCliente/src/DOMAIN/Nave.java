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

   

    public Nave(int tipo) {
        this.tipo = tipo;
        this.imagenActual = "";
    }
    
     public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
     protected int i;
     protected int j;
     
    public abstract void dibujar(Graphics g);
    
    
     


     
    
    
    
}

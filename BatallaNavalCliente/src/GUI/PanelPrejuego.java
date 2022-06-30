/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DOMAIN.Partida;
import Domain.Espacio;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author rodri
 */
public class PanelPrejuego extends JPanel implements MouseListener  {
    
    
    private Partida partida;
    private int totalBarcos;

   
    private VentanaPrejuego ventana;
    
    
    
    public PanelPrejuego(int cantidadBarcos,VentanaPrejuego ventana) throws IOException{
    
      
        setFocusable(true);
        requestFocus();
        addMouseListener(this);
        this.ventana=ventana;
        this.partida= Partida.getInstance();
        this.partida.setCantidadBarcos(cantidadBarcos);
        this.totalBarcos=0;
        llenarTableroJugador();
       
        
    
    
    
    }
    
      private void llenarTableroJugador(){
      
      
          this.partida.llenarTableroJugador1();
      
      }
    
    
    
    
     @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); 
        
         Espacio espacio [][] =this.partida.getTableroJugador1().getEspacioJuego();
        
        for(int i=0; i < this.partida.getTableroJugador1().getEspacioJuego().length; i++)
            for(int j=0; j < this.partida.getTableroJugador1().getEspacioJuego().length; j++)
                try {
                    espacio[i][j].draw(g);
                    //
            } catch (IOException ex) {
                Logger.getLogger(PanelPrejuego.class.getName()).log(Level.SEVERE, null, ex);
            }
         
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        
        
      if(this.totalBarcos<this.partida.getCantidadBarcos()){
          
      
          
          String forma=this.ventana.getTipoForma().getSelectedItem().toString();
        
       
         Espacio espacio [][] =this.partida.getTableroJugador1().getEspacioJuego();
        
         for(int i=0; i <  this.partida.getTableroJugador1().getEspacioJuego().length; i++){
            for(int j=0; j < this.partida.getTableroJugador1().getEspacioJuego().length; j++){
                
                Espacio temp = espacio[i][j];
                //valida que no se cambie imagen si ya antes fue tocado
               if( !temp.isTocado()&&temp.mousePresionadoPreJuego(e.getX(), e.getY(),forma)){
                   
                   
                   // añade los barcos que van a jugar
                   this.partida.getJugador1().setNave(temp);
                   this.totalBarcos=this.totalBarcos+1;
                   
                   
                   espacio[i][j]=temp;
                   
               }
                
                  
            }
        
        }
        repaint();
      
      }else{
      
          this.ventana.mostrarMsj();
      
      }
        
        
        
        
        
    }
    
     public int getTotalBarcos() {
        return totalBarcos;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
    }
    
    
    
    
}

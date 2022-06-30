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
public class PanelJuegoJugador2 extends JPanel implements MouseListener  {
    
    
    private Partida partida;
    private int totalBarcos;

   
    private VenatanaJuego ventana;
    
    
    
    public PanelJuegoJugador2(VenatanaJuego ventana) throws IOException{
    
      
        setFocusable(true);
        requestFocus();
        addMouseListener(this);
        this.ventana=ventana;
        this.partida= Partida.getInstance();
        
       
        
    
    
    
    }
    
    
    
    
    
    
     @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); 
        
         Espacio espacio [][] =this.partida.getTableroJugador2().getEspacioJuego();
        
        for(int i=0; i < this.partida.getTableroJugador2().getEspacioJuego().length; i++)
            for(int j=0; j < this.partida.getTableroJugador2().getEspacioJuego().length; j++)
                try {
                    espacio[i][j].draw(g);
                    //
            } catch (IOException ex) {
                Logger.getLogger(PanelPrejuego.class.getName()).log(Level.SEVERE, null, ex);
            }
         
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        
        
     
           if(this.partida.getTurno()==1 && this.partida.isContinuo()){
        
        
                Espacio espacio [][] =this.partida.getTableroJugador2().getEspacioJuego();
        
         for(int i=0; i <  this.partida.getTableroJugador2().getEspacioJuego().length; i++){
            for(int j=0; j < this.partida.getTableroJugador2().getEspacioJuego().length; j++){
                
                Espacio temp = espacio[i][j];
                //valida que no se cambie imagen si ya antes fue tocado
               if(temp.tocaronEspacio(e.getX(), e.getY())){
                   
                   
                   if(!temp.isExplotado()){
                       
                    
                   
                       if(temp.getTipo()==4){
                           
                           espacio[i][j].setExplotado(true);
                           espacio[i][j].setOculto(false);
                           
                          
                           
                           this.partida.getTableroJugador2().getEspacioJuego()[i][j]=espacio[i][j];
                           this.partida.getEstadisticaJugador1().setCantidadAciertos(1);
                           this.partida.sonidoGanar();
                           this.partida.setTurno(2);
                           this.ventana.setTurno("Computadora");
                          
                       
                       
                       
                       }
                       
                       if(temp.getTipo()==1){
                           
                           espacio[i][j].setExplotado(true);
                           espacio[i][j].setTipo(3);
                         this.partida.getTableroJugador2().getEspacioJuego()[i][j]=espacio[i][j];
                         this.partida.getEstadisticaJugador1().setCantidadFallos(1);
                         this.partida.sonidoFallido();
                         this.partida.setTurno(2);
                         this.ventana.setTurno("Computadora");
                     
                          
                       
                       
                       
                       }
                       
                       
                   
                   }
                   
                   
                   
                   
                   
                   espacio[i][j]=temp;
                   
               }
                
                  
            }
        
        }
        repaint();
            
        
        
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
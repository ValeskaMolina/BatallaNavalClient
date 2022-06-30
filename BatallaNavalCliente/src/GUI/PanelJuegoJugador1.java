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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rodri
 */
public class PanelJuegoJugador1 extends JPanel implements MouseListener,Runnable  {
    
    
    private Partida partida;
    private int totalBarcos;

   
    private VenatanaJuego ventana;
     private int FPS = 60;
    private long tiempo = 1000 / FPS;
    private Thread hilo;
    private boolean ejecutando;
    private long espera;
    
    
    
    public PanelJuegoJugador1(VenatanaJuego ventana) throws IOException{
    
      
        setFocusable(true);
        requestFocus();
        addMouseListener(this);
        this.ventana=ventana;
        this.partida= Partida.getInstance();
         
       
        
    
    
    
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
    
    
    @Override
    public void addNotify() {
        super.addNotify();
        if (hilo == null) {
            hilo = new Thread(this);
            this.ejecutando = true;

            hilo.start();

        }

    }

    @Override
    public void run() {
        
        
        System.out.println("entre run");
        while (ejecutando) {
            
            
            
            if(this.partida.getEstadisticaJugador1().getCantidadAciertos()== this.partida.getCantidadBarcos()){
            
              long duracion= (this.partida.tiempoFinal()-this.partida.getTiempoInicial());
              this.partida.getEstadisticaJugador1().setMinutosDuroPartida(duracion);
                 
                JOptionPane.showMessageDialog(null, "Ganaste felicidades. " +"\n"+"Nombre: "+this.partida.getEstadisticaJugador1().getNombreJugador()
                +"\n"+" Duracion: "+this.partida.getEstadisticaJugador1().getMinutosDuroPartida()
                +"\n"+"Cantidad de aciertos: "+this.partida.getEstadisticaJugador1().getCantidadAciertos()
                +"\n"+"Cantidad de fallos: "+this.partida.getEstadisticaJugador1().getCantidadFallos()
                +"\n"+"Total de jugadas: "+this.partida.getEstadisticaJugador1().getTotalJugadas());
                this.ejecutando=false;
                this.ventana.cerrarVentana();
            
            
            
            }else if( this.partida.getAciertoComputadora()==this.partida.getCantidadBarcos()){
        
                JOptionPane.showMessageDialog(null, "Gano la computadora, intenta de nuevo. " +"\n"+"Nombre: "+this.partida.getEstadisticaJugador1().getNombreJugador()
                +"\n"+" Duracion: "+this.partida.getEstadisticaJugador1().getMinutosDuroPartida()
                +"\n"+"Cantidad de aciertos: "+this.partida.getEstadisticaJugador1().getCantidadAciertos()
                +"\n"+"Cantidad de fallos: "+this.partida.getEstadisticaJugador1().getCantidadFallos()
                +"\n"+"Total de jugadas: "+this.partida.getEstadisticaJugador1().getTotalJugadas());
                 this.ejecutando=false;
                 this.ventana.cerrarVentana();
        
        
        
        }else{
            
                if(this.partida.getTurno()==2){
                    System.out.println("Soy turno 2");
             
             
                 try {
                     Thread.sleep(1000);
                     
                     
                     this.ventana.setTurno("Computadora");
                     
                     this.partida.turnoComputadora();
                     
                     repaint();
                     this.partida.setTurno(1);
                     this.ventana.setTurno(this.partida.getJugador1().getNombre());
                     
                     
                 } catch (InterruptedException ex) {
                     Logger.getLogger(PanelJuegoJugador1.class.getName()).log(Level.SEVERE, null, ex);
                 }
                   
             
             
             }
            
            
            }
        
             
       
        
        
        
        
        }

        
        
        
        
        
        
    }//run
    
    
    
    
}//clase
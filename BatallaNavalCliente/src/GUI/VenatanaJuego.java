/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DOMAIN.Partida;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author rodri
 */
public class VenatanaJuego extends JFrame implements ActionListener{
    
    
    private PanelJuegoJugador1 jugador1;
    private PanelJuegoJugador2 jugadorComputadora; 
    private JLabel nombrePartida;
    private JLabel turno;

  
    private JButton guardar;
    private Partida partida;
    private JLabel nombreJugador,computadora;
    
    
    public VenatanaJuego() throws IOException{
    
    
        
        init();
    
    }
      public JLabel getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        
        String msj="Turno de: "+turno;
        this.turno.setText(msj);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    private void init() throws IOException {
       
        
        setTitle("BATALLA NAVAL");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(100,10);
        setSize(1400,700);
        setLayout(null);
        getContentPane().setBackground(new Color(29, 90, 112));
        this.partida=Partida.getInstance();
        this.partida.setTiempoInicial(this.partida.tiempoInicial());
        
        
        this.nombrePartida= new JLabel("BATALLA NAVAL");
        this.nombrePartida.setBounds(410, 10,270, 30);
        this.nombrePartida.setForeground(Color.WHITE);
        this.nombrePartida.setBackground(new Color(29, 87, 112));
        this.nombrePartida.setFont(new Font("Monospaced", Font.BOLD, 20));
        this.nombrePartida.setOpaque(true);
        String nombre=this.partida.getJugador1().getNombre();
        this.nombreJugador= new JLabel(nombre);
        this.nombreJugador.setBounds(295, 40,270, 20);
        this.nombreJugador.setForeground(Color.WHITE);
        this.nombreJugador.setBackground(new Color(29, 87, 112));
        this.nombreJugador.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.nombreJugador.setOpaque(true);
        
        
        jugador1 = new PanelJuegoJugador1(this);
        jugador1.setBounds(10, 70, 600, 500);
        jugador1.setLayout(null);  
        jugador1.setBackground(new Color(29, 90, 112));
        
      
        
        
        jugadorComputadora = new PanelJuegoJugador2(this);
        jugadorComputadora.setBounds(650, 70, 600, 500);
        jugadorComputadora.setLayout(null);  
        jugadorComputadora.setBackground(new Color(29, 90, 112));
        
        
          
        this.computadora= new JLabel("Computadora");
        this.computadora.setBounds(890, 40,270, 20);
        this.computadora.setForeground(Color.WHITE);
        this.computadora.setBackground(new Color(29, 87, 112));
        this.computadora.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.computadora.setOpaque(true);
        
        
        this.guardar = new JButton("Guardar");
        this.guardar.setBounds(80, 605, 180, 70);
        this.guardar.addActionListener(this);
        this.guardar.setBackground(new Color(49, 147, 189));
        this.guardar.setForeground(Color.WHITE);
        this.guardar.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.guardar.setOpaque(true);
        
        
        this.turno= new JLabel("Turno:"+this.partida.getJugador1().getNombre());
        this.turno.setBounds(280, 610,270, 30);
        this.turno.setForeground(Color.WHITE);
        this.turno.setBackground(new Color(29, 90, 112));
        this.turno.setFont(new Font("Monospaced", Font.BOLD, 20));
        this.turno.setOpaque(true);
        
        
        
        
       add(this.nombrePartida);
       add(this.nombreJugador);
       add(this.jugador1);
       add(this.jugadorComputadora);
       add(this.computadora);
       add(this.guardar);
       add(this.turno);
       
       
        
        
        
        
        
        
        
        
        
    }
    
    
    public void cerrarVentana(){
    
    
        this.dispose();
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}

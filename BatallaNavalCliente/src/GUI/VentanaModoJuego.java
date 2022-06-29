/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author rodri
 */
public class VentanaModoJuego  extends JFrame implements ActionListener{
    
     private JLabel lblIp;
    private JButton btnComputadora,btnJugador;
    
    public VentanaModoJuego(){
    
        init();
    
    
    }
    
    private void init(){
    
        setTitle("Eleccion Modo Juego Batalla Naval");
        setSize(420, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(29, 90, 112));
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        
        this.lblIp= new JLabel("Nuevo Juego");
        this.lblIp.setBounds(110, 40,270, 30);
        this.lblIp.setForeground(Color.WHITE);
        this.lblIp.setBackground(new Color(29, 90, 112));
        this.lblIp.setFont(new Font("Monospaced", Font.BOLD, 20));
        this.lblIp.setOpaque(true);
        
        
        
        this.btnComputadora = new JButton("VS COMPUTADOR");
        this.btnComputadora.setBounds(120, 100, 200, 50);
        this.btnComputadora.addActionListener(this);
        this.btnComputadora.setBackground(new Color(49, 147, 189));
        this.btnComputadora.setForeground(Color.WHITE);
        this.btnComputadora.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.btnComputadora.setOpaque(true);
        
        
        this.btnJugador = new JButton(" VS JUGADOR");
        this.btnJugador.setBounds(120, 200, 200, 50);
        this.btnJugador.addActionListener(this);
        this.btnJugador.setBackground(new Color(49, 147, 189));
        this.btnJugador.setForeground(Color.WHITE);
        this.btnJugador.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.btnJugador.setOpaque(true);
        
        
        
        
        
        add(this.lblIp);
        add(this.btnComputadora);
        add(this.btnJugador);
        
        
    
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.btnComputadora) {
            
            
           VentanaConfiguracionInicial ventana;
            try {
                ventana = new VentanaConfiguracionInicial();
                 ventana.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(VentanaModoJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
          
           this.dispose();

        
       
        }
        
        if (e.getSource() == this.btnJugador) {
            
            VentanaPartida partida;
            try {
                partida = new VentanaPartida();
                 partida.setVisible(true);
                 this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(VentanaModoJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
            
           
    
        }
    }
}
